// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.RequestOptions
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

    fun individuals(): IndividualService

    /**
     * Creates a new company-wide deduction or contribution. Please use the `/providers` endpoint to
     * view available types for each provider.
     */
    @JvmOverloads
    fun create(
        params: HrisBenefitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateCompanyBenefitsResponse

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
        params: HrisBenefitListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisBenefitListPage

    /** Get deductions metadata */
    @JvmOverloads
    fun listSupportedBenefits(
        params: HrisBenefitListSupportedBenefitsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisBenefitListSupportedBenefitsPage
}
