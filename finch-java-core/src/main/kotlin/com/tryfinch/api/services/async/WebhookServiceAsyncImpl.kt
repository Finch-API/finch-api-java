// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions

class WebhookServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : WebhookServiceAsync {

    private val withRawResponse: WebhookServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): WebhookServiceAsync.WithRawResponse = withRawResponse

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : WebhookServiceAsync.WithRawResponse
}
