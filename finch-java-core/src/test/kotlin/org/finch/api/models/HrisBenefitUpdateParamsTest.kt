package org.finch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.finch.api.models.*
import org.junit.jupiter.api.Test

class HrisBenefitUpdateParamsTest {

    @Test
    fun createHrisBenefitUpdateParams() {
        HrisBenefitUpdateParams.builder().benefitId("string").description("string").build()
    }

    @Test
    fun getBody() {
        val params =
            HrisBenefitUpdateParams.builder().benefitId("string").description("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = HrisBenefitUpdateParams.builder().benefitId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = HrisBenefitUpdateParams.builder().benefitId("string").build()
        assertThat(params).isNotNull
        // path param "benefitId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
