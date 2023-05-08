package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.HriIndividualRetrieveManyPage
import com.tryfinch.api.models.HriIndividualRetrieveManyParams
import com.tryfinch.api.services.blocking.hris.individuals.EmploymentDataService
import com.tryfinch.api.services.blocking.hris.individuals.EmploymentDataServiceImpl
import com.tryfinch.api.services.errorHandler
import com.tryfinch.api.services.json
import com.tryfinch.api.services.jsonHandler
import com.tryfinch.api.services.withErrorHandler

class IndividualServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : IndividualService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val employmentData: EmploymentDataService by lazy {
        EmploymentDataServiceImpl(clientOptions)
    }

    override fun employmentData(): EmploymentDataService = employmentData

    private val retrieveManyHandler: Handler<HriIndividualRetrieveManyPage.Response> =
        jsonHandler<HriIndividualRetrieveManyPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Read individual data, excluding income and employment data */
    override fun retrieveMany(
        params: HriIndividualRetrieveManyParams,
        requestOptions: RequestOptions
    ): HriIndividualRetrieveManyPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("employer", "individual")
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
                .let { HriIndividualRetrieveManyPage.of(this, params, it) }
        }
    }
}
