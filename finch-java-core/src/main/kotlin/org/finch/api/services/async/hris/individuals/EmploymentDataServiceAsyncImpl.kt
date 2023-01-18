package org.finch.api.services.async.hris.individuals

import java.util.concurrent.CompletableFuture
import org.finch.api.core.ClientOptions
import org.finch.api.core.RequestOptions
import org.finch.api.core.http.HttpMethod
import org.finch.api.core.http.HttpRequest
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.models.HrisIndividualsEmploymentDataRetrieveManyPageAsync
import org.finch.api.models.HrisIndividualsEmploymentDataRetrieveManyParams
import org.finch.api.services.errorHandler
import org.finch.api.services.json
import org.finch.api.services.jsonHandler
import org.finch.api.services.withErrorHandler

class EmploymentDataServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : EmploymentDataServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveManyHandler:
        Handler<HrisIndividualsEmploymentDataRetrieveManyPageAsync.Response> =
        jsonHandler<HrisIndividualsEmploymentDataRetrieveManyPageAsync.Response>(
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
    ): CompletableFuture<HrisIndividualsEmploymentDataRetrieveManyPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("employer", "employment")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { retrieveManyHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { HrisIndividualsEmploymentDataRetrieveManyPageAsync.of(this, params, it) }
        }
    }
}
