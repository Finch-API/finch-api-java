// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisCompanyPayStatementItemRuleCreateParamsTest {

    @Test
    fun create() {
        HrisCompanyPayStatementItemRuleCreateParams.builder()
            .attributes(
                HrisCompanyPayStatementItemRuleCreateParams.Attributes.builder()
                    .metadata(
                        HrisCompanyPayStatementItemRuleCreateParams.Attributes.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
            .addCondition(
                HrisCompanyPayStatementItemRuleCreateParams.Condition.builder()
                    .field("field")
                    .operator(HrisCompanyPayStatementItemRuleCreateParams.Condition.Operator.EQUALS)
                    .value("value")
                    .build()
            )
            .effectiveEndDate("effective_end_date")
            .effectiveStartDate("effective_start_date")
            .entityType(HrisCompanyPayStatementItemRuleCreateParams.EntityType.PAY_STATEMENT_ITEM)
            .build()
    }

    @Test
    fun body() {
        val params =
            HrisCompanyPayStatementItemRuleCreateParams.builder()
                .attributes(
                    HrisCompanyPayStatementItemRuleCreateParams.Attributes.builder()
                        .metadata(
                            HrisCompanyPayStatementItemRuleCreateParams.Attributes.Metadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addCondition(
                    HrisCompanyPayStatementItemRuleCreateParams.Condition.builder()
                        .field("field")
                        .operator(
                            HrisCompanyPayStatementItemRuleCreateParams.Condition.Operator.EQUALS
                        )
                        .value("value")
                        .build()
                )
                .effectiveEndDate("effective_end_date")
                .effectiveStartDate("effective_start_date")
                .entityType(
                    HrisCompanyPayStatementItemRuleCreateParams.EntityType.PAY_STATEMENT_ITEM
                )
                .build()

        val body = params._body()

        assertThat(body.attributes())
            .contains(
                HrisCompanyPayStatementItemRuleCreateParams.Attributes.builder()
                    .metadata(
                        HrisCompanyPayStatementItemRuleCreateParams.Attributes.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.conditions().getOrNull())
            .containsExactly(
                HrisCompanyPayStatementItemRuleCreateParams.Condition.builder()
                    .field("field")
                    .operator(HrisCompanyPayStatementItemRuleCreateParams.Condition.Operator.EQUALS)
                    .value("value")
                    .build()
            )
        assertThat(body.effectiveEndDate()).contains("effective_end_date")
        assertThat(body.effectiveStartDate()).contains("effective_start_date")
        assertThat(body.entityType())
            .contains(HrisCompanyPayStatementItemRuleCreateParams.EntityType.PAY_STATEMENT_ITEM)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = HrisCompanyPayStatementItemRuleCreateParams.builder().build()

        val body = params._body()
    }
}
