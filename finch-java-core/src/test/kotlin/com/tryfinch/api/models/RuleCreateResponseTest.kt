// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleCreateResponseTest {

    @Test
    fun create() {
        val ruleCreateResponse =
            RuleCreateResponse.builder()
                .id("id")
                .attributes(
                    RuleCreateResponse.Attributes.builder()
                        .metadata(
                            RuleCreateResponse.Attributes.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addCondition(
                    RuleCreateResponse.Condition.builder()
                        .field("field")
                        .operator(RuleCreateResponse.Condition.Operator.EQUALS)
                        .value("value")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveEndDate("effective_end_date")
                .effectiveStartDate("effective_start_date")
                .entityType(RuleCreateResponse.EntityType.PAY_STATEMENT_ITEM)
                .priority(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(ruleCreateResponse.id()).contains("id")
        assertThat(ruleCreateResponse.attributes())
            .contains(
                RuleCreateResponse.Attributes.builder()
                    .metadata(
                        RuleCreateResponse.Attributes.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(ruleCreateResponse.conditions().getOrNull())
            .containsExactly(
                RuleCreateResponse.Condition.builder()
                    .field("field")
                    .operator(RuleCreateResponse.Condition.Operator.EQUALS)
                    .value("value")
                    .build()
            )
        assertThat(ruleCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ruleCreateResponse.effectiveEndDate()).contains("effective_end_date")
        assertThat(ruleCreateResponse.effectiveStartDate()).contains("effective_start_date")
        assertThat(ruleCreateResponse.entityType())
            .contains(RuleCreateResponse.EntityType.PAY_STATEMENT_ITEM)
        assertThat(ruleCreateResponse.priority()).contains(0L)
        assertThat(ruleCreateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ruleCreateResponse =
            RuleCreateResponse.builder()
                .id("id")
                .attributes(
                    RuleCreateResponse.Attributes.builder()
                        .metadata(
                            RuleCreateResponse.Attributes.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addCondition(
                    RuleCreateResponse.Condition.builder()
                        .field("field")
                        .operator(RuleCreateResponse.Condition.Operator.EQUALS)
                        .value("value")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveEndDate("effective_end_date")
                .effectiveStartDate("effective_start_date")
                .entityType(RuleCreateResponse.EntityType.PAY_STATEMENT_ITEM)
                .priority(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedRuleCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleCreateResponse),
                jacksonTypeRef<RuleCreateResponse>(),
            )

        assertThat(roundtrippedRuleCreateResponse).isEqualTo(ruleCreateResponse)
    }
}
