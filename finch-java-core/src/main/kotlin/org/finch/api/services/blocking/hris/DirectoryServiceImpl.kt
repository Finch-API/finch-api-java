package org.finch.api.services.blocking.hris

import org.finch.api.core.ClientOptions
import org.finch.api.core.RequestOptions
import org.finch.api.core.http.HttpMethod
import org.finch.api.core.http.HttpRequest
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.models.HrisDirectoryListIndividualsPage
import org.finch.api.models.HrisDirectoryListIndividualsParams
import org.finch.api.services.errorHandler
import org.finch.api.services.jsonHandler
import org.finch.api.services.withErrorHandler

class DirectoryServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : DirectoryService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val listIndividualsHandler: Handler<HrisDirectoryListIndividualsPage.Response> =
        jsonHandler<HrisDirectoryListIndividualsPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Read company directory and organization structure */
    override fun listIndividuals(
        params: HrisDirectoryListIndividualsParams,
        requestOptions: RequestOptions
    ): HrisDirectoryListIndividualsPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "directory")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { listIndividualsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { HrisDirectoryListIndividualsPage.of(this, params, it) }
        }
    }
}
