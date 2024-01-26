// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SandboxConnectionAccountCreateParamsTest {

    @Test
    fun createSandboxConnectionAccountCreateParams() {
        SandboxConnectionAccountCreateParams.builder()
            .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .providerId("string")
            .authenticationType(SandboxConnectionAccountCreateParams.AuthenticationType.CREDENTIAL)
            .products(listOf("string"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SandboxConnectionAccountCreateParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .providerId("string")
                .authenticationType(
                    SandboxConnectionAccountCreateParams.AuthenticationType.CREDENTIAL
                )
                .products(listOf("string"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.companyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.providerId()).isEqualTo("string")
        assertThat(body.authenticationType())
            .isEqualTo(SandboxConnectionAccountCreateParams.AuthenticationType.CREDENTIAL)
        assertThat(body.products()).isEqualTo(listOf("string"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SandboxConnectionAccountCreateParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .providerId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.companyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.providerId()).isEqualTo("string")
    }
}
