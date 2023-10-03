package com.tryfinch.api.models

import com.tryfinch.api.core.JsonNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RequestForwardingForwardResponseTest {

    @Test
    fun createRequestForwardingForwardResponse() {
        val requestForwardingForwardResponse =
            RequestForwardingForwardResponse.builder()
                .data("string")
                .headers(JsonNull.of())
                .request(
                    RequestForwardingForwardResponse.Request.builder()
                        .data("string")
                        .headers(JsonNull.of())
                        .method("string")
                        .params(JsonNull.of())
                        .route("string")
                        .build()
                )
                .statusCode(123L)
                .build()
        assertThat(requestForwardingForwardResponse).isNotNull
        assertThat(requestForwardingForwardResponse.data()).contains("string")
        assertThat(requestForwardingForwardResponse._headers()).isEqualTo(JsonNull.of())
        assertThat(requestForwardingForwardResponse.request())
            .isEqualTo(
                RequestForwardingForwardResponse.Request.builder()
                    .data("string")
                    .headers(JsonNull.of())
                    .method("string")
                    .params(JsonNull.of())
                    .route("string")
                    .build()
            )
        assertThat(requestForwardingForwardResponse.statusCode()).isEqualTo(123L)
    }
}
