// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.prepareAsync
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.Provider
import com.tryfinch.api.models.ProviderListPageAsync
import com.tryfinch.api.models.ProviderListParams
import java.util.concurrent.CompletableFuture

class ProviderServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ProviderServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<List<Provider>> =
        jsonHandler<List<Provider>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Return details on all available payroll and HR systems. */
    override fun list(
        params: ProviderListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ProviderListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("providers")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            forEach { it.validate() }
                        }
                    }
                    .let { ProviderListPageAsync.Response.Builder().items(it).build() }
                    .let { ProviderListPageAsync.of(this, params, it) }
            }
    }
}
