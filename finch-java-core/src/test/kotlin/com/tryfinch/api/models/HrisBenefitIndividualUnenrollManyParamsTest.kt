// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import kotlin.jvm.optionals.getOrNull
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisBenefitIndividualUnenrollManyParamsTest {

    @Test
    fun create() {
        HrisBenefitIndividualUnenrollManyParams.builder()
            .benefitId("benefit_id")
            .addIndividualId("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            HrisBenefitIndividualUnenrollManyParams.builder().benefitId("benefit_id").build()

        assertThat(params._pathParam(0)).isEqualTo("benefit_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            HrisBenefitIndividualUnenrollManyParams.builder()
                .benefitId("benefit_id")
                .addIndividualId("string")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.individualIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            HrisBenefitIndividualUnenrollManyParams.builder().benefitId("benefit_id").build()

        val body = params._body()

        assertNotNull(body)
    }
}
