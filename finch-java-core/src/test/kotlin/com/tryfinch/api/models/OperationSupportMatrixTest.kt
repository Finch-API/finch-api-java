// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OperationSupportMatrixTest {

    @Test
    fun createOperationSupportMatrix() {
      val operationSupportMatrix = OperationSupportMatrix.builder()
          .create(OperationSupport.SUPPORTED)
          .delete(OperationSupport.SUPPORTED)
          .read(OperationSupport.SUPPORTED)
          .update(OperationSupport.SUPPORTED)
          .build()
      assertThat(operationSupportMatrix).isNotNull
      assertThat(operationSupportMatrix.create()).contains(OperationSupport.SUPPORTED)
      assertThat(operationSupportMatrix.delete()).contains(OperationSupport.SUPPORTED)
      assertThat(operationSupportMatrix.read()).contains(OperationSupport.SUPPORTED)
      assertThat(operationSupportMatrix.update()).contains(OperationSupport.SUPPORTED)
    }
}
