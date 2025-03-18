// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BenefitContributionTest {

    @Test
    fun create() {
        val benefitContribution =
            BenefitContribution.builder().amount(0L).type(BenefitContribution.Type.FIXED).build()

        assertThat(benefitContribution.amount()).contains(0L)
        assertThat(benefitContribution.type()).contains(BenefitContribution.Type.FIXED)
    }
}
