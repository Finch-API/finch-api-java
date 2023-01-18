@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.blocking.hris

import org.finch.api.core.RequestOptions
import org.finch.api.models.Company
import org.finch.api.models.HrisCompanyRetrieveParams

interface CompanyService {

    /** Read basic company data */
    @JvmOverloads
    fun retrieve(
        params: HrisCompanyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Company
}
