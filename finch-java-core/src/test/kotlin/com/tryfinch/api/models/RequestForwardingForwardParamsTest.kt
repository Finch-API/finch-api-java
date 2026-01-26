// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequestForwardingForwardParamsTest {

    @Test
    fun create() {
        RequestForwardingForwardParams.builder()
            .method("method")
            .route("route")
            .data("data")
            .params(
                RequestForwardingForwardParams.Params.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .requestHeaders(
                RequestForwardingForwardParams.RequestHeaders.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            RequestForwardingForwardParams.builder()
                .method("method")
                .route("route")
                .data("data")
                .params(
                    RequestForwardingForwardParams.Params.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .requestHeaders(
                    RequestForwardingForwardParams.RequestHeaders.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.method()).isEqualTo("method")
        assertThat(body.route()).isEqualTo("route")
        assertThat(body.data()).contains("data")
        assertThat(body.params())
            .contains(
                RequestForwardingForwardParams.Params.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.requestHeaders())
            .contains(
                RequestForwardingForwardParams.RequestHeaders.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RequestForwardingForwardParams.builder().method("method").route("route").build()

        val body = params._body()

        assertThat(body.method()).isEqualTo("method")
        assertThat(body.route()).isEqualTo("route")
    }
}
