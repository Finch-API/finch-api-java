// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisBenefitIndividualUnenrollManyParamsTest {

    @Test
    fun create() {
        HrisBenefitIndividualUnenrollManyParams.builder()
            .benefitId("benefit_id")
            .addEntityId("550e8400-e29b-41d4-a716-446655440000")
            .addIndividualId("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            HrisBenefitIndividualUnenrollManyParams.builder()
                .benefitId("benefit_id")
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("benefit_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            HrisBenefitIndividualUnenrollManyParams.builder()
                .benefitId("benefit_id")
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .addIndividualId("string")
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
            HrisBenefitIndividualUnenrollManyParams.builder()
                .benefitId("benefit_id")
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
            HrisBenefitIndividualUnenrollManyParams.builder()
                .benefitId("benefit_id")
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .addIndividualId("string")
                .build()

        val body = params._body()

        assertThat(body.individualIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            HrisBenefitIndividualUnenrollManyParams.builder()
                .benefitId("benefit_id")
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .build()

        val body = params._body()
    }
}
