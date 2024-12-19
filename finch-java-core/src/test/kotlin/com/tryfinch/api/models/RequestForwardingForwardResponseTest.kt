// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RequestForwardingForwardResponseTest {

    @Test
    fun createRequestForwardingForwardResponse() {
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
        assertThat(requestForwardingForwardResponse).isNotNull
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
}
