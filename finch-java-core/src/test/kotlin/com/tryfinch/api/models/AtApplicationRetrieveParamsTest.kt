package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AtApplicationRetrieveParamsTest {

    @Test
    fun createAtApplicationRetrieveParams() {
        AtApplicationRetrieveParams.builder().applicationId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = AtApplicationRetrieveParams.builder().applicationId("string").build()
        assertThat(params).isNotNull
        // path param "applicationId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
