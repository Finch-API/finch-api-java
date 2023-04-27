package org.finch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.finch.api.models.*
import org.junit.jupiter.api.Test

class AtsCandidateRetrieveParamsTest {

    @Test
    fun createAtsCandidateRetrieveParams() {
        AtsCandidateRetrieveParams.builder().candidateId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = AtsCandidateRetrieveParams.builder().candidateId("string").build()
        assertThat(params).isNotNull
        // path param "candidateId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
