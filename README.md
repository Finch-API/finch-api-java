# Finch Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.tryfinch.api/finch-java)](https://central.sonatype.com/artifact/com.tryfinch.api/finch-java/0.1.0)

<!-- x-release-please-end -->

The Finch Java SDK provides convenient access to the Finch REST API from applications written in Java. It includes helper classes with helpful types and documentation for every request and response property.

This package is currently in beta (pre-v1.0.0). We expect some breaking changes to rarely-used areas of the SDK, and appreciate your [feedback](https://www.github.com/Finch-API/finch-api-java/issues).

The Finch Java SDK is similar to the Finch Kotlin SDK but with minor differences that make it more ergonomic for use in Java, such as `Optional` instead of nullable values, `Stream` instead of `Sequence`, and `CompletableFuture` instead of suspend functions.

## Documentation

The API documentation can be found [here](https://developer.tryfinch.com/).

---

## Getting started

### Install dependencies

#### Gradle

<!-- x-release-please-start-version -->

```kotlin
implementation("com.tryfinch.api:finch-java:0.1.0")
```

#### Maven

```xml
<dependency>
    <groupId>com.tryfinch.api</groupId>
    <artifactId>finch-java</artifactId>
    <version>0.1.0</version>
</dependency>
```

<!-- x-release-please-end -->

### Configure the client

Use `FinchOkHttpClient.builder()` to configure the client. At a minimum you need to set `.accessToken()`:

```java
import com.tryfinch.api.client.FinchClient;
import com.tryfinch.api.client.okhttp.FinchOkHttpClient;

FinchClient client = FinchOkHttpClient.builder()
    .accessToken("<your Access Token>")
    .build();
```

Alternately, use `FinchOkHttpClient.fromEnv()` to read client arguments from environment variables:

```java
FinchClient client = FinchOkHttpClient.fromEnv();

// Note: you can also call fromEnv() from the client builder, for example if you need to set additional properties
FinchClient client = FinchOkHttpClient.builder()
    .fromEnv()
    // ... set properties on the builder
    .build();
```

| Property | Environment variable      | Required | Default value |
| -------- | ------------------------- | -------- | ------------- |
| clientId | `FINCH_CLIENT_ID` | false | — |
| clientSecret | `FINCH_CLIENT_SECRET` | false | — |

Read the documentation for more configuration options.

---

### Example: creating a resource

To create a new hris directory, first use the `HrisDirectoryListIndividualsParams` builder to specify attributes,
then pass that to the `listIndividuals` method of the `directory` service.

```java
import com.tryfinch.api.models.HrisDirectoryListIndividualsPage;
import com.tryfinch.api.models.HrisDirectoryListIndividualsParams;
import com.tryfinch.api.models.Page;

HrisDirectoryListIndividualsParams params = HrisDirectoryListIndividualsParams.builder().build();
HrisDirectoryListIndividualsPage hrisDirectory = client.directory().listIndividuals(params);
```

### Example: listing resources

The Finch API provides a `list` method to get a paginated list of ats jobs.
You can retrieve the first page by:

```java
import com.tryfinch.api.models.Job;
import com.tryfinch.api.models.Page;

AtsJobListPage page = client.jobs().list();
for (Job atsJob : page.jobs()) {
    System.out.println(atsJob);
}
```

See [Pagination](#pagination) below for more information on transparently working with lists of objects without worrying about fetching each page.

---









## Requests

### Parameters and bodies

To make a request to the Finch API, you generally build an instance of the appropriate `Params` class.

In [Example: creating a resource](#example-creating-a-resource) above, we used the `HrisDirectoryListIndividualsParams.builder()` to pass to
the `listIndividuals` method of the `directory` service.

Sometimes, the API may support other properties that are not yet supported in the Java SDK types. In that case,
you can attach them using the `putAdditionalProperty` method.

```java
HrisDirectoryListIndividualsParams params = HrisDirectoryListIndividualsParams.builder()
    // ... normal properties
    .putAdditionalProperty("secret_param", "4242")
    .build();
```

## Responses

### Response validation

When receiving a response, the Finch Java SDK will deserialize it into instances of the typed model classes. In rare cases, the API may return a response property that doesn't match the expected Java type. If you directly access the mistaken property, the SDK will throw an unchecked `FinchInvalidDataException` at runtime. If you would prefer to check in advance that that response is completely well-typed, call `.validate()` on the returned model.

```java
HrisDirectoryListIndividualsPage hrisDirectory = client.directory().listIndividuals().validate();
```



### Response properties as JSON

In rare cases, you may want to access the underlying JSON value for a response property rather than using the typed version provided by
this SDK. Each model property has a corresponding JSON version, with an underscore before the method name, which returns a `JsonField` value.

```java
JsonField field = responseObj._field();

if (field.isMissing()) {
  // Value was not specified in the JSON response
} else if (field.isNull()) {
  // Value was provided as a literal null
} else {
  // See if value was provided as a string
  Optional<String> jsonString = field.asString();

  // If the value given by the API did not match the shape that the SDK expects
  // you can deserialise into a custom type
  MyClass myObj = responseObj._field().asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Additional model properties

Sometimes, the server response may include additional properties that are not yet available in this library's types. You can access them using the model's `_additionalProperties` method:

```java
JsonValue secret = hrisDirectory._additionalProperties().get("secret_field");
```


---

## Pagination

For methods that return a paginated list of results, this library provides convenient ways access
the results either one page at a time, or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, you can use `autoPager`,
which automatically handles fetching more pages for you:

### Synchronous

```java
// As an Iterable:
AtsJobListPage page = client.jobs().list(params);
for (Job atsJob : page.autoPager()) {
    System.out.println(atsJob);
};

// As a Stream:
client.jobs().list(params).autoPager().stream()
    .limit(50)
    .forEach(atsJob -> System.out.println(atsJob));
```

### Asynchronous

```java
// Using forEach, which returns CompletableFuture<Void>:
asyncClient.jobs().list(params).autoPager()
    .forEach(atsJob -> System.out.println(atsJob), executor);
```

### Manual pagination

If none of the above helpers meet your needs, you can also manually request pages one-by-one.
A page of results has a `data()` method to fetch the list of objects, as well as top-level
`response` and other methods to fetch top-level data about the page. It also has methods
`hasNextPage`, `getNextPage`, and `getNextPageParams` methods to help with pagination.

```java
AtsJobListPage page = client.jobs().list(params);
while (page != null) {
    for (Job atsJob : page.jobs()) {
        System.out.println(atsJob);
    }

    page = page.getNextPage().orElse(null);
}
```

---



## Error handling

This library throws exceptions in a single hierarchy for easy handling:

- **`FinchException`** - Base exception for all exceptions

  - **`FinchServiceException`** - HTTP errors with a well-formed response body we were able to parse. The exception message and the `.debuggingRequestId()` will be set by the server.

    | 400    | BadRequestException           |
    | ------ | ----------------------------- |
    | 401    | AuthenticationException       |
    | 403    | PermissionDeniedException     |
    | 404    | NotFoundException             |
    | 422    | UnprocessableEntityException  |
    | 429    | RateLimitException            |
    | 5xx    | InternalServerException       |
    | others | UnexpectedStatusCodeException |

  - **`FinchIoException`** - I/O networking errors
  - **`FinchInvalidDataException`** - any other exceptions on the client side, e.g.:
    - We failed to serialize the request body
    - We failed to parse the response body (has access to response code and body)

## Network options

### Retries
Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default.
You can provide a `maxRetries` on the client builder to configure this:
```java
FinchClient client = FinchOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```
### Timeouts
Requests time out after 60 seconds by default. You can configure this on the client builder:
```java
FinchClient client = FinchOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```
### Proxies
Requests can be routed through a proxy. You can configure this on the client builder:
```java
FinchClient client = FinchOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
        Type.HTTP,
        new InetSocketAddress("proxy.com", 8080)
    ))
    .build();
```
