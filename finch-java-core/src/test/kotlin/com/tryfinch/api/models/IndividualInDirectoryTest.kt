// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IndividualInDirectoryTest {

    @Test
    fun createIndividualInDirectory() {
        val individualInDirectory =
            IndividualInDirectory.builder()
                .id("id")
                .department(IndividualInDirectory.Department.builder().name("name").build())
                .firstName("first_name")
                .isActive(true)
                .lastName("last_name")
                .manager(IndividualInDirectory.Manager.builder().id("id").build())
                .middleName("middle_name")
                .build()
        assertThat(individualInDirectory).isNotNull
        assertThat(individualInDirectory.id()).contains("id")
        assertThat(individualInDirectory.department())
            .contains(IndividualInDirectory.Department.builder().name("name").build())
        assertThat(individualInDirectory.firstName()).contains("first_name")
        assertThat(individualInDirectory.isActive()).contains(true)
        assertThat(individualInDirectory.lastName()).contains("last_name")
        assertThat(individualInDirectory.manager())
            .contains(IndividualInDirectory.Manager.builder().id("id").build())
        assertThat(individualInDirectory.middleName()).contains("middle_name")
    }
}
