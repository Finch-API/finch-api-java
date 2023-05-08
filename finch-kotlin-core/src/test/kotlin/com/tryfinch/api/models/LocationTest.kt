package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LocationTest {

    @Test
    fun createLocation() {
        val location =
            Location.builder()
                .line1("string")
                .line2("string")
                .city("string")
                .state("string")
                .postalCode("string")
                .country("string")
                .name("string")
                .sourceId("string")
                .build()
        assertThat(location).isNotNull
        assertThat(location.line1()).isEqualTo("string")
        assertThat(location.line2()).isEqualTo("string")
        assertThat(location.city()).isEqualTo("string")
        assertThat(location.state()).isEqualTo("string")
        assertThat(location.postalCode()).isEqualTo("string")
        assertThat(location.country()).isEqualTo("string")
        assertThat(location.name()).isEqualTo("string")
        assertThat(location.sourceId()).isEqualTo("string")
    }
}
