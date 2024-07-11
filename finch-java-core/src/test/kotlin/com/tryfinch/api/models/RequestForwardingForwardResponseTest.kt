// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RequestForwardingForwardResponseTest {

    @Test
    fun createRequestForwardingForwardResponse() {
        val requestForwardingForwardResponse =
            RequestForwardingForwardResponse.builder()
                .data("data")
                .headers(JsonNull.of())
                .request(
                    RequestForwardingForwardResponse.Request.builder()
                        .data("data")
                        .headers(JsonNull.of())
                        .method("method")
                        .params(JsonNull.of())
                        .route("route")
                        .build()
                )
                .statusCode(123L)
                .build()
        assertThat(requestForwardingForwardResponse).isNotNull
        assertThat(requestForwardingForwardResponse.data()).contains("data")
        assertThat(requestForwardingForwardResponse._headers()).isEqualTo(JsonNull.of())
        assertThat(requestForwardingForwardResponse.request())
            .isEqualTo(
                RequestForwardingForwardResponse.Request.builder()
                    .data("data")
                    .headers(JsonNull.of())
                    .method("method")
                    .params(JsonNull.of())
                    .route("route")
                    .build()
            )
        assertThat(requestForwardingForwardResponse.statusCode()).isEqualTo(123L)
    }
}
