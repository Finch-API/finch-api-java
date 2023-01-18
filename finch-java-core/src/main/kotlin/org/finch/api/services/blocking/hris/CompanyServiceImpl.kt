package org.finch.api.services.blocking.hris

import org.finch.api.core.ClientOptions
import org.finch.api.core.RequestOptions
import org.finch.api.core.http.HttpMethod
import org.finch.api.core.http.HttpRequest
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.models.Company
import org.finch.api.models.HrisCompanyRetrieveParams
import org.finch.api.services.errorHandler
import org.finch.api.services.jsonHandler
import org.finch.api.services.withErrorHandler

class CompanyServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : CompanyService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Company> =
        jsonHandler<Company>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Read basic company data */
    override fun retrieve(
        params: HrisCompanyRetrieveParams,
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
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
