@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.async.hris

import java.util.concurrent.CompletableFuture
import org.finch.api.core.RequestOptions
import org.finch.api.models.HrisPayStatementRetrieveManyPageAsync
import org.finch.api.models.HrisPayStatementRetrieveManyParams

interface PayStatementServiceAsync {

    /**
     * Read detailed pay statements for each individual.
     *
     * Deduction and contribution types are supported by the payroll systems that support Benefits.
     */
    @JvmOverloads
    fun retrieveMany(
        params: HrisPayStatementRetrieveManyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<HrisPayStatementRetrieveManyPageAsync>
}
