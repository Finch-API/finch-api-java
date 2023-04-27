package org.finch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.finch.api.models.*
import org.junit.jupiter.api.Test

class HrisBenefitsIndividualEnrolledIdsParamsTest {

    @Test
    fun createHrisBenefitsIndividualEnrolledIdsParams() {
        HrisBenefitsIndividualEnrolledIdsParams.builder().benefitId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = HrisBenefitsIndividualEnrolledIdsParams.builder().benefitId("string").build()
        assertThat(params).isNotNull
        // path param "benefitId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
