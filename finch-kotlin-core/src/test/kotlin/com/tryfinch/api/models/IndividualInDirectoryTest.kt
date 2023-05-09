package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IndividualInDirectoryTest {

    @Test
    fun createIndividualInDirectory() {
        val individualInDirectory =
            IndividualInDirectory.builder()
                .id("string")
                .firstName("string")
                .middleName("string")
                .lastName("string")
                .manager(
                    IndividualInDirectory.Manager.builder()
                        .id("e8b90071-0c11-471c-86e8-e303ef2f6782")
                        .build()
                )
                .department(IndividualInDirectory.Department.builder().name("string").build())
                .isActive(true)
                .build()
        assertThat(individualInDirectory).isNotNull
        assertThat(individualInDirectory.id()).isEqualTo("string")
        assertThat(individualInDirectory.firstName()).isEqualTo("string")
        assertThat(individualInDirectory.middleName()).isEqualTo("string")
        assertThat(individualInDirectory.lastName()).isEqualTo("string")
        assertThat(individualInDirectory.manager())
            .isEqualTo(
                IndividualInDirectory.Manager.builder()
                    .id("e8b90071-0c11-471c-86e8-e303ef2f6782")
                    .build()
            )
        assertThat(individualInDirectory.department())
            .isEqualTo(IndividualInDirectory.Department.builder().name("string").build())
        assertThat(individualInDirectory.isActive()).isEqualTo(true)
    }
}
