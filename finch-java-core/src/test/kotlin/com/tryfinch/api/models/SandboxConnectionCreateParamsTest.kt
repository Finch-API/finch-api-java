// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SandboxConnectionCreateParamsTest {

    @Test
    fun createSandboxConnectionCreateParams() {
        SandboxConnectionCreateParams.builder()
            .providerId("provider_id")
            .authenticationType(SandboxConnectionCreateParams.AuthenticationType.CREDENTIAL)
            .employeeSize(123L)
            .products(listOf("string"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SandboxConnectionCreateParams.builder()
                .providerId("provider_id")
                .authenticationType(SandboxConnectionCreateParams.AuthenticationType.CREDENTIAL)
                .employeeSize(123L)
                .products(listOf("string"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.providerId()).isEqualTo("provider_id")
        assertThat(body.authenticationType())
            .isEqualTo(SandboxConnectionCreateParams.AuthenticationType.CREDENTIAL)
        assertThat(body.employeeSize()).isEqualTo(123L)
        assertThat(body.products()).isEqualTo(listOf("string"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SandboxConnectionCreateParams.builder().providerId("provider_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.providerId()).isEqualTo("provider_id")
    }
}
