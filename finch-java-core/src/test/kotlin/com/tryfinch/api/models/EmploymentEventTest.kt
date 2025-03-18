// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmploymentEventTest {

    @Test
    fun create() {
        val employmentEvent =
            EmploymentEvent.builder()
                .accountId("account_id")
                .companyId("company_id")
                .connectionId("connection_id")
                .data(EmploymentEvent.Data.builder().individualId("individual_id").build())
                .eventType(EmploymentEvent.EventType.EMPLOYMENT_CREATED)
                .build()

        assertThat(employmentEvent.accountId()).isEqualTo("account_id")
        assertThat(employmentEvent.companyId()).isEqualTo("company_id")
        assertThat(employmentEvent.connectionId()).contains("connection_id")
        assertThat(employmentEvent.data())
            .contains(EmploymentEvent.Data.builder().individualId("individual_id").build())
        assertThat(employmentEvent.eventType())
            .contains(EmploymentEvent.EventType.EMPLOYMENT_CREATED)
    }
}
