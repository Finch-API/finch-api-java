@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HriPayStatementRetrieveManyPageAsync
import com.tryfinch.api.models.HriPayStatementRetrieveManyParams

interface PayStatementServiceAsync {

    /**
     * Read detailed pay statements for each individual.
     *
     * Deduction and contribution types are supported by the payroll systems that support Benefits.
     */
    suspend fun retrieveMany(
        params: HriPayStatementRetrieveManyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HriPayStatementRetrieveManyPageAsync
}
