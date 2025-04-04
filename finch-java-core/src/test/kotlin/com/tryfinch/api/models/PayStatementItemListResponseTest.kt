// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayStatementItemListResponseTest {

    @Test
    fun create() {
        val payStatementItemListResponse =
            PayStatementItemListResponse.builder()
                .attributes(
                    PayStatementItemListResponse.Attributes.builder()
                        .employer(true)
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .preTax(true)
                        .type("type")
                        .build()
                )
                .category(PayStatementItemListResponse.Category.EARNINGS)
                .name("name")
                .build()

        assertThat(payStatementItemListResponse.attributes())
            .contains(
                PayStatementItemListResponse.Attributes.builder()
                    .employer(true)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .preTax(true)
                    .type("type")
                    .build()
            )
        assertThat(payStatementItemListResponse.category())
            .contains(PayStatementItemListResponse.Category.EARNINGS)
        assertThat(payStatementItemListResponse.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val payStatementItemListResponse =
            PayStatementItemListResponse.builder()
                .attributes(
                    PayStatementItemListResponse.Attributes.builder()
                        .employer(true)
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .preTax(true)
                        .type("type")
                        .build()
                )
                .category(PayStatementItemListResponse.Category.EARNINGS)
                .name("name")
                .build()

        val roundtrippedPayStatementItemListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(payStatementItemListResponse),
                jacksonTypeRef<PayStatementItemListResponse>(),
            )

        assertThat(roundtrippedPayStatementItemListResponse).isEqualTo(payStatementItemListResponse)
    }
}
