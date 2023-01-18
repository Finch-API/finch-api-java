package org.finch.api.services.blocking.hris

import org.finch.api.core.ClientOptions
import org.finch.api.core.RequestOptions
import org.finch.api.core.http.HttpMethod
import org.finch.api.core.http.HttpRequest
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.models.HrisPayStatementRetrieveManyPage
import org.finch.api.models.HrisPayStatementRetrieveManyParams
import org.finch.api.services.errorHandler
import org.finch.api.services.json
import org.finch.api.services.jsonHandler
import org.finch.api.services.withErrorHandler

class PayStatementServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : PayStatementService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveManyHandler: Handler<HrisPayStatementRetrieveManyPage.Response> =
        jsonHandler<HrisPayStatementRetrieveManyPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Read detailed pay statements for each individual.
     *
     * Deduction and contribution types are supported by the payroll systems that support Benefits.
     */
    override fun retrieveMany(
        params: HrisPayStatementRetrieveManyParams,
        requestOptions: RequestOptions
    ): HrisPayStatementRetrieveManyPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("employer", "pay-statement")
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
                .let { HrisPayStatementRetrieveManyPage.of(this, params, it) }
        }
    }
}
