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
                .data("data")
                .headers(JsonValue.from(mapOf<String, Any>()))
                .request(
                    RequestForwardingForwardResponse.Request.builder()
                        .data("data")
                        .headers(JsonValue.from(mapOf<String, Any>()))
                        .method("method")
                        .params(JsonValue.from(mapOf<String, Any>()))
                        .route("route")
                        .build()
                )
                .statusCode(0L)
                .build()

        assertThat(requestForwardingForwardResponse.data()).contains("data")
        assertThat(requestForwardingForwardResponse._headers())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(requestForwardingForwardResponse.request())
            .isEqualTo(
                RequestForwardingForwardResponse.Request.builder()
                    .data("data")
                    .headers(JsonValue.from(mapOf<String, Any>()))
                    .method("method")
                    .params(JsonValue.from(mapOf<String, Any>()))
                    .route("route")
                    .build()
            )
        assertThat(requestForwardingForwardResponse.statusCode()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val requestForwardingForwardResponse =
            RequestForwardingForwardResponse.builder()
                .data("data")
                .headers(JsonValue.from(mapOf<String, Any>()))
                .request(
                    RequestForwardingForwardResponse.Request.builder()
                        .data("data")
                        .headers(JsonValue.from(mapOf<String, Any>()))
                        .method("method")
                        .params(JsonValue.from(mapOf<String, Any>()))
                        .route("route")
                        .build()
                )
                .statusCode(0L)
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
