package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BenfitContributionTest {

    @Test
    fun createBenfitContribution() {
        val benfitContribution =
            BenfitContribution.builder().amount(123L).type(BenfitContribution.Type.FIXED).build()
        assertThat(benfitContribution).isNotNull
        assertThat(benfitContribution.type()).contains(BenfitContribution.Type.FIXED)
        assertThat(benfitContribution.amount()).contains(123L)
    }
}
