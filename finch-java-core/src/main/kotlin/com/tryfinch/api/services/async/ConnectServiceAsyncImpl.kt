// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.services.async.connect.SessionServiceAsync
import com.tryfinch.api.services.async.connect.SessionServiceAsyncImpl
import com.tryfinch.api.services.errorHandler

class ConnectServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ConnectServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val sessions: SessionServiceAsync by lazy { SessionServiceAsyncImpl(clientOptions) }

    override fun sessions(): SessionServiceAsync = sessions
}
