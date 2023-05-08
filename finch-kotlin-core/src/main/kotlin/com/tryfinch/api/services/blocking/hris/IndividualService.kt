@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HriIndividualRetrieveManyPage
import com.tryfinch.api.models.HriIndividualRetrieveManyParams
import com.tryfinch.api.services.blocking.hris.individuals.EmploymentDataService

interface IndividualService {

    fun employmentData(): EmploymentDataService

    /** Read individual data, excluding income and employment data */
    fun retrieveMany(
        params: HriIndividualRetrieveManyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HriIndividualRetrieveManyPage
}
