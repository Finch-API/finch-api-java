package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IncomeTest {

    @Test
    fun createIncome() {
        val income =
            Income.builder()
                .amount(123L)
                .currency("string")
                .effectiveDate("string")
                .unit(Income.Unit.YEARLY)
                .build()
        assertThat(income).isNotNull
        assertThat(income.amount()).contains(123L)
        assertThat(income.currency()).contains("string")
        assertThat(income.effectiveDate()).contains("string")
        assertThat(income.unit()).contains(Income.Unit.YEARLY)
    }
}
