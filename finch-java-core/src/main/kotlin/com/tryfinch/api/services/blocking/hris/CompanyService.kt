@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.Company
import com.tryfinch.api.models.HrisCompanyRetrieveParams

interface CompanyService {

    /** Read basic company data */
    @JvmOverloads
    fun retrieve(
        params: HrisCompanyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Company
}
