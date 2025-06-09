// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class W42005Test {

    @Test
    fun create() {
        val w42005 =
            W42005.builder()
                .data(
                    W42005.Data.builder()
                        .additionalWithholding(0L)
                        .exemption(W42005.Data.Exemption.EXEMPT)
                        .filingStatus(W42005.Data.FilingStatus.MARRIED)
                        .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .totalNumberOfAllowances(0L)
                        .build()
                )
                .type(W42005.Type.W4_2005)
                .year(0.0)
                .build()

        assertThat(w42005.data())
            .contains(
                W42005.Data.builder()
                    .additionalWithholding(0L)
                    .exemption(W42005.Data.Exemption.EXEMPT)
                    .filingStatus(W42005.Data.FilingStatus.MARRIED)
                    .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .totalNumberOfAllowances(0L)
                    .build()
            )
        assertThat(w42005.type()).contains(W42005.Type.W4_2005)
        assertThat(w42005.year()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val w42005 =
            W42005.builder()
                .data(
                    W42005.Data.builder()
                        .additionalWithholding(0L)
                        .exemption(W42005.Data.Exemption.EXEMPT)
                        .filingStatus(W42005.Data.FilingStatus.MARRIED)
                        .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .totalNumberOfAllowances(0L)
                        .build()
                )
                .type(W42005.Type.W4_2005)
                .year(0.0)
                .build()

        val roundtrippedW42005 =
            jsonMapper.readValue(jsonMapper.writeValueAsString(w42005), jacksonTypeRef<W42005>())

        assertThat(roundtrippedW42005).isEqualTo(w42005)
    }
}
