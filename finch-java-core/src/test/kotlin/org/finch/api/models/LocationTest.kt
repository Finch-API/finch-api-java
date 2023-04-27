package org.finch.api.models

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
        assertThat(location.line1()).contains("string")
        assertThat(location.line2()).contains("string")
        assertThat(location.city()).contains("string")
        assertThat(location.state()).contains("string")
        assertThat(location.postalCode()).contains("string")
        assertThat(location.country()).contains("string")
        assertThat(location.name()).contains("string")
        assertThat(location.sourceId()).contains("string")
    }
}
