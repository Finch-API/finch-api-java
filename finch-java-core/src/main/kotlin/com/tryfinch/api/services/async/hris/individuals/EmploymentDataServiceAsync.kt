@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.hris.individuals

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HriIndividualEmploymentDataRetrieveManyPageAsync
import com.tryfinch.api.models.HriIndividualEmploymentDataRetrieveManyParams
import java.util.concurrent.CompletableFuture

interface EmploymentDataServiceAsync {

    /**
     * Read individual employment and income data
     *
     * Note: Income information is returned as reported by the provider. This may not always be
     * annualized income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on
     * what information the provider returns.
     */
    @JvmOverloads
    fun retrieveMany(
        params: HriIndividualEmploymentDataRetrieveManyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<HriIndividualEmploymentDataRetrieveManyPageAsync>
}
