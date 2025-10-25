// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.CompanyBenefit
import com.tryfinch.api.models.CreateCompanyBenefitsResponse
import com.tryfinch.api.models.HrisBenefitCreateParams
import com.tryfinch.api.models.HrisBenefitListPageAsync
import com.tryfinch.api.models.HrisBenefitListParams
import com.tryfinch.api.models.HrisBenefitListSupportedBenefitsPageAsync
import com.tryfinch.api.models.HrisBenefitListSupportedBenefitsParams
import com.tryfinch.api.models.HrisBenefitRetrieveParams
import com.tryfinch.api.models.HrisBenefitUpdateParams
import com.tryfinch.api.models.UpdateCompanyBenefitResponse
import com.tryfinch.api.services.async.hris.benefits.IndividualServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BenefitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BenefitServiceAsync

    fun individuals(): IndividualServiceAsync

    /**
     * Creates a new company-wide deduction or contribution. Please use the `/providers` endpoint to
     * view available types for each provider.
     */
    fun create(params: HrisBenefitCreateParams): CompletableFuture<CreateCompanyBenefitsResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: HrisBenefitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreateCompanyBenefitsResponse>

    /** Lists deductions and contributions information for a given item */
    fun retrieve(
        benefitId: String,
        params: HrisBenefitRetrieveParams,
    ): CompletableFuture<CompanyBenefit> = retrieve(benefitId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        benefitId: String,
        params: HrisBenefitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompanyBenefit> =
        retrieve(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: HrisBenefitRetrieveParams): CompletableFuture<CompanyBenefit> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: HrisBenefitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompanyBenefit>

    /** Updates an existing company-wide deduction or contribution */
    fun update(
        benefitId: String,
        params: HrisBenefitUpdateParams,
    ): CompletableFuture<UpdateCompanyBenefitResponse> =
        update(benefitId, params, RequestOptions.none())

    /** @see update */
    fun update(
        benefitId: String,
        params: HrisBenefitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UpdateCompanyBenefitResponse> =
        update(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see update */
    fun update(params: HrisBenefitUpdateParams): CompletableFuture<UpdateCompanyBenefitResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: HrisBenefitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UpdateCompanyBenefitResponse>

    /** List all company-wide deductions and contributions. */
    fun list(params: HrisBenefitListParams): CompletableFuture<HrisBenefitListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: HrisBenefitListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisBenefitListPageAsync>

    /** Get deductions metadata */
    fun listSupportedBenefits(
        params: HrisBenefitListSupportedBenefitsParams
    ): CompletableFuture<HrisBenefitListSupportedBenefitsPageAsync> =
        listSupportedBenefits(params, RequestOptions.none())

    /** @see listSupportedBenefits */
    fun listSupportedBenefits(
        params: HrisBenefitListSupportedBenefitsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisBenefitListSupportedBenefitsPageAsync>

    /**
     * A view of [BenefitServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BenefitServiceAsync.WithRawResponse

        fun individuals(): IndividualServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /employer/benefits`, but is otherwise the same as
         * [BenefitServiceAsync.create].
         */
        fun create(
            params: HrisBenefitCreateParams
        ): CompletableFuture<HttpResponseFor<CreateCompanyBenefitsResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: HrisBenefitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreateCompanyBenefitsResponse>>

        /**
         * Returns a raw HTTP response for `get /employer/benefits/{benefit_id}`, but is otherwise
         * the same as [BenefitServiceAsync.retrieve].
         */
        fun retrieve(
            benefitId: String,
            params: HrisBenefitRetrieveParams,
        ): CompletableFuture<HttpResponseFor<CompanyBenefit>> =
            retrieve(benefitId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            benefitId: String,
            params: HrisBenefitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompanyBenefit>> =
            retrieve(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: HrisBenefitRetrieveParams
        ): CompletableFuture<HttpResponseFor<CompanyBenefit>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: HrisBenefitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompanyBenefit>>

        /**
         * Returns a raw HTTP response for `post /employer/benefits/{benefit_id}`, but is otherwise
         * the same as [BenefitServiceAsync.update].
         */
        fun update(
            benefitId: String,
            params: HrisBenefitUpdateParams,
        ): CompletableFuture<HttpResponseFor<UpdateCompanyBenefitResponse>> =
            update(benefitId, params, RequestOptions.none())

        /** @see update */
        fun update(
            benefitId: String,
            params: HrisBenefitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UpdateCompanyBenefitResponse>> =
            update(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see update */
        fun update(
            params: HrisBenefitUpdateParams
        ): CompletableFuture<HttpResponseFor<UpdateCompanyBenefitResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: HrisBenefitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UpdateCompanyBenefitResponse>>

        /**
         * Returns a raw HTTP response for `get /employer/benefits`, but is otherwise the same as
         * [BenefitServiceAsync.list].
         */
        fun list(
            params: HrisBenefitListParams
        ): CompletableFuture<HttpResponseFor<HrisBenefitListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: HrisBenefitListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HrisBenefitListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /employer/benefits/meta`, but is otherwise the same
         * as [BenefitServiceAsync.listSupportedBenefits].
         */
        fun listSupportedBenefits(
            params: HrisBenefitListSupportedBenefitsParams
        ): CompletableFuture<HttpResponseFor<HrisBenefitListSupportedBenefitsPageAsync>> =
            listSupportedBenefits(params, RequestOptions.none())

        /** @see listSupportedBenefits */
        fun listSupportedBenefits(
            params: HrisBenefitListSupportedBenefitsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HrisBenefitListSupportedBenefitsPageAsync>>
    }
}
