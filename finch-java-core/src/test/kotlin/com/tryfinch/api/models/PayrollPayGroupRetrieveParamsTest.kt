// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PayrollPayGroupRetrieveParamsTest {

    @Test
    fun create() {
      PayrollPayGroupRetrieveParams.builder()
          .payGroupId("pay_group_id")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = PayrollPayGroupRetrieveParams.builder()
          .payGroupId("pay_group_id")
          .build()
      assertThat(params).isNotNull
      // path param "payGroupId"
      assertThat(params.getPathParam(0)).isEqualTo("pay_group_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
