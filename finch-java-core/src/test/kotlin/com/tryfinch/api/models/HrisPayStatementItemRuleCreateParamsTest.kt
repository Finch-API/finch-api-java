// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisPayStatementItemRuleCreateParamsTest {

    @Test
    fun create() {
        HrisPayStatementItemRuleCreateParams.builder()
            .addEntityId("550e8400-e29b-41d4-a716-446655440000")
            .attributes(
                HrisPayStatementItemRuleCreateParams.Attributes.builder()
                    .metadata(
                        HrisPayStatementItemRuleCreateParams.Attributes.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
            .addCondition(
                HrisPayStatementItemRuleCreateParams.Condition.builder()
                    .field("field")
                    .operator(HrisPayStatementItemRuleCreateParams.Condition.Operator.EQUALS)
                    .value("value")
                    .build()
            )
            .effectiveEndDate("effective_end_date")
            .effectiveStartDate("effective_start_date")
            .entityType(HrisPayStatementItemRuleCreateParams.EntityType.PAY_STATEMENT_ITEM)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            HrisPayStatementItemRuleCreateParams.builder()
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .attributes(
                    HrisPayStatementItemRuleCreateParams.Attributes.builder()
                        .metadata(
                            HrisPayStatementItemRuleCreateParams.Attributes.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addCondition(
                    HrisPayStatementItemRuleCreateParams.Condition.builder()
                        .field("field")
                        .operator(HrisPayStatementItemRuleCreateParams.Condition.Operator.EQUALS)
                        .value("value")
                        .build()
                )
                .effectiveEndDate("effective_end_date")
                .effectiveStartDate("effective_start_date")
                .entityType(HrisPayStatementItemRuleCreateParams.EntityType.PAY_STATEMENT_ITEM)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("entity_ids[]", "550e8400-e29b-41d4-a716-446655440000")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = HrisPayStatementItemRuleCreateParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            HrisPayStatementItemRuleCreateParams.builder()
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .attributes(
                    HrisPayStatementItemRuleCreateParams.Attributes.builder()
                        .metadata(
                            HrisPayStatementItemRuleCreateParams.Attributes.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addCondition(
                    HrisPayStatementItemRuleCreateParams.Condition.builder()
                        .field("field")
                        .operator(HrisPayStatementItemRuleCreateParams.Condition.Operator.EQUALS)
                        .value("value")
                        .build()
                )
                .effectiveEndDate("effective_end_date")
                .effectiveStartDate("effective_start_date")
                .entityType(HrisPayStatementItemRuleCreateParams.EntityType.PAY_STATEMENT_ITEM)
                .build()

        val body = params._body()

        assertThat(body.attributes())
            .contains(
                HrisPayStatementItemRuleCreateParams.Attributes.builder()
                    .metadata(
                        HrisPayStatementItemRuleCreateParams.Attributes.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.conditions().getOrNull())
            .containsExactly(
                HrisPayStatementItemRuleCreateParams.Condition.builder()
                    .field("field")
                    .operator(HrisPayStatementItemRuleCreateParams.Condition.Operator.EQUALS)
                    .value("value")
                    .build()
            )
        assertThat(body.effectiveEndDate()).contains("effective_end_date")
        assertThat(body.effectiveStartDate()).contains("effective_start_date")
        assertThat(body.entityType())
            .contains(HrisPayStatementItemRuleCreateParams.EntityType.PAY_STATEMENT_ITEM)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = HrisPayStatementItemRuleCreateParams.builder().build()

        val body = params._body()
    }
}
