package org.finch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.finch.api.models.*
import org.junit.jupiter.api.Test

class AtsJobRetrieveParamsTest {

    @Test
    fun createAtsJobRetrieveParams() {
        AtsJobRetrieveParams.builder().jobId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = AtsJobRetrieveParams.builder().jobId("string").build()
        assertThat(params).isNotNull
        // path param "jobId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
