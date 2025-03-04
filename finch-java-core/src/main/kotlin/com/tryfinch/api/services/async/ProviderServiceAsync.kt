// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.ProviderListPageAsync
import com.tryfinch.api.models.ProviderListParams
import java.util.concurrent.CompletableFuture

interface ProviderServiceAsync {

    /** Return details on all available payroll and HR systems. */
    @JvmOverloads
    fun list(
        params: ProviderListParams = ProviderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProviderListPageAsync>

    /** Return details on all available payroll and HR systems. */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProviderListPageAsync> =
        list(ProviderListParams.none(), requestOptions)
}
