package com.tryfinch.api.models

import com.tryfinch.api.core.JsonNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ForwardResponseTest {

    @Test
    fun createForwardResponse() {
        val forwardResponse =
            ForwardResponse.builder()
                .data("string")
                .headers(JsonNull.of())
                .request(
                    ForwardResponse.Request.builder()
                        .data("string")
                        .headers(JsonNull.of())
                        .method("string")
                        .params(JsonNull.of())
                        .route("string")
                        .build()
                )
                .statusCode(123L)
                .build()
        assertThat(forwardResponse).isNotNull
        assertThat(forwardResponse.data()).contains("string")
        assertThat(forwardResponse._headers()).isEqualTo(JsonNull.of())
        assertThat(forwardResponse.request())
            .isEqualTo(
                ForwardResponse.Request.builder()
                    .data("string")
                    .headers(JsonNull.of())
                    .method("string")
                    .params(JsonNull.of())
                    .route("string")
                    .build()
            )
        assertThat(forwardResponse.statusCode()).isEqualTo(123L)
    }
}
