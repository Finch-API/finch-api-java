// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IncomeTest {

    @Test
    fun create() {
        val income =
            Income.builder()
                .amount(0L)
                .currency("currency")
                .effectiveDate("effective_date")
                .unit(Income.Unit.YEARLY)
                .build()

        assertThat(income.amount()).contains(0L)
        assertThat(income.currency()).contains("currency")
        assertThat(income.effectiveDate()).contains("effective_date")
        assertThat(income.unit()).contains(Income.Unit.YEARLY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val income =
            Income.builder()
                .amount(0L)
                .currency("currency")
                .effectiveDate("effective_date")
                .unit(Income.Unit.YEARLY)
                .build()

        val roundtrippedIncome =
            jsonMapper.readValue(jsonMapper.writeValueAsString(income), jacksonTypeRef<Income>())

        assertThat(roundtrippedIncome).isEqualTo(income)
    }
}
