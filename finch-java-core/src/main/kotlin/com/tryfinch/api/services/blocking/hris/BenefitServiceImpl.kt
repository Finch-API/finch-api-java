// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.ClientOptions
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
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.CompanyBenefit
import com.tryfinch.api.models.CreateCompanyBenefitsResponse
import com.tryfinch.api.models.HrisBenefitCreateParams
import com.tryfinch.api.models.HrisBenefitListPage
import com.tryfinch.api.models.HrisBenefitListParams
import com.tryfinch.api.models.HrisBenefitListSupportedBenefitsPage
import com.tryfinch.api.models.HrisBenefitListSupportedBenefitsParams
import com.tryfinch.api.models.HrisBenefitRetrieveParams
import com.tryfinch.api.models.HrisBenefitUpdateParams
import com.tryfinch.api.models.SupportedBenefit
import com.tryfinch.api.models.UpdateCompanyBenefitResponse
import com.tryfinch.api.services.blocking.hris.benefits.IndividualService
import com.tryfinch.api.services.blocking.hris.benefits.IndividualServiceImpl

class BenefitServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : BenefitService {

    private val withRawResponse: BenefitService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val individuals: IndividualService by lazy { IndividualServiceImpl(clientOptions) }

    override fun withRawResponse(): BenefitService.WithRawResponse = withRawResponse

    override fun individuals(): IndividualService = individuals

    override fun create(params: HrisBenefitCreateParams, requestOptions: RequestOptions): CreateCompanyBenefitsResponse =
        // post /employer/benefits
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: HrisBenefitRetrieveParams, requestOptions: RequestOptions): CompanyBenefit =
        // get /employer/benefits/{benefit_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: HrisBenefitUpdateParams, requestOptions: RequestOptions): UpdateCompanyBenefitResponse =
        // post /employer/benefits/{benefit_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: HrisBenefitListParams, requestOptions: RequestOptions): HrisBenefitListPage =
        // get /employer/benefits
        withRawResponse().list(params, requestOptions).parse()

    override fun listSupportedBenefits(params: HrisBenefitListSupportedBenefitsParams, requestOptions: RequestOptions): HrisBenefitListSupportedBenefitsPage =
        // get /employer/benefits/meta
        withRawResponse().listSupportedBenefits(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : BenefitService.WithRawResponse {

        private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

        private val individuals: IndividualService.WithRawResponse by lazy { IndividualServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun individuals(): IndividualService.WithRawResponse = individuals

        private val createHandler: Handler<CreateCompanyBenefitsResponse> = jsonHandler<CreateCompanyBenefitsResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(params: HrisBenefitCreateParams, requestOptions: RequestOptions): HttpResponseFor<CreateCompanyBenefitsResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("employer", "benefits")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  createHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val retrieveHandler: Handler<CompanyBenefit> = jsonHandler<CompanyBenefit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(params: HrisBenefitRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<CompanyBenefit> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("employer", "benefits", params.getPathParam(0))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  retrieveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val updateHandler: Handler<UpdateCompanyBenefitResponse> = jsonHandler<UpdateCompanyBenefitResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(params: HrisBenefitUpdateParams, requestOptions: RequestOptions): HttpResponseFor<UpdateCompanyBenefitResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("employer", "benefits", params.getPathParam(0))
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  updateHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val listHandler: Handler<List<CompanyBenefit>> = jsonHandler<List<CompanyBenefit>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(params: HrisBenefitListParams, requestOptions: RequestOptions): HttpResponseFor<HrisBenefitListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("employer", "benefits")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
              .let {
                  HrisBenefitListPage.of(BenefitServiceImpl(clientOptions), params, HrisBenefitListPage.Response.builder()
                      .items(it)
                      .build())
              }
          }
        }

        private val listSupportedBenefitsHandler: Handler<List<SupportedBenefit>> = jsonHandler<List<SupportedBenefit>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun listSupportedBenefits(params: HrisBenefitListSupportedBenefitsParams, requestOptions: RequestOptions): HttpResponseFor<HrisBenefitListSupportedBenefitsPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("employer", "benefits", "meta")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  listSupportedBenefitsHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
              .let {
                  HrisBenefitListSupportedBenefitsPage.of(BenefitServiceImpl(clientOptions), params, HrisBenefitListSupportedBenefitsPage.Response.builder()
                      .items(it)
                      .build())
              }
          }
        }
    }
}
