# Finch Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.tryfinch.api/finch-java)](https://central.sonatype.com/artifact/com.tryfinch.api/finch-java/1.2.1)

<!-- x-release-please-end -->

The Finch Java SDK provides convenient access to the Finch REST API from applications written in Java. It includes helper classes with helpful types and documentation for every request and response property.

The Finch Java SDK is similar to the Finch Kotlin SDK but with minor differences that make it more ergonomic for use in Java, such as `Optional` instead of nullable values, `Stream` instead of `Sequence`, and `CompletableFuture` instead of suspend functions.

It is generated with [Stainless](https://www.stainlessapi.com/).

## Documentation

The REST API documentation can be found [in the Finch Documentation Center](https://developer.tryfinch.com/).

---

## Getting started

### Install dependencies

#### Gradle

<!-- x-release-please-start-version -->

```kotlin
implementation("com.tryfinch.api:finch-java:1.2.1")
```

#### Maven

```xml
<dependency>
    <groupId>com.tryfinch.api</groupId>
    <artifactId>finch-java</artifactId>
    <version>1.2.1</version>
</dependency>
```

<!-- x-release-please-end -->

### Configure the client

Use `FinchOkHttpClient.builder()` to configure the client.

Alternately, set the environment with `FINCH_CLIENT_ID`, `FINCH_CLIENT_SECRET`, `FINCH_SANDBOX_CLIENT_ID`, `FINCH_SANDBOX_CLIENT_SECRET` or `FINCH_WEBHOOK_SECRET`, and use `FinchOkHttpClient.fromEnv()` to read from the environment.

```java
FinchClient client = FinchOkHttpClient.fromEnv();

// Note: you can also call fromEnv() from the client builder, for example if you need to set additional properties
FinchClient client = FinchOkHttpClient.builder()
    .fromEnv()
    // ... set properties on the builder
    .build();
```

| Property            | Environment variable          | Required | Default value |
| ------------------- | ----------------------------- | -------- | ------------- |
| clientId            | `FINCH_CLIENT_ID`             | false    | —             |
| clientSecret        | `FINCH_CLIENT_SECRET`         | false    | —             |
| sandboxClientId     | `FINCH_SANDBOX_CLIENT_ID`     | false    | —             |
| sandboxClientSecret | `FINCH_SANDBOX_CLIENT_SECRET` | false    | —             |
| webhookSecret       | `FINCH_WEBHOOK_SECRET`        | false    | —             |

Read the documentation for more configuration options.

---

### Example: creating a resource

To create a new hris directory, first use the `HrisDirectoryListParams` builder to specify attributes,
then pass that to the `list` method of the `directory` service.

```java
import com.tryfinch.api.models.HrisDirectoryListPage;
import com.tryfinch.api.models.HrisDirectoryListParams;
import com.tryfinch.api.models.Page;

HrisDirectoryListParams params = HrisDirectoryListParams.builder()
    .candidateId("<candidate id>")
    .build();
HrisDirectoryListPage page = client.hris().directory().list(params);
```

### Example: listing resources

The Finch API provides a `list` method to get a paginated list of directory.
You can retrieve the first page by:

```java
import com.tryfinch.api.models.IndividualInDirectory;
import com.tryfinch.api.models.Page;

HrisDirectoryListPage page = client.hris().directory().list();
for (IndividualInDirectory directory : page.individuals()) {
    System.out.println(directory);
}
```

See [Pagination](#pagination) below for more information on transparently working with lists of objects without worrying about fetching each page.

---

## Requests

### Parameters and bodies

To make a request to the Finch API, you generally build an instance of the appropriate `Params` class.

In [Example: creating a resource](#example-creating-a-resource) above, we used the `HrisDirectoryListParams.builder()` to pass to
the `list` method of the `directory` service.

Sometimes, the API may support other properties that are not yet supported in the Java SDK types. In that case,
you can attach them using the `putAdditionalProperty` method.

```java
import com.tryfinch.api.models.core.JsonValue;
HrisDirectoryListParams params = HrisDirectoryListParams.builder()
    // ... normal properties
    .putAdditionalProperty("secret_param", JsonValue.from("4242"))
    .build();
```

## Responses

### Response validation

When receiving a response, the Finch Java SDK will deserialize it into instances of the typed model classes. In rare cases, the API may return a response property that doesn't match the expected Java type. If you directly access the mistaken property, the SDK will throw an unchecked `FinchInvalidDataException` at runtime. If you would prefer to check in advance that that response is completely well-typed, call `.validate()` on the returned model.

```java
HrisDirectoryListPage page = client.hris().directory().list().validate();
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
JsonValue secret = page._additionalProperties().get("secret_field");
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
HrisDirectoryListPage page = client.hris().directory().list(params);
for (IndividualInDirectory directory : page.autoPager()) {
    System.out.println(directory);
};

// As a Stream:
client.hris().directory().list(params).autoPager().stream()
    .limit(50)
    .forEach(directory -> System.out.println(directory));
```

### Asynchronous

```java
// Using forEach, which returns CompletableFuture<Void>:
asyncClient.hris().directory().list(params).autoPager()
    .forEach(directory -> System.out.println(directory), executor);
```

### Manual pagination

If none of the above helpers meet your needs, you can also manually request pages one-by-one.
A page of results has a `data()` method to fetch the list of objects, as well as top-level
`response` and other methods to fetch top-level data about the page. It also has methods
`hasNextPage`, `getNextPage`, and `getNextPageParams` methods to help with pagination.

```java
HrisDirectoryListPage page = client.hris().directory().list(params);
while (page != null) {
    for (IndividualInDirectory directory : page.individuals()) {
        System.out.println(directory);
    }

    page = page.getNextPage().orElse(null);
}
```

---

---

## Webhook Verification

We provide helper methods for verifying that a webhook request came from Finch, and not a malicious third party.

You can use `finch.webhooks().verifySignature(body, headers, secret?)` or `finch.webhooks().unwrap(body, headers, secret?)`,
both of which will raise an error if the signature is invalid.

Note that the "body" parameter must be the raw JSON string sent from the server (do not parse it first).
The `.unwrap()` method can parse this JSON for you.

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

Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 408 Request Timeout, 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default.
You can provide a `maxRetries` on the client builder to configure this:

```java
FinchClient client = FinchOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default. You can configure this on the client builder:

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

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals)_.
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/Finch-API/finch-api-java/issues) with questions, bugs, or suggestions.

## Requirements

This library requires Java 8 or later.
