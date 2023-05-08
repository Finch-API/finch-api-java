package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BenfitContributionTest {

    @Test
    fun createBenfitContribution() {
        val benfitContribution =
            BenfitContribution.builder().type(BenfitContribution.Type.FIXED).amount(123L).build()
        assertThat(benfitContribution).isNotNull
        assertThat(benfitContribution.type()).isEqualTo(BenfitContribution.Type.FIXED)
        assertThat(benfitContribution.amount()).isEqualTo(123L)
    }
}
