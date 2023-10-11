// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BenefitContributionTest {

    @Test
    fun createBenefitContribution() {
        val benefitContribution =
            BenefitContribution.builder().amount(123L).type(BenefitContribution.Type.FIXED).build()
        assertThat(benefitContribution).isNotNull
        assertThat(benefitContribution.amount()).contains(123L)
        assertThat(benefitContribution.type()).contains(BenefitContribution.Type.FIXED)
    }
}
