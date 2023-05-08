package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IncomeTest {

    @Test
    fun createIncome() {
        val income =
            Income.builder()
                .unit(Income.Unit.YEARLY)
                .amount(123L)
                .currency("string")
                .effectiveDate("string")
                .build()
        assertThat(income).isNotNull
        assertThat(income.unit()).isEqualTo(Income.Unit.YEARLY)
        assertThat(income.amount()).isEqualTo(123L)
        assertThat(income.currency()).isEqualTo("string")
        assertThat(income.effectiveDate()).isEqualTo("string")
    }
}
