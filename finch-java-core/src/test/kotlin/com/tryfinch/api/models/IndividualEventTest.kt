// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualEventTest {

    @Test
    fun create() {
        val individualEvent =
            IndividualEvent.builder()
                .accountId("account_id")
                .companyId("company_id")
                .connectionId("connection_id")
                .data(IndividualEvent.Data.builder().individualId("individual_id").build())
                .eventType(IndividualEvent.EventType.INDIVIDUAL_CREATED)
                .build()

        assertThat(individualEvent.accountId()).isEqualTo("account_id")
        assertThat(individualEvent.companyId()).isEqualTo("company_id")
        assertThat(individualEvent.connectionId()).contains("connection_id")
        assertThat(individualEvent.data())
            .contains(IndividualEvent.Data.builder().individualId("individual_id").build())
        assertThat(individualEvent.eventType())
            .contains(IndividualEvent.EventType.INDIVIDUAL_CREATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val individualEvent =
            IndividualEvent.builder()
                .accountId("account_id")
                .companyId("company_id")
                .connectionId("connection_id")
                .data(IndividualEvent.Data.builder().individualId("individual_id").build())
                .eventType(IndividualEvent.EventType.INDIVIDUAL_CREATED)
                .build()

        val roundtrippedIndividualEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(individualEvent),
                jacksonTypeRef<IndividualEvent>(),
            )

        assertThat(roundtrippedIndividualEvent).isEqualTo(individualEvent)
    }
}
