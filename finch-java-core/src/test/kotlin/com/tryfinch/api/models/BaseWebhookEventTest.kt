// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BaseWebhookEventTest {

    @Test
    fun createBaseWebhookEvent() {
        val baseWebhookEvent =
            BaseWebhookEvent.builder()
                .accountId("account_id")
                .companyId("company_id")
                .connectionId("connection_id")
                .build()
        assertThat(baseWebhookEvent).isNotNull
        assertThat(baseWebhookEvent.accountId()).isEqualTo("account_id")
        assertThat(baseWebhookEvent.companyId()).isEqualTo("company_id")
        assertThat(baseWebhookEvent.connectionId()).contains("connection_id")
    }
}
