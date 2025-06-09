// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val benefitContribution =
            BenefitContribution.builder().amount(0L).type(BenefitContribution.Type.FIXED).build()

        val roundtrippedBenefitContribution =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(benefitContribution),
                jacksonTypeRef<BenefitContribution>(),
            )

        assertThat(roundtrippedBenefitContribution).isEqualTo(benefitContribution)
    }
}
