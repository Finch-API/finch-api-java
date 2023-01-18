package org.finch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.finch.api.models.*
import org.junit.jupiter.api.Test

class AtsApplicationRetrieveParamsTest {

    @Test
    fun createAtsApplicationRetrieveParams() {
        AtsApplicationRetrieveParams.builder().applicationId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = AtsApplicationRetrieveParams.builder().applicationId("string").build()
        assertThat(params).isNotNull
        // path param "applicationId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
