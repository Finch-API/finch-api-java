// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SupportPerBenefitTypeTest {

    @Test
    fun create() {
        val supportPerBenefitType =
            SupportPerBenefitType.builder()
                .companyBenefits(
                    OperationSupportMatrix.builder()
                        .create(OperationSupport.SUPPORTED)
                        .delete(OperationSupport.SUPPORTED)
                        .read(OperationSupport.SUPPORTED)
                        .update(OperationSupport.SUPPORTED)
                        .build()
                )
                .individualBenefits(
                    OperationSupportMatrix.builder()
                        .create(OperationSupport.SUPPORTED)
                        .delete(OperationSupport.SUPPORTED)
                        .read(OperationSupport.SUPPORTED)
                        .update(OperationSupport.SUPPORTED)
                        .build()
                )
                .build()

        assertThat(supportPerBenefitType.companyBenefits())
            .contains(
                OperationSupportMatrix.builder()
                    .create(OperationSupport.SUPPORTED)
                    .delete(OperationSupport.SUPPORTED)
                    .read(OperationSupport.SUPPORTED)
                    .update(OperationSupport.SUPPORTED)
                    .build()
            )
        assertThat(supportPerBenefitType.individualBenefits())
            .contains(
                OperationSupportMatrix.builder()
                    .create(OperationSupport.SUPPORTED)
                    .delete(OperationSupport.SUPPORTED)
                    .read(OperationSupport.SUPPORTED)
                    .update(OperationSupport.SUPPORTED)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val supportPerBenefitType =
            SupportPerBenefitType.builder()
                .companyBenefits(
                    OperationSupportMatrix.builder()
                        .create(OperationSupport.SUPPORTED)
                        .delete(OperationSupport.SUPPORTED)
                        .read(OperationSupport.SUPPORTED)
                        .update(OperationSupport.SUPPORTED)
                        .build()
                )
                .individualBenefits(
                    OperationSupportMatrix.builder()
                        .create(OperationSupport.SUPPORTED)
                        .delete(OperationSupport.SUPPORTED)
                        .read(OperationSupport.SUPPORTED)
                        .update(OperationSupport.SUPPORTED)
                        .build()
                )
                .build()

        val roundtrippedSupportPerBenefitType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(supportPerBenefitType),
                jacksonTypeRef<SupportPerBenefitType>(),
            )

        assertThat(roundtrippedSupportPerBenefitType).isEqualTo(supportPerBenefitType)
    }
}
