// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class W42020Test {

    @Test
    fun createW42020() {
        val w42020 =
            W42020.builder()
                .data(
                    W42020.Data.builder()
                        .amountForOtherDependents(0L)
                        .amountForQualifyingChildrenUnder17(0L)
                        .deductions(0L)
                        .extraWithholding(0L)
                        .filingStatus(W42020.Data.FilingStatus.HEAD_OF_HOUSEHOLD)
                        .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .otherIncome(0L)
                        .totalClaimDependentAndOtherCredits(0L)
                        .build()
                )
                .type(W42020.Type.W4_2020)
                .year(0.0)
                .build()
        assertThat(w42020).isNotNull
        assertThat(w42020.data())
            .contains(
                W42020.Data.builder()
                    .amountForOtherDependents(0L)
                    .amountForQualifyingChildrenUnder17(0L)
                    .deductions(0L)
                    .extraWithholding(0L)
                    .filingStatus(W42020.Data.FilingStatus.HEAD_OF_HOUSEHOLD)
                    .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .otherIncome(0L)
                    .totalClaimDependentAndOtherCredits(0L)
                    .build()
            )
        assertThat(w42020.type()).contains(W42020.Type.W4_2020)
        assertThat(w42020.year()).contains(0.0)
    }
}
