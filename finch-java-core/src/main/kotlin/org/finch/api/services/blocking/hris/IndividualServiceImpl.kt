package org.finch.api.services.blocking.hris

import org.finch.api.core.ClientOptions
import org.finch.api.core.RequestOptions
import org.finch.api.core.http.HttpMethod
import org.finch.api.core.http.HttpRequest
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.models.HrisIndividualRetrieveManyPage
import org.finch.api.models.HrisIndividualRetrieveManyParams
import org.finch.api.services.blocking.hris.individuals.EmploymentDataService
import org.finch.api.services.blocking.hris.individuals.EmploymentDataServiceImpl
import org.finch.api.services.errorHandler
import org.finch.api.services.json
import org.finch.api.services.jsonHandler
import org.finch.api.services.withErrorHandler

class IndividualServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : IndividualService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val employmentData: EmploymentDataService by lazy {
        EmploymentDataServiceImpl(clientOptions)
    }

    override fun employmentData(): EmploymentDataService = employmentData

    private val retrieveManyHandler: Handler<HrisIndividualRetrieveManyPage.Response> =
        jsonHandler<HrisIndividualRetrieveManyPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Read individual data, excluding income and employment data */
    override fun retrieveMany(
        params: HrisIndividualRetrieveManyParams,
        requestOptions: RequestOptions
    ): HrisIndividualRetrieveManyPage {
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
                .let { HrisIndividualRetrieveManyPage.of(this, params, it) }
        }
    }
}
