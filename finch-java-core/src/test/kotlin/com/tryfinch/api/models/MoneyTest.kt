// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MoneyTest {

    @Test
    fun createMoney() {
        val money = Money.builder().amount(123L).currency("string").build()
        assertThat(money).isNotNull
        assertThat(money.amount()).contains(123L)
        assertThat(money.currency()).contains("string")
    }
}
