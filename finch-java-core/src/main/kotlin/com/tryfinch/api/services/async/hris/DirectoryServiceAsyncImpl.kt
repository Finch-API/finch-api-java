package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.HriDirectoryListIndividualsPageAsync
import com.tryfinch.api.models.HriDirectoryListIndividualsParams
import com.tryfinch.api.services.errorHandler
import com.tryfinch.api.services.jsonHandler
import com.tryfinch.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class DirectoryServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : DirectoryServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val listIndividualsHandler: Handler<HriDirectoryListIndividualsPageAsync.Response> =
        jsonHandler<HriDirectoryListIndividualsPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Read company directory and organization structure */
    override fun listIndividuals(
        params: HriDirectoryListIndividualsParams,
        requestOptions: RequestOptions
    ): CompletableFuture<HriDirectoryListIndividualsPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "directory")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { listIndividualsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { HriDirectoryListIndividualsPageAsync.of(this, params, it) }
        }
    }
}
