package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.CompanyBenefit
import com.tryfinch.api.models.CreateCompanyBenefitsResponse
import com.tryfinch.api.models.HriBenefitCreateParams
import com.tryfinch.api.models.HriBenefitListPage
import com.tryfinch.api.models.HriBenefitListParams
import com.tryfinch.api.models.HriBenefitListSupportedBenefitsPage
import com.tryfinch.api.models.HriBenefitListSupportedBenefitsParams
import com.tryfinch.api.models.HriBenefitRetrieveParams
import com.tryfinch.api.models.HriBenefitUpdateParams
import com.tryfinch.api.models.SupportedBenefit
import com.tryfinch.api.models.UpdateCompanyBenefitResponse
import com.tryfinch.api.services.blocking.hris.benefits.IndividualService
import com.tryfinch.api.services.blocking.hris.benefits.IndividualServiceImpl
import com.tryfinch.api.services.errorHandler
import com.tryfinch.api.services.json
import com.tryfinch.api.services.jsonHandler
import com.tryfinch.api.services.withErrorHandler

class BenefitServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : BenefitService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val individuals: IndividualService by lazy { IndividualServiceImpl(clientOptions) }

    override fun individuals(): IndividualService = individuals

    private val createHandler: Handler<CreateCompanyBenefitsResponse> =
        jsonHandler<CreateCompanyBenefitsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * **Availability: Automated and Assisted Benefits providers**
     *
     * Creates a new company-wide benefit. Please use the `/meta` endpoint to view available types
     * for each provider.
     */
    override fun create(
        params: HriBenefitCreateParams,
        requestOptions: RequestOptions
    ): CreateCompanyBenefitsResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("employer", "benefits")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<CompanyBenefit> =
        jsonHandler<CompanyBenefit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * **Availability: Automated Benefits providers only**
     *
     * Lists benefit information for a given benefit
     */
    override fun retrieve(
        params: HriBenefitRetrieveParams,
        requestOptions: RequestOptions
    ): CompanyBenefit {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "benefits", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<UpdateCompanyBenefitResponse> =
        jsonHandler<UpdateCompanyBenefitResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * **Availability: Automated and Assisted Benefits providers**
     *
     * Updates an existing company-wide benefit
     */
    override fun update(
        params: HriBenefitUpdateParams,
        requestOptions: RequestOptions
    ): UpdateCompanyBenefitResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("employer", "benefits", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<CompanyBenefit>> =
        jsonHandler<List<CompanyBenefit>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * **Availability: Automated Benefits providers only**
     *
     * List all company-wide benefits.
     */
    override fun list(
        params: HriBenefitListParams,
        requestOptions: RequestOptions
    ): HriBenefitListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "benefits")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let { HriBenefitListPage.Response.Builder().items(it).build() }
                .let { HriBenefitListPage.of(this, params, it) }
        }
    }

    private val listSupportedBenefitsHandler: Handler<List<SupportedBenefit>> =
        jsonHandler<List<SupportedBenefit>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * **Availability: Automated and Assisted Benefits providers**
     *
     * Lists available types and configurations for the provider associated with the access token.
     */
    override fun listSupportedBenefits(
        params: HriBenefitListSupportedBenefitsParams,
        requestOptions: RequestOptions
    ): HriBenefitListSupportedBenefitsPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "benefits", "meta")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { listSupportedBenefitsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let { HriBenefitListSupportedBenefitsPage.Response.Builder().items(it).build() }
                .let { HriBenefitListSupportedBenefitsPage.of(this, params, it) }
        }
    }
}
