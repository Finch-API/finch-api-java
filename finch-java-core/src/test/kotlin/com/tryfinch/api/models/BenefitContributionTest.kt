// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import com.tryfinch.api.errors.FinchInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class BenefitContributionTest {

    @Test
    fun ofFixed() {
        val fixed =
            BenefitContribution.BenefitContributionFixed.builder()
                .amount(0L)
                .type(BenefitContribution.BenefitContributionFixed.Type.FIXED)
                .build()

        val benefitContribution = BenefitContribution.ofFixed(fixed)

        assertThat(benefitContribution.fixed()).contains(fixed)
        assertThat(benefitContribution.percent()).isEmpty
        assertThat(benefitContribution.tiered()).isEmpty
    }

    @Test
    fun ofFixedRoundtrip() {
        val jsonMapper = jsonMapper()
        val benefitContribution =
            BenefitContribution.ofFixed(
                BenefitContribution.BenefitContributionFixed.builder()
                    .amount(0L)
                    .type(BenefitContribution.BenefitContributionFixed.Type.FIXED)
                    .build()
            )

        val roundtrippedBenefitContribution =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(benefitContribution),
                jacksonTypeRef<BenefitContribution>(),
            )

        assertThat(roundtrippedBenefitContribution).isEqualTo(benefitContribution)
    }

    @Test
    fun ofPercent() {
        val percent =
            BenefitContribution.BenefitContributionPercent.builder()
                .amount(0L)
                .type(BenefitContribution.BenefitContributionPercent.Type.PERCENT)
                .build()

        val benefitContribution = BenefitContribution.ofPercent(percent)

        assertThat(benefitContribution.fixed()).isEmpty
        assertThat(benefitContribution.percent()).contains(percent)
        assertThat(benefitContribution.tiered()).isEmpty
    }

    @Test
    fun ofPercentRoundtrip() {
        val jsonMapper = jsonMapper()
        val benefitContribution =
            BenefitContribution.ofPercent(
                BenefitContribution.BenefitContributionPercent.builder()
                    .amount(0L)
                    .type(BenefitContribution.BenefitContributionPercent.Type.PERCENT)
                    .build()
            )

        val roundtrippedBenefitContribution =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(benefitContribution),
                jacksonTypeRef<BenefitContribution>(),
            )

        assertThat(roundtrippedBenefitContribution).isEqualTo(benefitContribution)
    }

    @Test
    fun ofTiered() {
        val tiered =
            BenefitContribution.BenefitContributionTiered.builder()
                .addTier(
                    BenefitContribution.BenefitContributionTiered.Tier.builder()
                        .match(1L)
                        .threshold(1L)
                        .build()
                )
                .type(BenefitContribution.BenefitContributionTiered.Type.TIERED)
                .build()

        val benefitContribution = BenefitContribution.ofTiered(tiered)

        assertThat(benefitContribution.fixed()).isEmpty
        assertThat(benefitContribution.percent()).isEmpty
        assertThat(benefitContribution.tiered()).contains(tiered)
    }

    @Test
    fun ofTieredRoundtrip() {
        val jsonMapper = jsonMapper()
        val benefitContribution =
            BenefitContribution.ofTiered(
                BenefitContribution.BenefitContributionTiered.builder()
                    .addTier(
                        BenefitContribution.BenefitContributionTiered.Tier.builder()
                            .match(1L)
                            .threshold(1L)
                            .build()
                    )
                    .type(BenefitContribution.BenefitContributionTiered.Type.TIERED)
                    .build()
            )

        val roundtrippedBenefitContribution =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(benefitContribution),
                jacksonTypeRef<BenefitContribution>(),
            )

        assertThat(roundtrippedBenefitContribution).isEqualTo(benefitContribution)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val benefitContribution =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<BenefitContribution>())

        val e = assertThrows<FinchInvalidDataException> { benefitContribution.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
