// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HrisBenefitIndividualEnrolledIdsParamsTest {

    @Test
    fun create() {
        HrisBenefitIndividualEnrolledIdsParams.builder().benefitId("benefit_id").build()
    }

    @Test
    fun getPathParam() {
        val params =
            HrisBenefitIndividualEnrolledIdsParams.builder().benefitId("benefit_id").build()
        assertThat(params).isNotNull
        // path param "benefitId"
        assertThat(params.getPathParam(0)).isEqualTo("benefit_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
