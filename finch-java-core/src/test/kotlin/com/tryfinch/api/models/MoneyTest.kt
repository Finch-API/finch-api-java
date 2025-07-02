// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MoneyTest {

    @Test
    fun create() {
        val money = Money.builder().amount(0L).currency("currency").build()

        assertThat(money.amount()).contains(0L)
        assertThat(money.currency()).isEqualTo("currency")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val money = Money.builder().amount(0L).currency("currency").build()

        val roundtrippedMoney =
            jsonMapper.readValue(jsonMapper.writeValueAsString(money), jacksonTypeRef<Money>())

        assertThat(roundtrippedMoney).isEqualTo(money)
    }
}
