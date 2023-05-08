@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HriPayStatementRetrieveManyPage
import com.tryfinch.api.models.HriPayStatementRetrieveManyParams

interface PayStatementService {

    /**
     * Read detailed pay statements for each individual.
     *
     * Deduction and contribution types are supported by the payroll systems that support Benefits.
     */
    @JvmOverloads
    fun retrieveMany(
        params: HriPayStatementRetrieveManyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HriPayStatementRetrieveManyPage
}
