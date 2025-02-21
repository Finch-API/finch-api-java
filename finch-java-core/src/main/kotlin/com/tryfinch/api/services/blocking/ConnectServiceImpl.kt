// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.services.blocking.connect.SessionService
import com.tryfinch.api.services.blocking.connect.SessionServiceImpl

class ConnectServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConnectService {

    private val sessions: SessionService by lazy { SessionServiceImpl(clientOptions) }

    override fun sessions(): SessionService = sessions
}
