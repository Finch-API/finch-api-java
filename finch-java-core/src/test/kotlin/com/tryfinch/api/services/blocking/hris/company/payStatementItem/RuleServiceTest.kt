// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris.company.payStatementItem

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleCreateParams
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RuleServiceTest {

    @Test
    fun create() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val ruleService = client.hris().company().payStatementItem().rules()

        val rule =
            ruleService.create(
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
                                HrisCompanyPayStatementItemRuleCreateParams.Condition.Operator
                                    .EQUALS
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
            )

        rule.validate()
    }

    @Test
    fun update() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val ruleService = client.hris().company().payStatementItem().rules()

        val rule =
            ruleService.update(
                HrisCompanyPayStatementItemRuleUpdateParams.builder()
                    .ruleId("rule_id")
                    .optionalProperty(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        rule.validate()
    }

    @Test
    fun list() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val ruleService = client.hris().company().payStatementItem().rules()

        val page = ruleService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val ruleService = client.hris().company().payStatementItem().rules()

        val rule = ruleService.delete("rule_id")

        rule.validate()
    }
}
