// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayrollPayGroupRetrieveParamsTest {

    @Test
    fun create() {
        PayrollPayGroupRetrieveParams.builder().payGroupId("pay_group_id").build()
    }

    @Test
    fun pathParams() {
        val params = PayrollPayGroupRetrieveParams.builder().payGroupId("pay_group_id").build()

        assertThat(params._pathParam(0)).isEqualTo("pay_group_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
