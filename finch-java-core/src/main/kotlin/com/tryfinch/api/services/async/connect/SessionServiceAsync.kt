// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.connect

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.ConnectSessionNewParams
import com.tryfinch.api.models.ConnectSessionReauthenticateParams
import com.tryfinch.api.models.SessionNewResponse
import com.tryfinch.api.models.SessionReauthenticateResponse
import java.util.concurrent.CompletableFuture

interface SessionServiceAsync {

    /** Create a new connect session for an employer */
    @JvmOverloads
    fun new_(
        params: ConnectSessionNewParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<SessionNewResponse>

    /** Create a new Connect session for reauthenticating an existing connection */
    @JvmOverloads
    fun reauthenticate(
        params: ConnectSessionReauthenticateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<SessionReauthenticateResponse>
}
