@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.blocking.hris

import org.finch.api.core.RequestOptions
import org.finch.api.models.HrisIndividualRetrieveManyPage
import org.finch.api.models.HrisIndividualRetrieveManyParams
import org.finch.api.services.blocking.hris.individuals.EmploymentDataService

interface IndividualService {

    fun employmentData(): EmploymentDataService

    /** Read individual data, excluding income and employment data */
    @JvmOverloads
    fun retrieveMany(
        params: HrisIndividualRetrieveManyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HrisIndividualRetrieveManyPage
}
