// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayStatementEventTest {

    @Test
    fun create() {
        val payStatementEvent =
            PayStatementEvent.builder()
                .accountId("account_id")
                .companyId("company_id")
                .connectionId("connection_id")
                .data(
                    PayStatementEvent.Data.builder()
                        .individualId("individual_id")
                        .paymentId("payment_id")
                        .build()
                )
                .eventType(PayStatementEvent.EventType.PAY_STATEMENT_CREATED)
                .build()

        assertThat(payStatementEvent.accountId()).isEqualTo("account_id")
        assertThat(payStatementEvent.companyId()).isEqualTo("company_id")
        assertThat(payStatementEvent.connectionId()).contains("connection_id")
        assertThat(payStatementEvent.data())
            .contains(
                PayStatementEvent.Data.builder()
                    .individualId("individual_id")
                    .paymentId("payment_id")
                    .build()
            )
        assertThat(payStatementEvent.eventType())
            .contains(PayStatementEvent.EventType.PAY_STATEMENT_CREATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val payStatementEvent =
            PayStatementEvent.builder()
                .accountId("account_id")
                .companyId("company_id")
                .connectionId("connection_id")
                .data(
                    PayStatementEvent.Data.builder()
                        .individualId("individual_id")
                        .paymentId("payment_id")
                        .build()
                )
                .eventType(PayStatementEvent.EventType.PAY_STATEMENT_CREATED)
                .build()

        val roundtrippedPayStatementEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(payStatementEvent),
                jacksonTypeRef<PayStatementEvent>(),
            )

        assertThat(roundtrippedPayStatementEvent).isEqualTo(payStatementEvent)
    }
}
