// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.services.blocking.connect.SessionService
import com.tryfinch.api.services.blocking.connect.SessionServiceImpl

class ConnectServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : ConnectService {

    private val withRawResponse: ConnectService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val sessions: SessionService by lazy { SessionServiceImpl(clientOptions) }

    override fun withRawResponse(): ConnectService.WithRawResponse = withRawResponse

    override fun sessions(): SessionService = sessions

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : ConnectService.WithRawResponse {

        private val sessions: SessionService.WithRawResponse by lazy { SessionServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun sessions(): SessionService.WithRawResponse = sessions
    }
}
