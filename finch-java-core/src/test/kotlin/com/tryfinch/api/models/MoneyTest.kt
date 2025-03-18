// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MoneyTest {

    @Test
    fun create() {
        val money = Money.builder().amount(0L).currency("currency").build()

        assertThat(money.amount()).contains(0L)
        assertThat(money.currency()).contains("currency")
    }
}
