@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.hris.benefits

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HriBenefitIndividualEnrolledIdsParams
import com.tryfinch.api.models.HriBenefitIndividualRetrieveManyBenefitsPageAsync
import com.tryfinch.api.models.HriBenefitIndividualRetrieveManyBenefitsParams
import com.tryfinch.api.models.HriBenefitIndividualUnenrollPageAsync
import com.tryfinch.api.models.HriBenefitIndividualUnenrollParams
import com.tryfinch.api.models.IndividualEnrolledIdsResponse
import java.util.concurrent.CompletableFuture

interface IndividualServiceAsync {

    /**
     * **Availability: Automated Benefits providers only**
     *
     * Lists individuals currently enrolled in a given benefit.
     */
    @JvmOverloads
    fun enrolledIds(
        params: HriBenefitIndividualEnrolledIdsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<IndividualEnrolledIdsResponse>

    /**
     * **Availability: Automated Benefits providers only**
     *
     * Get enrolled benefit information for the given individuals.
     */
    @JvmOverloads
    fun retrieveManyBenefits(
        params: HriBenefitIndividualRetrieveManyBenefitsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<HriBenefitIndividualRetrieveManyBenefitsPageAsync>

    /**
     * **Availability: Automated and Assisted Benefits providers**
     *
     * Unenroll individuals from a benefit
     */
    @JvmOverloads
    fun unenroll(
        params: HriBenefitIndividualUnenrollParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<HriBenefitIndividualUnenrollPageAsync>
}
