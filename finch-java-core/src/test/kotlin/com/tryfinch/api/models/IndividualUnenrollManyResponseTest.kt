// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualUnenrollManyResponseTest {

    @Test
    fun create() {
        val individualUnenrollManyResponse = IndividualUnenrollManyResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val individualUnenrollManyResponse = IndividualUnenrollManyResponse.builder().build()

        val roundtrippedIndividualUnenrollManyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(individualUnenrollManyResponse),
                jacksonTypeRef<IndividualUnenrollManyResponse>(),
            )

        assertThat(roundtrippedIndividualUnenrollManyResponse)
            .isEqualTo(individualUnenrollManyResponse)
    }
}
