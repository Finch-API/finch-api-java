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
import com.tryfinch.api.core.json
import com.tryfinch.api.core.prepare
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.SandboxDirectoryCreateParams

class DirectoryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DirectoryService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<List<JsonValue>> =
        jsonHandler<List<JsonValue>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Add new individuals to a sandbox company */
    override fun create(
        params: SandboxDirectoryCreateParams,
        requestOptions: RequestOptions,
    ): List<JsonValue> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("sandbox", "directory")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response.use { createHandler.handle(it) }
    }
}
