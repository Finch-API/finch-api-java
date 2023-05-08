package com.tryfinch.api.services.blocking.hris.individuals

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.HrisIndividualsEmploymentDataRetrieveManyPage
import com.tryfinch.api.models.HrisIndividualsEmploymentDataRetrieveManyParams
import com.tryfinch.api.services.errorHandler
import com.tryfinch.api.services.json
import com.tryfinch.api.services.jsonHandler
import com.tryfinch.api.services.withErrorHandler

class EmploymentDataServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : EmploymentDataService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveManyHandler:
        Handler<HrisIndividualsEmploymentDataRetrieveManyPage.Response> =
        jsonHandler<HrisIndividualsEmploymentDataRetrieveManyPage.Response>(
                clientOptions.jsonMapper
            )
            .withErrorHandler(errorHandler)

    /**
     * Read individual employment and income data
     *
     * Note: Income information is returned as reported by the provider. This may not always be
     * annualized income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on
     * what information the provider returns.
     */
    override fun retrieveMany(
        params: HrisIndividualsEmploymentDataRetrieveManyParams,
        requestOptions: RequestOptions
    ): HrisIndividualsEmploymentDataRetrieveManyPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("employer", "employment")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { retrieveManyHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { HrisIndividualsEmploymentDataRetrieveManyPage.of(this, params, it) }
        }
    }
}
