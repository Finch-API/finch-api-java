// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UnenrolledIndividualTest {

    @Test
    fun createUnenrolledIndividual() {
      val unenrolledIndividual = UnenrolledIndividual.builder()
          .body(UnenrolledIndividual.Body.builder()
              .finchCode("finch_code")
              .message("message")
              .name("name")
              .build())
          .code(0L)
          .individualId("individual_id")
          .build()
      assertThat(unenrolledIndividual).isNotNull
      assertThat(unenrolledIndividual.body()).contains(UnenrolledIndividual.Body.builder()
          .finchCode("finch_code")
          .message("message")
          .name("name")
          .build())
      assertThat(unenrolledIndividual.code()).contains(0L)
      assertThat(unenrolledIndividual.individualId()).contains("individual_id")
    }
}
