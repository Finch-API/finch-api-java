// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PayrollPayGroupRetrieveParamsTest {

    @Test
    fun createPayrollPayGroupRetrieveParams() {
        PayrollPayGroupRetrieveParams.builder().payGroupId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = PayrollPayGroupRetrieveParams.builder().payGroupId("string").build()
        assertThat(params).isNotNull
        // path param "payGroupId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
