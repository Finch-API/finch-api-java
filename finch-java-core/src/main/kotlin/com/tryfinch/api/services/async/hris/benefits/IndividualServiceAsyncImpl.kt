package com.tryfinch.api.services.async.hris.benefits

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.HrisBenefitsIndividualEnrolledIdsParams
import com.tryfinch.api.models.HrisBenefitsIndividualRetrieveManyBenefitsPageAsync
import com.tryfinch.api.models.HrisBenefitsIndividualRetrieveManyBenefitsParams
import com.tryfinch.api.models.HrisBenefitsIndividualUnenrollPageAsync
import com.tryfinch.api.models.HrisBenefitsIndividualUnenrollParams
import com.tryfinch.api.models.IndividualBenefit
import com.tryfinch.api.models.IndividualEnrolledIdsResponse
import com.tryfinch.api.models.UnenrolledIndividual
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

    private val enrolledIdsHandler: Handler<IndividualEnrolledIdsResponse> =
        jsonHandler<IndividualEnrolledIdsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * **Availability: Automated Benefits providers only**
     *
     * Lists individuals currently enrolled in a given benefit.
     */
    override fun enrolledIds(
        params: HrisBenefitsIndividualEnrolledIdsParams,
        requestOptions: RequestOptions
    ): CompletableFuture<IndividualEnrolledIdsResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "benefits", params.getPathParam(0), "enrolled")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { enrolledIdsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveManyBenefitsHandler: Handler<List<IndividualBenefit>> =
        jsonHandler<List<IndividualBenefit>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * **Availability: Automated Benefits providers only**
     *
     * Get enrolled benefit information for the given individuals.
     */
    override fun retrieveManyBenefits(
        params: HrisBenefitsIndividualRetrieveManyBenefitsParams,
        requestOptions: RequestOptions
    ): CompletableFuture<HrisBenefitsIndividualRetrieveManyBenefitsPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "benefits", params.getPathParam(0), "individuals")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { retrieveManyBenefitsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    HrisBenefitsIndividualRetrieveManyBenefitsPageAsync.Response.Builder()
                        .items(it)
                        .build()
                }
                .let { HrisBenefitsIndividualRetrieveManyBenefitsPageAsync.of(this, params, it) }
        }
    }

    private val unenrollHandler: Handler<List<UnenrolledIndividual>> =
        jsonHandler<List<UnenrolledIndividual>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * **Availability: Automated and Assisted Benefits providers**
     *
     * Unenroll individuals from a benefit
     */
    override fun unenroll(
        params: HrisBenefitsIndividualUnenrollParams,
        requestOptions: RequestOptions
    ): CompletableFuture<HrisBenefitsIndividualUnenrollPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("employer", "benefits", params.getPathParam(0), "individuals")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { unenrollHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    HrisBenefitsIndividualUnenrollPageAsync.Response.Builder().items(it).build()
                }
                .let { HrisBenefitsIndividualUnenrollPageAsync.of(this, params, it) }
        }
    }
}
