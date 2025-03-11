// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SupportPerBenefitTypeTest {

    @Test
    fun createSupportPerBenefitType() {
      val supportPerBenefitType = SupportPerBenefitType.builder()
          .companyBenefits(OperationSupportMatrix.builder()
              .create(OperationSupport.SUPPORTED)
              .delete(OperationSupport.SUPPORTED)
              .read(OperationSupport.SUPPORTED)
              .update(OperationSupport.SUPPORTED)
              .build())
          .individualBenefits(OperationSupportMatrix.builder()
              .create(OperationSupport.SUPPORTED)
              .delete(OperationSupport.SUPPORTED)
              .read(OperationSupport.SUPPORTED)
              .update(OperationSupport.SUPPORTED)
              .build())
          .build()
      assertThat(supportPerBenefitType).isNotNull
      assertThat(supportPerBenefitType.companyBenefits()).contains(OperationSupportMatrix.builder()
          .create(OperationSupport.SUPPORTED)
          .delete(OperationSupport.SUPPORTED)
          .read(OperationSupport.SUPPORTED)
          .update(OperationSupport.SUPPORTED)
          .build())
      assertThat(supportPerBenefitType.individualBenefits()).contains(OperationSupportMatrix.builder()
          .create(OperationSupport.SUPPORTED)
          .delete(OperationSupport.SUPPORTED)
          .read(OperationSupport.SUPPORTED)
          .update(OperationSupport.SUPPORTED)
          .build())
    }
}
