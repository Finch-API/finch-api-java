// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris.benefits

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.core.http.json
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepareAsync
import com.tryfinch.api.models.HrisBenefitIndividualEnrolledIdsParams
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsPageAsync
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsParams
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyParams
import com.tryfinch.api.models.IndividualBenefit
import com.tryfinch.api.models.IndividualEnrolledIdsResponse
import com.tryfinch.api.models.UnenrolledIndividualBenefitResponse
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class IndividualServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    IndividualServiceAsync {

    private val withRawResponse: IndividualServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IndividualServiceAsync.WithRawResponse = withRawResponse

    override fun enrolledIds(
        params: HrisBenefitIndividualEnrolledIdsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IndividualEnrolledIdsResponse> =
        // get /employer/benefits/{benefit_id}/enrolled
        withRawResponse().enrolledIds(params, requestOptions).thenApply { it.parse() }

    override fun retrieveManyBenefits(
        params: HrisBenefitIndividualRetrieveManyBenefitsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HrisBenefitIndividualRetrieveManyBenefitsPageAsync> =
        // get /employer/benefits/{benefit_id}/individuals
        withRawResponse().retrieveManyBenefits(params, requestOptions).thenApply { it.parse() }

    override fun unenrollMany(
        params: HrisBenefitIndividualUnenrollManyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UnenrolledIndividualBenefitResponse> =
        // delete /employer/benefits/{benefit_id}/individuals
        withRawResponse().unenrollMany(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IndividualServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val enrolledIdsHandler: Handler<IndividualEnrolledIdsResponse> =
            jsonHandler<IndividualEnrolledIdsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun enrolledIds(
            params: HrisBenefitIndividualEnrolledIdsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IndividualEnrolledIdsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("benefitId", params.benefitId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("employer", "benefits", params._pathParam(0), "enrolled")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { enrolledIdsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveManyBenefitsHandler: Handler<List<IndividualBenefit>> =
            jsonHandler<List<IndividualBenefit>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveManyBenefits(
            params: HrisBenefitIndividualRetrieveManyBenefitsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("benefitId", params.benefitId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("employer", "benefits", params._pathParam(0), "individuals")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveManyBenefitsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                            .let {
                                HrisBenefitIndividualRetrieveManyBenefitsPageAsync.builder()
                                    .service(IndividualServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val unenrollManyHandler: Handler<UnenrolledIndividualBenefitResponse> =
            jsonHandler<UnenrolledIndividualBenefitResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun unenrollMany(
            params: HrisBenefitIndividualUnenrollManyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UnenrolledIndividualBenefitResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("benefitId", params.benefitId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("employer", "benefits", params._pathParam(0), "individuals")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { unenrollManyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
