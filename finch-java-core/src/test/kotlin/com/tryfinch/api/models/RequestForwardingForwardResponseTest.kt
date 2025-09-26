// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequestForwardingForwardResponseTest {

    @Test
    fun create() {
        val requestForwardingForwardResponse =
            RequestForwardingForwardResponse.builder()
                .request(
                    RequestForwardingForwardResponse.Request.builder()
                        .method("method")
                        .route("route")
                        .data("string")
                        .headers(
                            RequestForwardingForwardResponse.Request.Headers.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .params(
                            RequestForwardingForwardResponse.Request.Params.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .statusCode(0L)
                .data("data")
                .headers(
                    RequestForwardingForwardResponse.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(requestForwardingForwardResponse.request())
            .isEqualTo(
                RequestForwardingForwardResponse.Request.builder()
                    .method("method")
                    .route("route")
                    .data("string")
                    .headers(
                        RequestForwardingForwardResponse.Request.Headers.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .params(
                        RequestForwardingForwardResponse.Request.Params.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(requestForwardingForwardResponse.statusCode()).isEqualTo(0L)
        assertThat(requestForwardingForwardResponse.data()).contains("data")
        assertThat(requestForwardingForwardResponse.headers())
            .contains(
                RequestForwardingForwardResponse.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val requestForwardingForwardResponse =
            RequestForwardingForwardResponse.builder()
                .request(
                    RequestForwardingForwardResponse.Request.builder()
                        .method("method")
                        .route("route")
                        .data("string")
                        .headers(
                            RequestForwardingForwardResponse.Request.Headers.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .params(
                            RequestForwardingForwardResponse.Request.Params.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .statusCode(0L)
                .data("data")
                .headers(
                    RequestForwardingForwardResponse.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedRequestForwardingForwardResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(requestForwardingForwardResponse),
                jacksonTypeRef<RequestForwardingForwardResponse>(),
            )

        assertThat(roundtrippedRequestForwardingForwardResponse)
            .isEqualTo(requestForwardingForwardResponse)
    }
}
