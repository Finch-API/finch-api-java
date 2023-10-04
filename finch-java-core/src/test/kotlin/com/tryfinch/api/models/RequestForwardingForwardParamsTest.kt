// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonNull
import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RequestForwardingForwardParamsTest {

    @Test
    fun createRequestForwardingForwardParams() {
        RequestForwardingForwardParams.builder()
            .method("string")
            .route("string")
            .data("string")
            .headers(JsonNull.of())
            .params(JsonNull.of())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            RequestForwardingForwardParams.builder()
                .method("string")
                .route("string")
                .data("string")
                .headers(JsonNull.of())
                .params(JsonNull.of())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.method()).isEqualTo("string")
        assertThat(body.route()).isEqualTo("string")
        assertThat(body.data()).isEqualTo("string")
        assertThat(body.headers()).isEqualTo(JsonNull.of())
        assertThat(body.params()).isEqualTo(JsonNull.of())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            RequestForwardingForwardParams.builder().method("string").route("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.method()).isEqualTo("string")
        assertThat(body.route()).isEqualTo("string")
    }
}
