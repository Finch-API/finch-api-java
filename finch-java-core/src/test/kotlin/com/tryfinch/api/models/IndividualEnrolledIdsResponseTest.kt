// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualEnrolledIdsResponseTest {

    @Test
    fun create() {
        val individualEnrolledIdsResponse =
            IndividualEnrolledIdsResponse.builder()
                .benefitId("benefit_id")
                .addIndividualId("string")
                .build()

        assertThat(individualEnrolledIdsResponse.benefitId()).isEqualTo("benefit_id")
        assertThat(individualEnrolledIdsResponse.individualIds()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val individualEnrolledIdsResponse =
            IndividualEnrolledIdsResponse.builder()
                .benefitId("benefit_id")
                .addIndividualId("string")
                .build()

        val roundtrippedIndividualEnrolledIdsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(individualEnrolledIdsResponse),
                jacksonTypeRef<IndividualEnrolledIdsResponse>(),
            )

        assertThat(roundtrippedIndividualEnrolledIdsResponse)
            .isEqualTo(individualEnrolledIdsResponse)
    }
}
