// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.ProviderListPage
import com.tryfinch.api.models.ProviderListParams

interface ProviderService {

    /** Return details on all available payroll and HR systems. */
    @JvmOverloads
    fun list(
        params: ProviderListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProviderListPage
}
