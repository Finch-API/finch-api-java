// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectoryEventTest {

    @Test
    fun create() {
        val directoryEvent =
            DirectoryEvent.builder()
                .accountId("account_id")
                .companyId("company_id")
                .connectionId("connection_id")
                .data(DirectoryEvent.Data.builder().individualId("individual_id").build())
                .eventType(DirectoryEvent.EventType.DIRECTORY_CREATED)
                .build()

        assertThat(directoryEvent.accountId()).isEqualTo("account_id")
        assertThat(directoryEvent.companyId()).isEqualTo("company_id")
        assertThat(directoryEvent.connectionId()).contains("connection_id")
        assertThat(directoryEvent.data())
            .contains(DirectoryEvent.Data.builder().individualId("individual_id").build())
        assertThat(directoryEvent.eventType()).contains(DirectoryEvent.EventType.DIRECTORY_CREATED)
    }
}
