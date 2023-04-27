@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.async.hris

import java.util.concurrent.CompletableFuture
import org.finch.api.core.RequestOptions
import org.finch.api.models.HrisIndividualRetrieveManyPageAsync
import org.finch.api.models.HrisIndividualRetrieveManyParams
import org.finch.api.services.async.hris.individuals.EmploymentDataServiceAsync

interface IndividualServiceAsync {

    fun employmentData(): EmploymentDataServiceAsync

    /** Read individual data, excluding income and employment data */
    @JvmOverloads
    fun retrieveMany(
        params: HrisIndividualRetrieveManyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<HrisIndividualRetrieveManyPageAsync>
}
