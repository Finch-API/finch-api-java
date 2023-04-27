@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.blocking.hris.benefits

import org.finch.api.core.RequestOptions
import org.finch.api.models.HrisBenefitsIndividualEnrolledIdsParams
import org.finch.api.models.HrisBenefitsIndividualRetrieveManyBenefitsPage
import org.finch.api.models.HrisBenefitsIndividualRetrieveManyBenefitsParams
import org.finch.api.models.HrisBenefitsIndividualUnenrollPage
import org.finch.api.models.HrisBenefitsIndividualUnenrollParams
import org.finch.api.models.IndividualEnrolledIdsResponse

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
