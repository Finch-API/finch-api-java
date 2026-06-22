// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisPayStatementItemListPageResponseTest {

    @Test
    fun create() {
        val hrisPayStatementItemListPageResponse =
            HrisPayStatementItemListPageResponse.builder()
                .addResponse(
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
                )
                .build()

        assertThat(hrisPayStatementItemListPageResponse.responses())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hrisPayStatementItemListPageResponse =
            HrisPayStatementItemListPageResponse.builder()
                .addResponse(
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
                )
                .build()

        val roundtrippedHrisPayStatementItemListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hrisPayStatementItemListPageResponse),
                jacksonTypeRef<HrisPayStatementItemListPageResponse>(),
            )

        assertThat(roundtrippedHrisPayStatementItemListPageResponse)
            .isEqualTo(hrisPayStatementItemListPageResponse)
    }
}
