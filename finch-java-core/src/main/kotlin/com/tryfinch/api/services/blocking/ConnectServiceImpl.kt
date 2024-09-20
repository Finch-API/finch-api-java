// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.services.blocking.connect.SessionService
import com.tryfinch.api.services.blocking.connect.SessionServiceImpl
import com.tryfinch.api.services.errorHandler

class ConnectServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ConnectService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val sessions: SessionService by lazy { SessionServiceImpl(clientOptions) }

    override fun sessions(): SessionService = sessions
}
