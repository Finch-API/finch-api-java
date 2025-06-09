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
                        .metadata(
                            PayStatementItemListResponse.Attributes.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .employer(true)
                        .preTax(true)
                        .type("type")
                        .build()
                )
                .category(PayStatementItemListResponse.Category.EARNINGS)
                .name("name")
                .build()

        assertThat(payStatementItemListResponse.attributes())
            .isEqualTo(
                PayStatementItemListResponse.Attributes.builder()
                    .metadata(
                        PayStatementItemListResponse.Attributes.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .employer(true)
                    .preTax(true)
                    .type("type")
                    .build()
            )
        assertThat(payStatementItemListResponse.category())
            .isEqualTo(PayStatementItemListResponse.Category.EARNINGS)
        assertThat(payStatementItemListResponse.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val payStatementItemListResponse =
            PayStatementItemListResponse.builder()
                .attributes(
                    PayStatementItemListResponse.Attributes.builder()
                        .metadata(
                            PayStatementItemListResponse.Attributes.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .employer(true)
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
