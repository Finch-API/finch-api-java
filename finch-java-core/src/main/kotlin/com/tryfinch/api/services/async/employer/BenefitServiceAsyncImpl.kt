package com.tryfinch.api.services.async.employer

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.EmployerBenefitRegisterParams
import com.tryfinch.api.models.RegisterCompanyBenefitsResponse
import com.tryfinch.api.services.errorHandler
import com.tryfinch.api.services.json
import com.tryfinch.api.services.jsonHandler
import com.tryfinch.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class BenefitServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : BenefitServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val registerHandler: Handler<RegisterCompanyBenefitsResponse> =
        jsonHandler<RegisterCompanyBenefitsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * **Availability: Assisted Benefits providers only**
     *
     * Register existing benefits from the customer on the provider, on Finch's end. Please use the
     * `/provider` endpoint to view available types for each provider.
     */
    override fun register(
        params: EmployerBenefitRegisterParams,
        requestOptions: RequestOptions
    ): CompletableFuture<RegisterCompanyBenefitsResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("employer", "benefits", "register")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { registerHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
