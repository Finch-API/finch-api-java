// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris.benefits

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.core.http.json
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepare
import com.tryfinch.api.models.HrisBenefitIndividualEnrolledIdsParams
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsPage
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsParams
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyPage
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyParams
import com.tryfinch.api.models.IndividualBenefit
import com.tryfinch.api.models.IndividualEnrolledIdsResponse
import com.tryfinch.api.models.UnenrolledIndividual

class IndividualServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IndividualService {

    private val withRawResponse: IndividualService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IndividualService.WithRawResponse = withRawResponse

    override fun enrolledIds(
        params: HrisBenefitIndividualEnrolledIdsParams,
        requestOptions: RequestOptions,
    ): IndividualEnrolledIdsResponse =
        // get /employer/benefits/{benefit_id}/enrolled
        withRawResponse().enrolledIds(params, requestOptions).parse()

    override fun retrieveManyBenefits(
        params: HrisBenefitIndividualRetrieveManyBenefitsParams,
        requestOptions: RequestOptions,
    ): HrisBenefitIndividualRetrieveManyBenefitsPage =
        // get /employer/benefits/{benefit_id}/individuals
        withRawResponse().retrieveManyBenefits(params, requestOptions).parse()

    override fun unenrollMany(
        params: HrisBenefitIndividualUnenrollManyParams,
        requestOptions: RequestOptions,
    ): HrisBenefitIndividualUnenrollManyPage =
        // delete /employer/benefits/{benefit_id}/individuals
        withRawResponse().unenrollMany(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IndividualService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val enrolledIdsHandler: Handler<IndividualEnrolledIdsResponse> =
            jsonHandler<IndividualEnrolledIdsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun enrolledIds(
            params: HrisBenefitIndividualEnrolledIdsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndividualEnrolledIdsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("employer", "benefits", params._pathParam(0), "enrolled")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { enrolledIdsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("employer", "benefits", params._pathParam(0), "individuals")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveManyBenefitsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        HrisBenefitIndividualRetrieveManyBenefitsPage.of(
                            IndividualServiceImpl(clientOptions),
                            params,
                            HrisBenefitIndividualRetrieveManyBenefitsPage.Response.builder()
                                .items(it)
                                .build(),
                        )
                    }
            }
        }

        private val unenrollManyHandler: Handler<List<UnenrolledIndividual>> =
            jsonHandler<List<UnenrolledIndividual>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun unenrollMany(
            params: HrisBenefitIndividualUnenrollManyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisBenefitIndividualUnenrollManyPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("employer", "benefits", params._pathParam(0), "individuals")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { unenrollManyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        HrisBenefitIndividualUnenrollManyPage.of(
                            IndividualServiceImpl(clientOptions),
                            params,
                            HrisBenefitIndividualUnenrollManyPage.Response.builder()
                                .items(it)
                                .build(),
                        )
                    }
            }
        }
    }
}
