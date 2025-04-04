// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisCompanyPayStatementItemRuleUpdateParamsTest {

    @Test
    fun create() {
        HrisCompanyPayStatementItemRuleUpdateParams.builder()
            .ruleId("rule_id")
            .optionalProperty(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun pathParams() {
        val params = HrisCompanyPayStatementItemRuleUpdateParams.builder().ruleId("rule_id").build()

        assertThat(params._pathParam(0)).isEqualTo("rule_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            HrisCompanyPayStatementItemRuleUpdateParams.builder()
                .ruleId("rule_id")
                .optionalProperty(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body._optionalProperty()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = HrisCompanyPayStatementItemRuleUpdateParams.builder().ruleId("rule_id").build()

        val body = params._body()
    }
}
