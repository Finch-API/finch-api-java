package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.HriDirectoryListIndividualsPage
import com.tryfinch.api.models.HriDirectoryListIndividualsParams
import com.tryfinch.api.services.errorHandler
import com.tryfinch.api.services.jsonHandler
import com.tryfinch.api.services.withErrorHandler

class DirectoryServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : DirectoryService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val listIndividualsHandler: Handler<HriDirectoryListIndividualsPage.Response> =
        jsonHandler<HriDirectoryListIndividualsPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Read company directory and organization structure */
    override fun listIndividuals(
        params: HriDirectoryListIndividualsParams,
        requestOptions: RequestOptions
    ): HriDirectoryListIndividualsPage {
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
                .let { HriDirectoryListIndividualsPage.of(this, params, it) }
        }
    }
}
