// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.ClientOptions

class WebhookServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : WebhookService {

    private val withRawResponse: WebhookService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): WebhookService.WithRawResponse = withRawResponse

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : WebhookService.WithRawResponse
}
