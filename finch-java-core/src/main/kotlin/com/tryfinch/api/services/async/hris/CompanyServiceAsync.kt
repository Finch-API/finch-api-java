// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.Company
import com.tryfinch.api.models.HrisCompanyRetrieveParams
import java.util.concurrent.CompletableFuture

interface CompanyServiceAsync {

    /** Read basic company data */
    @JvmOverloads
    fun retrieve(
        params: HrisCompanyRetrieveParams = HrisCompanyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Company>

    /** Read basic company data */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<Company> =
        retrieve(HrisCompanyRetrieveParams.none(), requestOptions)
}
