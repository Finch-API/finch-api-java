package org.finch.api.services.async.hris

import java.util.concurrent.CompletableFuture
import org.finch.api.core.ClientOptions
import org.finch.api.core.RequestOptions
import org.finch.api.core.http.HttpMethod
import org.finch.api.core.http.HttpRequest
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.models.CompanyBenefit
import org.finch.api.models.CreateCompanyBenefitsResponse
import org.finch.api.models.HrisBenefitCreateParams
import org.finch.api.models.HrisBenefitListPageAsync
import org.finch.api.models.HrisBenefitListParams
import org.finch.api.models.HrisBenefitListSupportedBenefitsPageAsync
import org.finch.api.models.HrisBenefitListSupportedBenefitsParams
import org.finch.api.models.HrisBenefitRetrieveParams
import org.finch.api.models.HrisBenefitUpdateParams
import org.finch.api.models.SupportedBenefit
import org.finch.api.models.UpdateCompanyBenefitResponse
import org.finch.api.services.async.hris.benefits.IndividualServiceAsync
import org.finch.api.services.async.hris.benefits.IndividualServiceAsyncImpl
import org.finch.api.services.errorHandler
import org.finch.api.services.json
import org.finch.api.services.jsonHandler
import org.finch.api.services.withErrorHandler

class BenefitServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : BenefitServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val individuals: IndividualServiceAsync by lazy {
        IndividualServiceAsyncImpl(clientOptions)
    }

    override fun individuals(): IndividualServiceAsync = individuals

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
        params: HrisBenefitCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CreateCompanyBenefitsResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("employer", "benefits")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
        params: HrisBenefitRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CompanyBenefit> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "benefits", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
        params: HrisBenefitUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<UpdateCompanyBenefitResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("employer", "benefits", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
        params: HrisBenefitListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<HrisBenefitListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "benefits")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let { HrisBenefitListPageAsync.Response.Builder().items(it).build() }
                .let { HrisBenefitListPageAsync.of(this, params, it) }
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
        params: HrisBenefitListSupportedBenefitsParams,
        requestOptions: RequestOptions
    ): CompletableFuture<HrisBenefitListSupportedBenefitsPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "benefits", "meta")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { listSupportedBenefitsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    HrisBenefitListSupportedBenefitsPageAsync.Response.Builder().items(it).build()
                }
                .let { HrisBenefitListSupportedBenefitsPageAsync.of(this, params, it) }
        }
    }
}
