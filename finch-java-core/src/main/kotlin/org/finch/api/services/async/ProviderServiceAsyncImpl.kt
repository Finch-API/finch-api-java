package org.finch.api.services.async

import java.util.concurrent.CompletableFuture
import org.finch.api.core.ClientOptions
import org.finch.api.core.RequestOptions
import org.finch.api.core.http.HttpMethod
import org.finch.api.core.http.HttpRequest
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.models.Provider
import org.finch.api.models.ProviderListPageAsync
import org.finch.api.models.ProviderListParams
import org.finch.api.services.errorHandler
import org.finch.api.services.jsonHandler
import org.finch.api.services.withErrorHandler

class ProviderServiceAsyncImpl
constructor(
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
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { listHandler.handle(it) }
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
