// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnrolledIndividualBenefitTest {

    @Test
    fun create() {
        val enrolledIndividualBenefit =
            EnrolledIndividualBenefit.builder()
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(enrolledIndividualBenefit.jobId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val enrolledIndividualBenefit =
            EnrolledIndividualBenefit.builder()
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedEnrolledIndividualBenefit =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enrolledIndividualBenefit),
                jacksonTypeRef<EnrolledIndividualBenefit>(),
            )

        assertThat(roundtrippedEnrolledIndividualBenefit).isEqualTo(enrolledIndividualBenefit)
    }
}
