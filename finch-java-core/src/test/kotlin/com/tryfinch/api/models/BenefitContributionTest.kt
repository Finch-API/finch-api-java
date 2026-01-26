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
    fun ofUnionMember0() {
        val unionMember0 =
            BenefitContribution.UnionMember0.builder()
                .amount(0L)
                .type(BenefitContribution.UnionMember0.Type.FIXED)
                .build()

        val benefitContribution = BenefitContribution.ofUnionMember0(unionMember0)

        assertThat(benefitContribution.unionMember0()).contains(unionMember0)
        assertThat(benefitContribution.unionMember1()).isEmpty
        assertThat(benefitContribution.unionMember2()).isEmpty
    }

    @Test
    fun ofUnionMember0Roundtrip() {
        val jsonMapper = jsonMapper()
        val benefitContribution =
            BenefitContribution.ofUnionMember0(
                BenefitContribution.UnionMember0.builder()
                    .amount(0L)
                    .type(BenefitContribution.UnionMember0.Type.FIXED)
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
    fun ofUnionMember1() {
        val unionMember1 =
            BenefitContribution.UnionMember1.builder()
                .amount(0L)
                .type(BenefitContribution.UnionMember1.Type.PERCENT)
                .build()

        val benefitContribution = BenefitContribution.ofUnionMember1(unionMember1)

        assertThat(benefitContribution.unionMember0()).isEmpty
        assertThat(benefitContribution.unionMember1()).contains(unionMember1)
        assertThat(benefitContribution.unionMember2()).isEmpty
    }

    @Test
    fun ofUnionMember1Roundtrip() {
        val jsonMapper = jsonMapper()
        val benefitContribution =
            BenefitContribution.ofUnionMember1(
                BenefitContribution.UnionMember1.builder()
                    .amount(0L)
                    .type(BenefitContribution.UnionMember1.Type.PERCENT)
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
    fun ofUnionMember2() {
        val unionMember2 =
            BenefitContribution.UnionMember2.builder()
                .addTier(
                    BenefitContribution.UnionMember2.Tier.builder().match(1L).threshold(1L).build()
                )
                .type(BenefitContribution.UnionMember2.Type.TIERED)
                .build()

        val benefitContribution = BenefitContribution.ofUnionMember2(unionMember2)

        assertThat(benefitContribution.unionMember0()).isEmpty
        assertThat(benefitContribution.unionMember1()).isEmpty
        assertThat(benefitContribution.unionMember2()).contains(unionMember2)
    }

    @Test
    fun ofUnionMember2Roundtrip() {
        val jsonMapper = jsonMapper()
        val benefitContribution =
            BenefitContribution.ofUnionMember2(
                BenefitContribution.UnionMember2.builder()
                    .addTier(
                        BenefitContribution.UnionMember2.Tier.builder()
                            .match(1L)
                            .threshold(1L)
                            .build()
                    )
                    .type(BenefitContribution.UnionMember2.Type.TIERED)
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
