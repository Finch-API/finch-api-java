// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.CompanyBenefit
import com.tryfinch.api.models.CreateCompanyBenefitsResponse
import com.tryfinch.api.models.HrisBenefitCreateParams
import com.tryfinch.api.models.HrisBenefitListPage
import com.tryfinch.api.models.HrisBenefitListParams
import com.tryfinch.api.models.HrisBenefitListSupportedBenefitsPage
import com.tryfinch.api.models.HrisBenefitListSupportedBenefitsParams
import com.tryfinch.api.models.HrisBenefitRetrieveParams
import com.tryfinch.api.models.HrisBenefitUpdateParams
import com.tryfinch.api.models.UpdateCompanyBenefitResponse
import com.tryfinch.api.services.blocking.hris.benefits.IndividualService
import java.util.function.Consumer

interface BenefitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BenefitService

    fun individuals(): IndividualService

    /**
     * Creates a new company-wide deduction or contribution. Please use the `/providers` endpoint to
     * view available types for each provider.
     */
    fun create(params: HrisBenefitCreateParams): CreateCompanyBenefitsResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: HrisBenefitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateCompanyBenefitsResponse

    /** Lists deductions and contributions information for a given item */
    fun retrieve(benefitId: String, params: HrisBenefitRetrieveParams): CompanyBenefit =
        retrieve(benefitId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        benefitId: String,
        params: HrisBenefitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyBenefit = retrieve(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: HrisBenefitRetrieveParams): CompanyBenefit =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: HrisBenefitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyBenefit

    /** Updates an existing company-wide deduction or contribution */
    fun update(benefitId: String, params: HrisBenefitUpdateParams): UpdateCompanyBenefitResponse =
        update(benefitId, params, RequestOptions.none())

    /** @see update */
    fun update(
        benefitId: String,
        params: HrisBenefitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UpdateCompanyBenefitResponse =
        update(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see update */
    fun update(params: HrisBenefitUpdateParams): UpdateCompanyBenefitResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: HrisBenefitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UpdateCompanyBenefitResponse

    /** List all company-wide deductions and contributions. */
    fun list(params: HrisBenefitListParams): HrisBenefitListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: HrisBenefitListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisBenefitListPage

    /** Get deductions metadata */
    fun listSupportedBenefits(
        params: HrisBenefitListSupportedBenefitsParams
    ): HrisBenefitListSupportedBenefitsPage = listSupportedBenefits(params, RequestOptions.none())

    /** @see listSupportedBenefits */
    fun listSupportedBenefits(
        params: HrisBenefitListSupportedBenefitsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisBenefitListSupportedBenefitsPage

    /** A view of [BenefitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BenefitService.WithRawResponse

        fun individuals(): IndividualService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /employer/benefits`, but is otherwise the same as
         * [BenefitService.create].
         */
        @MustBeClosed
        fun create(
            params: HrisBenefitCreateParams
        ): HttpResponseFor<CreateCompanyBenefitsResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: HrisBenefitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateCompanyBenefitsResponse>

        /**
         * Returns a raw HTTP response for `get /employer/benefits/{benefit_id}`, but is otherwise
         * the same as [BenefitService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            benefitId: String,
            params: HrisBenefitRetrieveParams,
        ): HttpResponseFor<CompanyBenefit> = retrieve(benefitId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            benefitId: String,
            params: HrisBenefitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyBenefit> =
            retrieve(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: HrisBenefitRetrieveParams): HttpResponseFor<CompanyBenefit> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: HrisBenefitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyBenefit>

        /**
         * Returns a raw HTTP response for `post /employer/benefits/{benefit_id}`, but is otherwise
         * the same as [BenefitService.update].
         */
        @MustBeClosed
        fun update(
            benefitId: String,
            params: HrisBenefitUpdateParams,
        ): HttpResponseFor<UpdateCompanyBenefitResponse> =
            update(benefitId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            benefitId: String,
            params: HrisBenefitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UpdateCompanyBenefitResponse> =
            update(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: HrisBenefitUpdateParams): HttpResponseFor<UpdateCompanyBenefitResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: HrisBenefitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UpdateCompanyBenefitResponse>

        /**
         * Returns a raw HTTP response for `get /employer/benefits`, but is otherwise the same as
         * [BenefitService.list].
         */
        @MustBeClosed
        fun list(params: HrisBenefitListParams): HttpResponseFor<HrisBenefitListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: HrisBenefitListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisBenefitListPage>

        /**
         * Returns a raw HTTP response for `get /employer/benefits/meta`, but is otherwise the same
         * as [BenefitService.listSupportedBenefits].
         */
        @MustBeClosed
        fun listSupportedBenefits(
            params: HrisBenefitListSupportedBenefitsParams
        ): HttpResponseFor<HrisBenefitListSupportedBenefitsPage> =
            listSupportedBenefits(params, RequestOptions.none())

        /** @see listSupportedBenefits */
        @MustBeClosed
        fun listSupportedBenefits(
            params: HrisBenefitListSupportedBenefitsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisBenefitListSupportedBenefitsPage>
    }
}
