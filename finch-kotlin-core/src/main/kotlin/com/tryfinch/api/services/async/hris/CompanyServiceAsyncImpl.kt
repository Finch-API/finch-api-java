package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.Company
import com.tryfinch.api.models.HriCompanyRetrieveParams
import com.tryfinch.api.services.errorHandler
import com.tryfinch.api.services.jsonHandler
import com.tryfinch.api.services.withErrorHandler

class CompanyServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CompanyServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Company> =
        jsonHandler<Company>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Read basic company data */
    override suspend fun retrieve(
        params: HriCompanyRetrieveParams,
        requestOptions: RequestOptions
    ): Company {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "company")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
