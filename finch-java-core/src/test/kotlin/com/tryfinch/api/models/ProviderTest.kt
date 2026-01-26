// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProviderTest {

    @Test
    fun create() {
        val provider =
            Provider.builder()
                .id("id")
                .displayName("display_name")
                .addProduct("string")
                .addAuthenticationMethod(
                    Provider.AuthenticationMethod.builder()
                        .type(Provider.AuthenticationMethod.Type.ASSISTED)
                        .benefitsSupport(
                            Provider.AuthenticationMethod.BenefitsSupport.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .supportedFields(
                            Provider.AuthenticationMethod.SupportedFields.builder()
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

        assertThat(provider.id()).isEqualTo("id")
        assertThat(provider.displayName()).isEqualTo("display_name")
        assertThat(provider.products()).containsExactly("string")
        assertThat(provider.authenticationMethods().getOrNull())
            .containsExactly(
                Provider.AuthenticationMethod.builder()
                    .type(Provider.AuthenticationMethod.Type.ASSISTED)
                    .benefitsSupport(
                        Provider.AuthenticationMethod.BenefitsSupport.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .supportedFields(
                        Provider.AuthenticationMethod.SupportedFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(provider.beta()).contains(true)
        assertThat(provider.icon()).contains("icon")
        assertThat(provider.logo()).contains("logo")
        assertThat(provider.manual()).contains(true)
        assertThat(provider.mfaRequired()).contains(true)
        assertThat(provider.primaryColor()).contains("primary_color")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val provider =
            Provider.builder()
                .id("id")
                .displayName("display_name")
                .addProduct("string")
                .addAuthenticationMethod(
                    Provider.AuthenticationMethod.builder()
                        .type(Provider.AuthenticationMethod.Type.ASSISTED)
                        .benefitsSupport(
                            Provider.AuthenticationMethod.BenefitsSupport.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .supportedFields(
                            Provider.AuthenticationMethod.SupportedFields.builder()
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

        val roundtrippedProvider =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(provider),
                jacksonTypeRef<Provider>(),
            )

        assertThat(roundtrippedProvider).isEqualTo(provider)
    }
}
