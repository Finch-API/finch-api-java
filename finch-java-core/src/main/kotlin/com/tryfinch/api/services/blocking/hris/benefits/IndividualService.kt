@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.hris.benefits

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HrisBenefitsIndividualEnrolledIdsParams
import com.tryfinch.api.models.HrisBenefitsIndividualRetrieveManyBenefitsPage
import com.tryfinch.api.models.HrisBenefitsIndividualRetrieveManyBenefitsParams
import com.tryfinch.api.models.HrisBenefitsIndividualUnenrollPage
import com.tryfinch.api.models.HrisBenefitsIndividualUnenrollParams
import com.tryfinch.api.models.IndividualEnrolledIdsResponse

interface IndividualService {

    /**
     * **Availability: Automated Benefits providers only**
     *
     * Lists individuals currently enrolled in a given benefit.
     */
    @JvmOverloads
    fun enrolledIds(
        params: HrisBenefitsIndividualEnrolledIdsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): IndividualEnrolledIdsResponse

    /**
     * **Availability: Automated Benefits providers only**
     *
     * Get enrolled benefit information for the given individuals.
     */
    @JvmOverloads
    fun retrieveManyBenefits(
        params: HrisBenefitsIndividualRetrieveManyBenefitsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HrisBenefitsIndividualRetrieveManyBenefitsPage

    /**
     * **Availability: Automated and Assisted Benefits providers**
     *
     * Unenroll individuals from a benefit
     */
    @JvmOverloads
    fun unenroll(
        params: HrisBenefitsIndividualUnenrollParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HrisBenefitsIndividualUnenrollPage
}
