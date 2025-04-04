// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleDeleteResponseTest {

    @Test
    fun create() {
        val ruleDeleteResponse =
            RuleDeleteResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .attributes(
                    RuleDeleteResponse.Attributes.builder()
                        .metadata(
                            RuleDeleteResponse.Attributes.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addCondition(
                    RuleDeleteResponse.Condition.builder()
                        .field("field")
                        .operator(RuleDeleteResponse.Condition.Operator.EQUALS)
                        .value("value")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveEndDate("effective_end_date")
                .effectiveStartDate("effective_start_date")
                .entityType(RuleDeleteResponse.EntityType.PAY_STATEMENT_ITEM)
                .priority(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(ruleDeleteResponse.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ruleDeleteResponse.attributes())
            .contains(
                RuleDeleteResponse.Attributes.builder()
                    .metadata(
                        RuleDeleteResponse.Attributes.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(ruleDeleteResponse.conditions().getOrNull())
            .containsExactly(
                RuleDeleteResponse.Condition.builder()
                    .field("field")
                    .operator(RuleDeleteResponse.Condition.Operator.EQUALS)
                    .value("value")
                    .build()
            )
        assertThat(ruleDeleteResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ruleDeleteResponse.deletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ruleDeleteResponse.effectiveEndDate()).contains("effective_end_date")
        assertThat(ruleDeleteResponse.effectiveStartDate()).contains("effective_start_date")
        assertThat(ruleDeleteResponse.entityType())
            .contains(RuleDeleteResponse.EntityType.PAY_STATEMENT_ITEM)
        assertThat(ruleDeleteResponse.priority()).contains(0L)
        assertThat(ruleDeleteResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ruleDeleteResponse =
            RuleDeleteResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .attributes(
                    RuleDeleteResponse.Attributes.builder()
                        .metadata(
                            RuleDeleteResponse.Attributes.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addCondition(
                    RuleDeleteResponse.Condition.builder()
                        .field("field")
                        .operator(RuleDeleteResponse.Condition.Operator.EQUALS)
                        .value("value")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveEndDate("effective_end_date")
                .effectiveStartDate("effective_start_date")
                .entityType(RuleDeleteResponse.EntityType.PAY_STATEMENT_ITEM)
                .priority(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedRuleDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleDeleteResponse),
                jacksonTypeRef<RuleDeleteResponse>(),
            )

        assertThat(roundtrippedRuleDeleteResponse).isEqualTo(ruleDeleteResponse)
    }
}
