// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import kotlin.jvm.optionals.getOrNull
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SandboxConnectionAccountCreateParamsTest {

    @Test
    fun create() {
        SandboxConnectionAccountCreateParams.builder()
            .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .providerId("provider_id")
            .authenticationType(SandboxConnectionAccountCreateParams.AuthenticationType.CREDENTIAL)
            .addProduct("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            SandboxConnectionAccountCreateParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .providerId("provider_id")
                .authenticationType(
                    SandboxConnectionAccountCreateParams.AuthenticationType.CREDENTIAL
                )
                .addProduct("string")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.companyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.providerId()).isEqualTo("provider_id")
        assertThat(body.authenticationType())
            .contains(SandboxConnectionAccountCreateParams.AuthenticationType.CREDENTIAL)
        assertThat(body.products().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SandboxConnectionAccountCreateParams.builder()
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .providerId("provider_id")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.companyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.providerId()).isEqualTo("provider_id")
    }
}
