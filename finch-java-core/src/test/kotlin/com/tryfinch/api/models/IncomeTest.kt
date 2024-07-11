// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IncomeTest {

    @Test
    fun createIncome() {
        val income =
            Income.builder()
                .amount(123L)
                .currency("currency")
                .effectiveDate("effective_date")
                .unit(Income.Unit.YEARLY)
                .build()
        assertThat(income).isNotNull
        assertThat(income.amount()).contains(123L)
        assertThat(income.currency()).contains("currency")
        assertThat(income.effectiveDate()).contains("effective_date")
        assertThat(income.unit()).contains(Income.Unit.YEARLY)
    }
}
