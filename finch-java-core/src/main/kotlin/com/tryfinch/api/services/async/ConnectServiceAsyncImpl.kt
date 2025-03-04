// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.services.async.connect.SessionServiceAsync
import com.tryfinch.api.services.async.connect.SessionServiceAsyncImpl

class ConnectServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConnectServiceAsync {

    private val withRawResponse: ConnectServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val sessions: SessionServiceAsync by lazy { SessionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ConnectServiceAsync.WithRawResponse = withRawResponse

    override fun sessions(): SessionServiceAsync = sessions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConnectServiceAsync.WithRawResponse {

        private val sessions: SessionServiceAsync.WithRawResponse by lazy {
            SessionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun sessions(): SessionServiceAsync.WithRawResponse = sessions
    }
}
