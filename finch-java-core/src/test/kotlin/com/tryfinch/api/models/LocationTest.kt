// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocationTest {

    @Test
    fun create() {
        val location =
            Location.builder()
                .city("city")
                .country("country")
                .line1("line1")
                .line2("line2")
                .name("name")
                .postalCode("postal_code")
                .sourceId("source_id")
                .state("state")
                .build()

        assertThat(location.city()).contains("city")
        assertThat(location.country()).contains("country")
        assertThat(location.line1()).contains("line1")
        assertThat(location.line2()).contains("line2")
        assertThat(location.name()).contains("name")
        assertThat(location.postalCode()).contains("postal_code")
        assertThat(location.sourceId()).contains("source_id")
        assertThat(location.state()).contains("state")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val location =
            Location.builder()
                .city("city")
                .country("country")
                .line1("line1")
                .line2("line2")
                .name("name")
                .postalCode("postal_code")
                .sourceId("source_id")
                .state("state")
                .build()

        val roundtrippedLocation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(location),
                jacksonTypeRef<Location>(),
            )

        assertThat(roundtrippedLocation).isEqualTo(location)
    }
}
