// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountDisconnectEntityParamsTest {

    @Test
    fun create() {
        AccountDisconnectEntityParams.builder()
            .addEntityId("3c90c3cc-0d44-4b50-8888-8dd25736052a")
            .addEntityId("5e6f7a8b-9c10-4d11-a12b-c13d14e15f16")
            .build()
    }

    @Test
    fun body() {
        val params =
            AccountDisconnectEntityParams.builder()
                .addEntityId("3c90c3cc-0d44-4b50-8888-8dd25736052a")
                .addEntityId("5e6f7a8b-9c10-4d11-a12b-c13d14e15f16")
                .build()

        val body = params._body()

        assertThat(body.entityIds())
            .containsExactly(
                "3c90c3cc-0d44-4b50-8888-8dd25736052a",
                "5e6f7a8b-9c10-4d11-a12b-c13d14e15f16",
            )
    }
}
