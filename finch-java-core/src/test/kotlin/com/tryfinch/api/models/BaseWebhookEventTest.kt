// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BaseWebhookEventTest {

    @Test
    fun createBaseWebhookEvent() {
        val baseWebhookEvent =
            BaseWebhookEvent.builder().accountId("string").companyId("string").build()
        assertThat(baseWebhookEvent).isNotNull
        assertThat(baseWebhookEvent.accountId()).isEqualTo("string")
        assertThat(baseWebhookEvent.companyId()).isEqualTo("string")
    }
}
