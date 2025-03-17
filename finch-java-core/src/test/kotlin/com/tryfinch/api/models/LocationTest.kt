// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocationTest {

    @Test
    fun createLocation() {
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
        assertThat(location).isNotNull
        assertThat(location.city()).contains("city")
        assertThat(location.country()).contains("country")
        assertThat(location.line1()).contains("line1")
        assertThat(location.line2()).contains("line2")
        assertThat(location.name()).contains("name")
        assertThat(location.postalCode()).contains("postal_code")
        assertThat(location.sourceId()).contains("source_id")
        assertThat(location.state()).contains("state")
    }
}
