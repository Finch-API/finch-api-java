// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IndividualInDirectoryTest {

    @Test
    fun createIndividualInDirectory() {
        val individualInDirectory =
            IndividualInDirectory.builder()
                .id("string")
                .department(IndividualInDirectory.Department.builder().name("string").build())
                .firstName("string")
                .isActive(true)
                .lastName("string")
                .manager(IndividualInDirectory.Manager.builder().id("string").build())
                .middleName("string")
                .build()
        assertThat(individualInDirectory).isNotNull
        assertThat(individualInDirectory.id()).contains("string")
        assertThat(individualInDirectory.department())
            .contains(IndividualInDirectory.Department.builder().name("string").build())
        assertThat(individualInDirectory.firstName()).contains("string")
        assertThat(individualInDirectory.isActive()).contains(true)
        assertThat(individualInDirectory.lastName()).contains("string")
        assertThat(individualInDirectory.manager())
            .contains(IndividualInDirectory.Manager.builder().id("string").build())
        assertThat(individualInDirectory.middleName()).contains("string")
    }
}
