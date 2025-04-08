// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyEventTest {

    @Test
    fun create() {
        val companyEvent =
            CompanyEvent.builder()
                .accountId("account_id")
                .companyId("company_id")
                .connectionId("connection_id")
                .data(
                    CompanyEvent.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .eventType(CompanyEvent.EventType.COMPANY_UPDATED)
                .build()

        assertThat(companyEvent.accountId()).isEqualTo("account_id")
        assertThat(companyEvent.companyId()).isEqualTo("company_id")
        assertThat(companyEvent.connectionId()).contains("connection_id")
        assertThat(companyEvent.data())
            .contains(
                CompanyEvent.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(companyEvent.eventType()).contains(CompanyEvent.EventType.COMPANY_UPDATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companyEvent =
            CompanyEvent.builder()
                .accountId("account_id")
                .companyId("company_id")
                .connectionId("connection_id")
                .data(
                    CompanyEvent.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .eventType(CompanyEvent.EventType.COMPANY_UPDATED)
                .build()

        val roundtrippedCompanyEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companyEvent),
                jacksonTypeRef<CompanyEvent>(),
            )

        assertThat(roundtrippedCompanyEvent).isEqualTo(companyEvent)
    }
}
