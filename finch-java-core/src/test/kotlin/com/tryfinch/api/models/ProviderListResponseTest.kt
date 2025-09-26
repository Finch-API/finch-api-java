// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProviderListResponseTest {

    @Test
    fun create() {
        val providerListResponse =
            ProviderListResponse.builder()
                .id("id")
                .displayName("display_name")
                .addProduct("string")
                .addAuthenticationMethod(
                    ProviderListResponse.AuthenticationMethod.builder()
                        .type(ProviderListResponse.AuthenticationMethod.Type.ASSISTED)
                        .benefitsSupport(
                            ProviderListResponse.AuthenticationMethod.BenefitsSupport.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .supportedFields(
                            ProviderListResponse.AuthenticationMethod.SupportedFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .beta(true)
                .icon("icon")
                .logo("logo")
                .manual(true)
                .mfaRequired(true)
                .primaryColor("primary_color")
                .build()

        assertThat(providerListResponse.id()).isEqualTo("id")
        assertThat(providerListResponse.displayName()).isEqualTo("display_name")
        assertThat(providerListResponse.products()).containsExactly("string")
        assertThat(providerListResponse.authenticationMethods().getOrNull())
            .containsExactly(
                ProviderListResponse.AuthenticationMethod.builder()
                    .type(ProviderListResponse.AuthenticationMethod.Type.ASSISTED)
                    .benefitsSupport(
                        ProviderListResponse.AuthenticationMethod.BenefitsSupport.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .supportedFields(
                        ProviderListResponse.AuthenticationMethod.SupportedFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(providerListResponse.beta()).contains(true)
        assertThat(providerListResponse.icon()).contains("icon")
        assertThat(providerListResponse.logo()).contains("logo")
        assertThat(providerListResponse.manual()).contains(true)
        assertThat(providerListResponse.mfaRequired()).contains(true)
        assertThat(providerListResponse.primaryColor()).contains("primary_color")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val providerListResponse =
            ProviderListResponse.builder()
                .id("id")
                .displayName("display_name")
                .addProduct("string")
                .addAuthenticationMethod(
                    ProviderListResponse.AuthenticationMethod.builder()
                        .type(ProviderListResponse.AuthenticationMethod.Type.ASSISTED)
                        .benefitsSupport(
                            ProviderListResponse.AuthenticationMethod.BenefitsSupport.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .supportedFields(
                            ProviderListResponse.AuthenticationMethod.SupportedFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .beta(true)
                .icon("icon")
                .logo("logo")
                .manual(true)
                .mfaRequired(true)
                .primaryColor("primary_color")
                .build()

        val roundtrippedProviderListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(providerListResponse),
                jacksonTypeRef<ProviderListResponse>(),
            )

        assertThat(roundtrippedProviderListResponse).isEqualTo(providerListResponse)
    }
}
