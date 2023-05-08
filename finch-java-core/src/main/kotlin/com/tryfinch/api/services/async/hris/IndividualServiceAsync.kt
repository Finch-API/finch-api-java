@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HriIndividualRetrieveManyPageAsync
import com.tryfinch.api.models.HriIndividualRetrieveManyParams
import com.tryfinch.api.services.async.hris.individuals.EmploymentDataServiceAsync
import java.util.concurrent.CompletableFuture

interface IndividualServiceAsync {

    fun employmentData(): EmploymentDataServiceAsync

    /** Read individual data, excluding income and employment data */
    @JvmOverloads
    fun retrieveMany(
        params: HriIndividualRetrieveManyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<HriIndividualRetrieveManyPageAsync>
}
