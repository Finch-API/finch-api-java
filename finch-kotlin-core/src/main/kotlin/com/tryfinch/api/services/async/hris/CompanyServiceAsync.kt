@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.Company
import com.tryfinch.api.models.HriCompanyRetrieveParams

interface CompanyServiceAsync {

    /** Read basic company data */
    suspend fun retrieve(
        params: HriCompanyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Company
}
