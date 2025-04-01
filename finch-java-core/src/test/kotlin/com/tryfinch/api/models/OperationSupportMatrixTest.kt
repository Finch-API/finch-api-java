// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OperationSupportMatrixTest {

    @Test
    fun create() {
        val operationSupportMatrix =
            OperationSupportMatrix.builder()
                .create(OperationSupport.SUPPORTED)
                .delete(OperationSupport.SUPPORTED)
                .read(OperationSupport.SUPPORTED)
                .update(OperationSupport.SUPPORTED)
                .build()

        assertThat(operationSupportMatrix.create()).contains(OperationSupport.SUPPORTED)
        assertThat(operationSupportMatrix.delete()).contains(OperationSupport.SUPPORTED)
        assertThat(operationSupportMatrix.read()).contains(OperationSupport.SUPPORTED)
        assertThat(operationSupportMatrix.update()).contains(OperationSupport.SUPPORTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val operationSupportMatrix =
            OperationSupportMatrix.builder()
                .create(OperationSupport.SUPPORTED)
                .delete(OperationSupport.SUPPORTED)
                .read(OperationSupport.SUPPORTED)
                .update(OperationSupport.SUPPORTED)
                .build()

        val roundtrippedOperationSupportMatrix =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(operationSupportMatrix),
                jacksonTypeRef<OperationSupportMatrix>(),
            )

        assertThat(roundtrippedOperationSupportMatrix).isEqualTo(operationSupportMatrix)
    }
}
