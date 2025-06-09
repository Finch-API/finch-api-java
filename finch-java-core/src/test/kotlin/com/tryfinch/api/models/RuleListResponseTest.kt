// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleListResponseTest {

    @Test
    fun create() {
        val ruleListResponse =
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

        assertThat(ruleListResponse.id()).contains("id")
        assertThat(ruleListResponse.attributes())
            .contains(
                RuleListResponse.Attributes.builder()
                    .metadata(
                        RuleListResponse.Attributes.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(ruleListResponse.conditions().getOrNull())
            .containsExactly(
                RuleListResponse.Condition.builder()
                    .field("field")
                    .operator(RuleListResponse.Condition.Operator.EQUALS)
                    .value("value")
                    .build()
            )
        assertThat(ruleListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ruleListResponse.effectiveEndDate()).contains("effective_end_date")
        assertThat(ruleListResponse.effectiveStartDate()).contains("effective_start_date")
        assertThat(ruleListResponse.entityType())
            .contains(RuleListResponse.EntityType.PAY_STATEMENT_ITEM)
        assertThat(ruleListResponse.priority()).contains(0L)
        assertThat(ruleListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ruleListResponse =
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

        val roundtrippedRuleListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleListResponse),
                jacksonTypeRef<RuleListResponse>(),
            )

        assertThat(roundtrippedRuleListResponse).isEqualTo(ruleListResponse)
    }
}
