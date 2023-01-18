@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.blocking.hris

import org.finch.api.core.RequestOptions
import org.finch.api.models.CompanyBenefit
import org.finch.api.models.CreateCompanyBenefitsResponse
import org.finch.api.models.HrisBenefitCreateParams
import org.finch.api.models.HrisBenefitListPage
import org.finch.api.models.HrisBenefitListParams
import org.finch.api.models.HrisBenefitListSupportedBenefitsPage
import org.finch.api.models.HrisBenefitListSupportedBenefitsParams
import org.finch.api.models.HrisBenefitRetrieveParams
import org.finch.api.models.HrisBenefitUpdateParams
import org.finch.api.models.UpdateCompanyBenefitResponse
import org.finch.api.services.blocking.hris.benefits.IndividualService

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
        params: HrisBenefitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CreateCompanyBenefitsResponse

    /**
     * **Availability: Automated Benefits providers only**
     *
     * Lists benefit information for a given benefit
     */
    @JvmOverloads
    fun retrieve(
        params: HrisBenefitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompanyBenefit

    /**
     * **Availability: Automated and Assisted Benefits providers**
     *
     * Updates an existing company-wide benefit
     */
    @JvmOverloads
    fun update(
        params: HrisBenefitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): UpdateCompanyBenefitResponse

    /**
     * **Availability: Automated Benefits providers only**
     *
     * List all company-wide benefits.
     */
    @JvmOverloads
    fun list(
        params: HrisBenefitListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HrisBenefitListPage

    /**
     * **Availability: Automated and Assisted Benefits providers**
     *
     * Lists available types and configurations for the provider associated with the access token.
     */
    @JvmOverloads
    fun listSupportedBenefits(
        params: HrisBenefitListSupportedBenefitsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HrisBenefitListSupportedBenefitsPage
}
