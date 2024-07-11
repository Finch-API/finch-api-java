// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IndividualEnrolledIdsResponseTest {

    @Test
    fun createIndividualEnrolledIdsResponse() {
        val individualEnrolledIdsResponse =
            IndividualEnrolledIdsResponse.builder()
                .benefitId("benefit_id")
                .individualIds(listOf("string"))
                .build()
        assertThat(individualEnrolledIdsResponse).isNotNull
        assertThat(individualEnrolledIdsResponse.benefitId()).isEqualTo("benefit_id")
        assertThat(individualEnrolledIdsResponse.individualIds()).containsExactly("string")
    }
}
