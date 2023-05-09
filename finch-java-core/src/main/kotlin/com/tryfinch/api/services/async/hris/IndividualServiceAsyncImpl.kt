package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.HriIndividualRetrieveManyPageAsync
import com.tryfinch.api.models.HriIndividualRetrieveManyParams
import com.tryfinch.api.services.async.hris.individuals.EmploymentDataServiceAsync
import com.tryfinch.api.services.async.hris.individuals.EmploymentDataServiceAsyncImpl
import com.tryfinch.api.services.errorHandler
import com.tryfinch.api.services.json
import com.tryfinch.api.services.jsonHandler
import com.tryfinch.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class IndividualServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : IndividualServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val employmentData: EmploymentDataServiceAsync by lazy {
        EmploymentDataServiceAsyncImpl(clientOptions)
    }

    override fun employmentData(): EmploymentDataServiceAsync = employmentData

    private val retrieveManyHandler: Handler<HriIndividualRetrieveManyPageAsync.Response> =
        jsonHandler<HriIndividualRetrieveManyPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Read individual data, excluding income and employment data */
    override fun retrieveMany(
        params: HriIndividualRetrieveManyParams,
        requestOptions: RequestOptions
    ): CompletableFuture<HriIndividualRetrieveManyPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("employer", "individual")
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
                .let { HriIndividualRetrieveManyPageAsync.of(this, params, it) }
        }
    }
}
