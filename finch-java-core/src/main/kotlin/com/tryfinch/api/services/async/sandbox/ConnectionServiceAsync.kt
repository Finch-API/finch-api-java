// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.sandbox

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.ConnectionCreateResponse
import com.tryfinch.api.models.SandboxConnectionCreateParams
import com.tryfinch.api.services.async.sandbox.connections.AccountServiceAsync
import java.util.concurrent.CompletableFuture

interface ConnectionServiceAsync {

    fun accounts(): AccountServiceAsync

    /** Create a new connection (new company/provider pair) with a new account */
    @JvmOverloads
    fun create(
        params: SandboxConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionCreateResponse>
}
