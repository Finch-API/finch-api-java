package org.finch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.finch.api.models.*
import org.junit.jupiter.api.Test

class AtsOfferRetrieveParamsTest {

    @Test
    fun createAtsOfferRetrieveParams() {
        AtsOfferRetrieveParams.builder().offerId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = AtsOfferRetrieveParams.builder().offerId("string").build()
        assertThat(params).isNotNull
        // path param "offerId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
