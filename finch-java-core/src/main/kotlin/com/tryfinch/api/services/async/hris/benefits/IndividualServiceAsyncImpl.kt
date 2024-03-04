// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris.benefits

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.HrisBenefitIndividualEnrolledIdsParams
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsPageAsync
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsParams
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyPageAsync
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyParams
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

    /** Lists individuals currently enrolled in a given deduction. */
    override fun enrolledIds(
        params: HrisBenefitIndividualEnrolledIdsParams,
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
                .use { enrolledIdsHandler.handle(it) }
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

    /** Get enrollment information for the given individuals. */
    override fun retrieveManyBenefits(
        params: HrisBenefitIndividualRetrieveManyBenefitsParams,
        requestOptions: RequestOptions
    ): CompletableFuture<HrisBenefitIndividualRetrieveManyBenefitsPageAsync> {
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
                .use { retrieveManyBenefitsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    HrisBenefitIndividualRetrieveManyBenefitsPageAsync.Response.Builder()
                        .items(it)
                        .build()
                }
                .let { HrisBenefitIndividualRetrieveManyBenefitsPageAsync.of(this, params, it) }
        }
    }

    private val unenrollManyHandler: Handler<List<UnenrolledIndividual>> =
        jsonHandler<List<UnenrolledIndividual>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Unenroll individuals from a deduction or contribution */
    override fun unenrollMany(
        params: HrisBenefitIndividualUnenrollManyParams,
        requestOptions: RequestOptions
    ): CompletableFuture<HrisBenefitIndividualUnenrollManyPageAsync> {
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
                .use { unenrollManyHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    HrisBenefitIndividualUnenrollManyPageAsync.Response.Builder().items(it).build()
                }
                .let { HrisBenefitIndividualUnenrollManyPageAsync.of(this, params, it) }
        }
    }
}
