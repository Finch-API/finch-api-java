// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IndividualEnrolledIdsResponseTest {

    @Test
    fun createIndividualEnrolledIdsResponse() {
        val individualEnrolledIdsResponse =
            IndividualEnrolledIdsResponse.builder()
                .benefitId("string")
                .individualIds(listOf("string"))
                .build()
        assertThat(individualEnrolledIdsResponse).isNotNull
        assertThat(individualEnrolledIdsResponse.benefitId()).isEqualTo("string")
        assertThat(individualEnrolledIdsResponse.individualIds()).containsExactly("string")
    }
}
