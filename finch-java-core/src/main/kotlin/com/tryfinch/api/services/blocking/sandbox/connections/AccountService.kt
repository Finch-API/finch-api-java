// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.sandbox.connections

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.AccountCreateResponse
import com.tryfinch.api.models.AccountUpdateResponse
import com.tryfinch.api.models.SandboxConnectionAccountCreateParams
import com.tryfinch.api.models.SandboxConnectionAccountUpdateParams

interface AccountService {

    /** Create a new account for an existing connection (company/provider pair) */
    @JvmOverloads
    fun create(
        params: SandboxConnectionAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountCreateResponse

    /**
     * Update an existing sandbox account. Change the connection status to understand how the Finch
     * API responds.
     */
    @JvmOverloads
    fun update(
        params: SandboxConnectionAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountUpdateResponse
}
