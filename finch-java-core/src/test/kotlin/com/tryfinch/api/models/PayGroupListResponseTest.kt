// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PayGroupListResponseTest {

    @Test
    fun createPayGroupListResponse() {
      val payGroupListResponse = PayGroupListResponse.builder()
          .id("id")
          .name("name")
          .addPayFrequency(PayGroupListResponse.PayFrequency.ANNUALLY)
          .build()
      assertThat(payGroupListResponse).isNotNull
      assertThat(payGroupListResponse.id()).contains("id")
      assertThat(payGroupListResponse.name()).contains("name")
      assertThat(payGroupListResponse.payFrequencies().get()).containsExactly(PayGroupListResponse.PayFrequency.ANNUALLY)
    }
}
