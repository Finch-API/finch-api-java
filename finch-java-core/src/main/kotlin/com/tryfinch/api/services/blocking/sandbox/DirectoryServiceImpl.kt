// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.core.http.json
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepare
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.SandboxDirectoryCreateParams

class DirectoryServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : DirectoryService {

    private val withRawResponse: DirectoryService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): DirectoryService.WithRawResponse = withRawResponse

    override fun create(params: SandboxDirectoryCreateParams, requestOptions: RequestOptions): List<JsonValue> =
        // post /sandbox/directory
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : DirectoryService.WithRawResponse {

        private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<List<JsonValue>> = jsonHandler<List<JsonValue>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(params: SandboxDirectoryCreateParams, requestOptions: RequestOptions): HttpResponseFor<List<JsonValue>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("sandbox", "directory")
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  createHandler.handle(it)
              }
          }
        }
    }
}
