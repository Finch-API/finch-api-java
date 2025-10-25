// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisCompanyPayStatementItemRuleUpdateParamsTest {

    @Test
    fun create() {
        HrisCompanyPayStatementItemRuleUpdateParams.builder()
            .ruleId("rule_id")
            .addEntityId("550e8400-e29b-41d4-a716-446655440000")
            .optionalProperty(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            HrisCompanyPayStatementItemRuleUpdateParams.builder()
                .ruleId("rule_id")
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("rule_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            HrisCompanyPayStatementItemRuleUpdateParams.builder()
                .ruleId("rule_id")
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .optionalProperty(JsonValue.from(mapOf<String, Any>()))
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
        val params =
            HrisCompanyPayStatementItemRuleUpdateParams.builder()
                .ruleId("rule_id")
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
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
    fun body() {
        val params =
            HrisCompanyPayStatementItemRuleUpdateParams.builder()
                .ruleId("rule_id")
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .optionalProperty(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body._optionalProperty()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            HrisCompanyPayStatementItemRuleUpdateParams.builder()
                .ruleId("rule_id")
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .build()

        val body = params._body()
    }
}
