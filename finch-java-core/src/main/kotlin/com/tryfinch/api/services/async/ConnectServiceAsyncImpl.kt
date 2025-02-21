// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.services.async.connect.SessionServiceAsync
import com.tryfinch.api.services.async.connect.SessionServiceAsyncImpl

class ConnectServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConnectServiceAsync {

    private val sessions: SessionServiceAsync by lazy { SessionServiceAsyncImpl(clientOptions) }

    override fun sessions(): SessionServiceAsync = sessions
}
