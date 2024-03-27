// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.services.errorHandler

class WebhookServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : WebhookServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)
}
