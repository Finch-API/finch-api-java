// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualInDirectoryTest {

    @Test
    fun create() {
        val individualInDirectory =
            IndividualInDirectory.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .department(IndividualInDirectory.Department.builder().name("name").build())
                .firstName("first_name")
                .isActive(true)
                .lastName("last_name")
                .manager(
                    IndividualInDirectory.Manager.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .middleName("middle_name")
                .build()

        assertThat(individualInDirectory.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(individualInDirectory.department())
            .contains(IndividualInDirectory.Department.builder().name("name").build())
        assertThat(individualInDirectory.firstName()).contains("first_name")
        assertThat(individualInDirectory.isActive()).contains(true)
        assertThat(individualInDirectory.lastName()).contains("last_name")
        assertThat(individualInDirectory.manager())
            .contains(
                IndividualInDirectory.Manager.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(individualInDirectory.middleName()).contains("middle_name")
    }
}
