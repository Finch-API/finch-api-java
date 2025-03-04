// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.json
import com.tryfinch.api.core.prepareAsync
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.CompanyBenefit
import com.tryfinch.api.models.CreateCompanyBenefitsResponse
import com.tryfinch.api.models.HrisBenefitCreateParams
import com.tryfinch.api.models.HrisBenefitListPageAsync
import com.tryfinch.api.models.HrisBenefitListParams
import com.tryfinch.api.models.HrisBenefitListSupportedBenefitsPageAsync
import com.tryfinch.api.models.HrisBenefitListSupportedBenefitsParams
import com.tryfinch.api.models.HrisBenefitRetrieveParams
import com.tryfinch.api.models.HrisBenefitUpdateParams
import com.tryfinch.api.models.SupportedBenefit
import com.tryfinch.api.models.UpdateCompanyBenefitResponse
import com.tryfinch.api.services.async.hris.benefits.IndividualServiceAsync
import com.tryfinch.api.services.async.hris.benefits.IndividualServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class BenefitServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BenefitServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val individuals: IndividualServiceAsync by lazy {
        IndividualServiceAsyncImpl(clientOptions)
    }

    override fun individuals(): IndividualServiceAsync = individuals

    private val createHandler: Handler<CreateCompanyBenefitsResponse> =
        jsonHandler<CreateCompanyBenefitsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Creates a new company-wide deduction or contribution. Please use the `/providers` endpoint to
     * view available types for each provider.
     */
    override fun create(
        params: HrisBenefitCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreateCompanyBenefitsResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("employer", "benefits")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<CompanyBenefit> =
        jsonHandler<CompanyBenefit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Lists deductions and contributions information for a given item */
    override fun retrieve(
        params: HrisBenefitRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CompanyBenefit> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "benefits", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<UpdateCompanyBenefitResponse> =
        jsonHandler<UpdateCompanyBenefitResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Updates an existing company-wide deduction or contribution */
    override fun update(
        params: HrisBenefitUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UpdateCompanyBenefitResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("employer", "benefits", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<List<CompanyBenefit>> =
        jsonHandler<List<CompanyBenefit>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List all company-wide deductions and contributions. */
    override fun list(
        params: HrisBenefitListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HrisBenefitListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "benefits")
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        HrisBenefitListPageAsync.of(
                            this,
                            params,
                            HrisBenefitListPageAsync.Response.builder().items(it).build(),
                        )
                    }
            }
    }

    private val listSupportedBenefitsHandler: Handler<List<SupportedBenefit>> =
        jsonHandler<List<SupportedBenefit>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get deductions metadata */
    override fun listSupportedBenefits(
        params: HrisBenefitListSupportedBenefitsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HrisBenefitListSupportedBenefitsPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "benefits", "meta")
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listSupportedBenefitsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        HrisBenefitListSupportedBenefitsPageAsync.of(
                            this,
                            params,
                            HrisBenefitListSupportedBenefitsPageAsync.Response.builder()
                                .items(it)
                                .build(),
                        )
                    }
            }
    }
}
