@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.async.hris

import java.util.concurrent.CompletableFuture
import org.finch.api.core.RequestOptions
import org.finch.api.models.Company
import org.finch.api.models.HrisCompanyRetrieveParams

interface CompanyServiceAsync {

    /** Read basic company data */
    @JvmOverloads
    fun retrieve(
        params: HrisCompanyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Company>
}
