@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.hris.benefits

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HriBenefitIndividualEnrolledIdsParams
import com.tryfinch.api.models.HriBenefitIndividualRetrieveManyBenefitsPage
import com.tryfinch.api.models.HriBenefitIndividualRetrieveManyBenefitsParams
import com.tryfinch.api.models.HriBenefitIndividualUnenrollPage
import com.tryfinch.api.models.HriBenefitIndividualUnenrollParams
import com.tryfinch.api.models.IndividualEnrolledIdsResponse

interface IndividualService {

    /**
     * **Availability: Automated Benefits providers only**
     *
     * Lists individuals currently enrolled in a given benefit.
     */
    fun enrolledIds(
        params: HriBenefitIndividualEnrolledIdsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): IndividualEnrolledIdsResponse

    /**
     * **Availability: Automated Benefits providers only**
     *
     * Get enrolled benefit information for the given individuals.
     */
    fun retrieveManyBenefits(
        params: HriBenefitIndividualRetrieveManyBenefitsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HriBenefitIndividualRetrieveManyBenefitsPage

    /**
     * **Availability: Automated and Assisted Benefits providers**
     *
     * Unenroll individuals from a benefit
     */
    fun unenroll(
        params: HriBenefitIndividualUnenrollParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HriBenefitIndividualUnenrollPage
}
