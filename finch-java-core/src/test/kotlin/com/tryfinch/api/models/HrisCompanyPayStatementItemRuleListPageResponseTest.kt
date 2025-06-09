// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisCompanyPayStatementItemRuleListPageResponseTest {

    @Test
    fun create() {
        val hrisCompanyPayStatementItemRuleListPageResponse =
            HrisCompanyPayStatementItemRuleListPageResponse.builder()
                .addResponse(
                    RuleListResponse.builder()
                        .id("id")
                        .attributes(
                            RuleListResponse.Attributes.builder()
                                .metadata(
                                    RuleListResponse.Attributes.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .addCondition(
                            RuleListResponse.Condition.builder()
                                .field("field")
                                .operator(RuleListResponse.Condition.Operator.EQUALS)
                                .value("value")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveEndDate("effective_end_date")
                        .effectiveStartDate("effective_start_date")
                        .entityType(RuleListResponse.EntityType.PAY_STATEMENT_ITEM)
                        .priority(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(hrisCompanyPayStatementItemRuleListPageResponse.responses())
            .containsExactly(
                RuleListResponse.builder()
                    .id("id")
                    .attributes(
                        RuleListResponse.Attributes.builder()
                            .metadata(
                                RuleListResponse.Attributes.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .addCondition(
                        RuleListResponse.Condition.builder()
                            .field("field")
                            .operator(RuleListResponse.Condition.Operator.EQUALS)
                            .value("value")
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveEndDate("effective_end_date")
                    .effectiveStartDate("effective_start_date")
                    .entityType(RuleListResponse.EntityType.PAY_STATEMENT_ITEM)
                    .priority(0L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hrisCompanyPayStatementItemRuleListPageResponse =
            HrisCompanyPayStatementItemRuleListPageResponse.builder()
                .addResponse(
                    RuleListResponse.builder()
                        .id("id")
                        .attributes(
                            RuleListResponse.Attributes.builder()
                                .metadata(
                                    RuleListResponse.Attributes.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .addCondition(
                            RuleListResponse.Condition.builder()
                                .field("field")
                                .operator(RuleListResponse.Condition.Operator.EQUALS)
                                .value("value")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveEndDate("effective_end_date")
                        .effectiveStartDate("effective_start_date")
                        .entityType(RuleListResponse.EntityType.PAY_STATEMENT_ITEM)
                        .priority(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedHrisCompanyPayStatementItemRuleListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hrisCompanyPayStatementItemRuleListPageResponse),
                jacksonTypeRef<HrisCompanyPayStatementItemRuleListPageResponse>(),
            )

        assertThat(roundtrippedHrisCompanyPayStatementItemRuleListPageResponse)
            .isEqualTo(hrisCompanyPayStatementItemRuleListPageResponse)
    }
}
