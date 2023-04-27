@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.async.hris.individuals

import java.util.concurrent.CompletableFuture
import org.finch.api.core.RequestOptions
import org.finch.api.models.HrisIndividualsEmploymentDataRetrieveManyPageAsync
import org.finch.api.models.HrisIndividualsEmploymentDataRetrieveManyParams

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
        params: HrisIndividualsEmploymentDataRetrieveManyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<HrisIndividualsEmploymentDataRetrieveManyPageAsync>
}
