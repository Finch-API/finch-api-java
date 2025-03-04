// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.hris

import com.google.errorprone.annotations.MustBeClosed
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

interface BenefitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun individuals(): IndividualService

    /**
     * Creates a new company-wide deduction or contribution. Please use the `/providers` endpoint to
     * view available types for each provider.
     */
    @JvmOverloads
    fun create(
        params: HrisBenefitCreateParams = HrisBenefitCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateCompanyBenefitsResponse

    /**
     * Creates a new company-wide deduction or contribution. Please use the `/providers` endpoint to
     * view available types for each provider.
     */
    fun create(requestOptions: RequestOptions): CreateCompanyBenefitsResponse =
        create(HrisBenefitCreateParams.none(), requestOptions)

    /** Lists deductions and contributions information for a given item */
    @JvmOverloads
    fun retrieve(
        params: HrisBenefitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyBenefit

    /** Updates an existing company-wide deduction or contribution */
    @JvmOverloads
    fun update(
        params: HrisBenefitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UpdateCompanyBenefitResponse

    /** List all company-wide deductions and contributions. */
    @JvmOverloads
    fun list(
        params: HrisBenefitListParams = HrisBenefitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisBenefitListPage

    /** List all company-wide deductions and contributions. */
    fun list(requestOptions: RequestOptions): HrisBenefitListPage =
        list(HrisBenefitListParams.none(), requestOptions)

    /** Get deductions metadata */
    @JvmOverloads
    fun listSupportedBenefits(
        params: HrisBenefitListSupportedBenefitsParams =
            HrisBenefitListSupportedBenefitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisBenefitListSupportedBenefitsPage

    /** Get deductions metadata */
    fun listSupportedBenefits(
        requestOptions: RequestOptions
    ): HrisBenefitListSupportedBenefitsPage =
        listSupportedBenefits(HrisBenefitListSupportedBenefitsParams.none(), requestOptions)

    /** A view of [BenefitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun individuals(): IndividualService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /employer/benefits`, but is otherwise the same as
         * [BenefitService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: HrisBenefitCreateParams = HrisBenefitCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateCompanyBenefitsResponse>

        /**
         * Returns a raw HTTP response for `post /employer/benefits`, but is otherwise the same as
         * [BenefitService.create].
         */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<CreateCompanyBenefitsResponse> =
            create(HrisBenefitCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/benefits/{benefit_id}`, but is otherwise
         * the same as [BenefitService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: HrisBenefitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyBenefit>

        /**
         * Returns a raw HTTP response for `post /employer/benefits/{benefit_id}`, but is otherwise
         * the same as [BenefitService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: HrisBenefitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UpdateCompanyBenefitResponse>

        /**
         * Returns a raw HTTP response for `get /employer/benefits`, but is otherwise the same as
         * [BenefitService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: HrisBenefitListParams = HrisBenefitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisBenefitListPage>

        /**
         * Returns a raw HTTP response for `get /employer/benefits`, but is otherwise the same as
         * [BenefitService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<HrisBenefitListPage> =
            list(HrisBenefitListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/benefits/meta`, but is otherwise the same
         * as [BenefitService.listSupportedBenefits].
         */
        @JvmOverloads
        @MustBeClosed
        fun listSupportedBenefits(
            params: HrisBenefitListSupportedBenefitsParams =
                HrisBenefitListSupportedBenefitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisBenefitListSupportedBenefitsPage>

        /**
         * Returns a raw HTTP response for `get /employer/benefits/meta`, but is otherwise the same
         * as [BenefitService.listSupportedBenefits].
         */
        @MustBeClosed
        fun listSupportedBenefits(
            requestOptions: RequestOptions
        ): HttpResponseFor<HrisBenefitListSupportedBenefitsPage> =
            listSupportedBenefits(HrisBenefitListSupportedBenefitsParams.none(), requestOptions)
    }
}
