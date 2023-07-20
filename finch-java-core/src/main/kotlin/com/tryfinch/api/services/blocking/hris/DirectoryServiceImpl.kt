package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.HrisDirectoryListIndividualsPage
import com.tryfinch.api.models.HrisDirectoryListIndividualsParams
import com.tryfinch.api.services.errorHandler
import com.tryfinch.api.services.jsonHandler
import com.tryfinch.api.services.withErrorHandler

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
                .use { listIndividualsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { HrisDirectoryListIndividualsPage.of(this, params, it) }
        }
    }
}
