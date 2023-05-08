@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.CompanyBenefit
import com.tryfinch.api.models.CreateCompanyBenefitsResponse
import com.tryfinch.api.models.HriBenefitCreateParams
import com.tryfinch.api.models.HriBenefitListPage
import com.tryfinch.api.models.HriBenefitListParams
import com.tryfinch.api.models.HriBenefitListSupportedBenefitsPage
import com.tryfinch.api.models.HriBenefitListSupportedBenefitsParams
import com.tryfinch.api.models.HriBenefitRetrieveParams
import com.tryfinch.api.models.HriBenefitUpdateParams
import com.tryfinch.api.models.UpdateCompanyBenefitResponse
import com.tryfinch.api.services.blocking.hris.benefits.IndividualService

interface BenefitService {

    fun individuals(): IndividualService

    /**
     * **Availability: Automated and Assisted Benefits providers**
     *
     * Creates a new company-wide benefit. Please use the `/meta` endpoint to view available types
     * for each provider.
     */
    @JvmOverloads
    fun create(
        params: HriBenefitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CreateCompanyBenefitsResponse

    /**
     * **Availability: Automated Benefits providers only**
     *
     * Lists benefit information for a given benefit
     */
    @JvmOverloads
    fun retrieve(
        params: HriBenefitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompanyBenefit

    /**
     * **Availability: Automated and Assisted Benefits providers**
     *
     * Updates an existing company-wide benefit
     */
    @JvmOverloads
    fun update(
        params: HriBenefitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): UpdateCompanyBenefitResponse

    /**
     * **Availability: Automated Benefits providers only**
     *
     * List all company-wide benefits.
     */
    @JvmOverloads
    fun list(
        params: HriBenefitListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HriBenefitListPage

    /**
     * **Availability: Automated and Assisted Benefits providers**
     *
     * Lists available types and configurations for the provider associated with the access token.
     */
    @JvmOverloads
    fun listSupportedBenefits(
        params: HriBenefitListSupportedBenefitsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HriBenefitListSupportedBenefitsPage
}
