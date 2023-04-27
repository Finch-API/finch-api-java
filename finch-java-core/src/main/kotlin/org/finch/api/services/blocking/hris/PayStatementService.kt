@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.blocking.hris

import org.finch.api.core.RequestOptions
import org.finch.api.models.HrisPayStatementRetrieveManyPage
import org.finch.api.models.HrisPayStatementRetrieveManyParams

interface PayStatementService {

    /**
     * Read detailed pay statements for each individual.
     *
     * Deduction and contribution types are supported by the payroll systems that support Benefits.
     */
    @JvmOverloads
    fun retrieveMany(
        params: HrisPayStatementRetrieveManyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HrisPayStatementRetrieveManyPage
}
