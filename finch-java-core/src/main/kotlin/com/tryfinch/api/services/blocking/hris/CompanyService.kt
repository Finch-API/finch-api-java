// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.Company
import com.tryfinch.api.models.HrisCompanyRetrieveParams

interface CompanyService {

    /** Read basic company data */
    @JvmOverloads
    fun retrieve(
        params: HrisCompanyRetrieveParams = HrisCompanyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Company

    /** Read basic company data */
    fun retrieve(requestOptions: RequestOptions): Company =
        retrieve(HrisCompanyRetrieveParams.none(), requestOptions)
}
