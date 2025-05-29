// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

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

interface BenefitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun individuals(): IndividualServiceAsync

    /**
     * Creates a new company-wide deduction or contribution. Please use the `/providers` endpoint to
     * view available types for each provider.
     */
    fun create(): CompletableFuture<CreateCompanyBenefitsResponse> =
        create(HrisBenefitCreateParams.none())

    /** @see [create] */
    fun create(
        params: HrisBenefitCreateParams = HrisBenefitCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreateCompanyBenefitsResponse>

    /** @see [create] */
    fun create(
        params: HrisBenefitCreateParams = HrisBenefitCreateParams.none()
    ): CompletableFuture<CreateCompanyBenefitsResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<CreateCompanyBenefitsResponse> =
        create(HrisBenefitCreateParams.none(), requestOptions)

    /** Lists deductions and contributions information for a given item */
    fun retrieve(benefitId: String): CompletableFuture<CompanyBenefit> =
        retrieve(benefitId, HrisBenefitRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        benefitId: String,
        params: HrisBenefitRetrieveParams = HrisBenefitRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompanyBenefit> =
        retrieve(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        benefitId: String,
        params: HrisBenefitRetrieveParams = HrisBenefitRetrieveParams.none(),
    ): CompletableFuture<CompanyBenefit> = retrieve(benefitId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: HrisBenefitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompanyBenefit>

    /** @see [retrieve] */
    fun retrieve(params: HrisBenefitRetrieveParams): CompletableFuture<CompanyBenefit> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        benefitId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CompanyBenefit> =
        retrieve(benefitId, HrisBenefitRetrieveParams.none(), requestOptions)

    /** Updates an existing company-wide deduction or contribution */
    fun update(benefitId: String): CompletableFuture<UpdateCompanyBenefitResponse> =
        update(benefitId, HrisBenefitUpdateParams.none())

    /** @see [update] */
    fun update(
        benefitId: String,
        params: HrisBenefitUpdateParams = HrisBenefitUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UpdateCompanyBenefitResponse> =
        update(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see [update] */
    fun update(
        benefitId: String,
        params: HrisBenefitUpdateParams = HrisBenefitUpdateParams.none(),
    ): CompletableFuture<UpdateCompanyBenefitResponse> =
        update(benefitId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: HrisBenefitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UpdateCompanyBenefitResponse>

    /** @see [update] */
    fun update(params: HrisBenefitUpdateParams): CompletableFuture<UpdateCompanyBenefitResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        benefitId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UpdateCompanyBenefitResponse> =
        update(benefitId, HrisBenefitUpdateParams.none(), requestOptions)

    /** List all company-wide deductions and contributions. */
    fun list(): CompletableFuture<HrisBenefitListPageAsync> = list(HrisBenefitListParams.none())

    /** @see [list] */
    fun list(
        params: HrisBenefitListParams = HrisBenefitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisBenefitListPageAsync>

    /** @see [list] */
    fun list(
        params: HrisBenefitListParams = HrisBenefitListParams.none()
    ): CompletableFuture<HrisBenefitListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<HrisBenefitListPageAsync> =
        list(HrisBenefitListParams.none(), requestOptions)

    /** Get deductions metadata */
    fun listSupportedBenefits(): CompletableFuture<HrisBenefitListSupportedBenefitsPageAsync> =
        listSupportedBenefits(HrisBenefitListSupportedBenefitsParams.none())

    /** @see [listSupportedBenefits] */
    fun listSupportedBenefits(
        params: HrisBenefitListSupportedBenefitsParams =
            HrisBenefitListSupportedBenefitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisBenefitListSupportedBenefitsPageAsync>

    /** @see [listSupportedBenefits] */
    fun listSupportedBenefits(
        params: HrisBenefitListSupportedBenefitsParams =
            HrisBenefitListSupportedBenefitsParams.none()
    ): CompletableFuture<HrisBenefitListSupportedBenefitsPageAsync> =
        listSupportedBenefits(params, RequestOptions.none())

    /** @see [listSupportedBenefits] */
    fun listSupportedBenefits(
        requestOptions: RequestOptions
    ): CompletableFuture<HrisBenefitListSupportedBenefitsPageAsync> =
        listSupportedBenefits(HrisBenefitListSupportedBenefitsParams.none(), requestOptions)

    /**
     * A view of [BenefitServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun individuals(): IndividualServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /employer/benefits`, but is otherwise the same as
         * [BenefitServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<CreateCompanyBenefitsResponse>> =
            create(HrisBenefitCreateParams.none())

        /** @see [create] */
        fun create(
            params: HrisBenefitCreateParams = HrisBenefitCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreateCompanyBenefitsResponse>>

        /** @see [create] */
        fun create(
            params: HrisBenefitCreateParams = HrisBenefitCreateParams.none()
        ): CompletableFuture<HttpResponseFor<CreateCompanyBenefitsResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CreateCompanyBenefitsResponse>> =
            create(HrisBenefitCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/benefits/{benefit_id}`, but is otherwise
         * the same as [BenefitServiceAsync.retrieve].
         */
        fun retrieve(benefitId: String): CompletableFuture<HttpResponseFor<CompanyBenefit>> =
            retrieve(benefitId, HrisBenefitRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            benefitId: String,
            params: HrisBenefitRetrieveParams = HrisBenefitRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompanyBenefit>> =
            retrieve(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            benefitId: String,
            params: HrisBenefitRetrieveParams = HrisBenefitRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CompanyBenefit>> =
            retrieve(benefitId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: HrisBenefitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompanyBenefit>>

        /** @see [retrieve] */
        fun retrieve(
            params: HrisBenefitRetrieveParams
        ): CompletableFuture<HttpResponseFor<CompanyBenefit>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            benefitId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CompanyBenefit>> =
            retrieve(benefitId, HrisBenefitRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /employer/benefits/{benefit_id}`, but is otherwise
         * the same as [BenefitServiceAsync.update].
         */
        fun update(
            benefitId: String
        ): CompletableFuture<HttpResponseFor<UpdateCompanyBenefitResponse>> =
            update(benefitId, HrisBenefitUpdateParams.none())

        /** @see [update] */
        fun update(
            benefitId: String,
            params: HrisBenefitUpdateParams = HrisBenefitUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UpdateCompanyBenefitResponse>> =
            update(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see [update] */
        fun update(
            benefitId: String,
            params: HrisBenefitUpdateParams = HrisBenefitUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<UpdateCompanyBenefitResponse>> =
            update(benefitId, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: HrisBenefitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UpdateCompanyBenefitResponse>>

        /** @see [update] */
        fun update(
            params: HrisBenefitUpdateParams
        ): CompletableFuture<HttpResponseFor<UpdateCompanyBenefitResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            benefitId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UpdateCompanyBenefitResponse>> =
            update(benefitId, HrisBenefitUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/benefits`, but is otherwise the same as
         * [BenefitServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<HrisBenefitListPageAsync>> =
            list(HrisBenefitListParams.none())

        /** @see [list] */
        fun list(
            params: HrisBenefitListParams = HrisBenefitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HrisBenefitListPageAsync>>

        /** @see [list] */
        fun list(
            params: HrisBenefitListParams = HrisBenefitListParams.none()
        ): CompletableFuture<HttpResponseFor<HrisBenefitListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<HrisBenefitListPageAsync>> =
            list(HrisBenefitListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/benefits/meta`, but is otherwise the same
         * as [BenefitServiceAsync.listSupportedBenefits].
         */
        fun listSupportedBenefits():
            CompletableFuture<HttpResponseFor<HrisBenefitListSupportedBenefitsPageAsync>> =
            listSupportedBenefits(HrisBenefitListSupportedBenefitsParams.none())

        /** @see [listSupportedBenefits] */
        fun listSupportedBenefits(
            params: HrisBenefitListSupportedBenefitsParams =
                HrisBenefitListSupportedBenefitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HrisBenefitListSupportedBenefitsPageAsync>>

        /** @see [listSupportedBenefits] */
        fun listSupportedBenefits(
            params: HrisBenefitListSupportedBenefitsParams =
                HrisBenefitListSupportedBenefitsParams.none()
        ): CompletableFuture<HttpResponseFor<HrisBenefitListSupportedBenefitsPageAsync>> =
            listSupportedBenefits(params, RequestOptions.none())

        /** @see [listSupportedBenefits] */
        fun listSupportedBenefits(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<HrisBenefitListSupportedBenefitsPageAsync>> =
            listSupportedBenefits(HrisBenefitListSupportedBenefitsParams.none(), requestOptions)
    }
}
