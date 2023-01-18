package org.finch.api.services.async.hris

import java.util.concurrent.CompletableFuture
import org.finch.api.core.ClientOptions
import org.finch.api.core.RequestOptions
import org.finch.api.core.http.HttpMethod
import org.finch.api.core.http.HttpRequest
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.models.HrisDirectoryListIndividualsPageAsync
import org.finch.api.models.HrisDirectoryListIndividualsParams
import org.finch.api.services.errorHandler
import org.finch.api.services.jsonHandler
import org.finch.api.services.withErrorHandler

class DirectoryServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : DirectoryServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val listIndividualsHandler: Handler<HrisDirectoryListIndividualsPageAsync.Response> =
        jsonHandler<HrisDirectoryListIndividualsPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Read company directory and organization structure */
    override fun listIndividuals(
        params: HrisDirectoryListIndividualsParams,
        requestOptions: RequestOptions
    ): CompletableFuture<HrisDirectoryListIndividualsPageAsync> {
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
                .let { HrisDirectoryListIndividualsPageAsync.of(this, params, it) }
        }
    }
}
