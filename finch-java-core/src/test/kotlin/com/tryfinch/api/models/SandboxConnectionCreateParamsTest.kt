// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SandboxConnectionCreateParamsTest {

    @Test
    fun create() {
        SandboxConnectionCreateParams.builder()
            .providerId("provider_id")
            .authenticationType(SandboxConnectionCreateParams.AuthenticationType.CREDENTIAL)
            .employeeSize(0L)
            .addProduct("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            SandboxConnectionCreateParams.builder()
                .providerId("provider_id")
                .authenticationType(SandboxConnectionCreateParams.AuthenticationType.CREDENTIAL)
                .employeeSize(0L)
                .addProduct("string")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.providerId()).isEqualTo("provider_id")
        assertThat(body.authenticationType())
            .contains(SandboxConnectionCreateParams.AuthenticationType.CREDENTIAL)
        assertThat(body.employeeSize()).contains(0L)
        assertThat(body.products()).contains(listOf("string"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SandboxConnectionCreateParams.builder().providerId("provider_id").build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.providerId()).isEqualTo("provider_id")
    }
}
