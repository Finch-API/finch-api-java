@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.async.hris.benefits

import java.util.concurrent.CompletableFuture
import org.finch.api.core.RequestOptions
import org.finch.api.models.HrisBenefitsIndividualEnrolledIdsParams
import org.finch.api.models.HrisBenefitsIndividualRetrieveManyBenefitsPageAsync
import org.finch.api.models.HrisBenefitsIndividualRetrieveManyBenefitsParams
import org.finch.api.models.HrisBenefitsIndividualUnenrollPageAsync
import org.finch.api.models.HrisBenefitsIndividualUnenrollParams
import org.finch.api.models.IndividualEnrolledIdsResponse

interface IndividualServiceAsync {

    /**
     * **Availability: Automated Benefits providers only**
     *
     * Lists individuals currently enrolled in a given benefit.
     */
    @JvmOverloads
    fun enrolledIds(
        params: HrisBenefitsIndividualEnrolledIdsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<IndividualEnrolledIdsResponse>

    /**
     * **Availability: Automated Benefits providers only**
     *
     * Get enrolled benefit information for the given individuals.
     */
    @JvmOverloads
    fun retrieveManyBenefits(
        params: HrisBenefitsIndividualRetrieveManyBenefitsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<HrisBenefitsIndividualRetrieveManyBenefitsPageAsync>

    /**
     * **Availability: Automated and Assisted Benefits providers**
     *
     * Unenroll individuals from a benefit
     */
    @JvmOverloads
    fun unenroll(
        params: HrisBenefitsIndividualUnenrollParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<HrisBenefitsIndividualUnenrollPageAsync>
}
