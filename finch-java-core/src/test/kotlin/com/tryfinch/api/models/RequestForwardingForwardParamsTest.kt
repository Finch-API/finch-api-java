// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RequestForwardingForwardParamsTest {

    @Test
    fun createRequestForwardingForwardParams() {
        RequestForwardingForwardParams.builder()
            .method("method")
            .route("route")
            .data("data")
            .headers(JsonValue.from(mapOf<String, Any>()))
            .params(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            RequestForwardingForwardParams.builder()
                .method("method")
                .route("route")
                .data("data")
                .headers(JsonValue.from(mapOf<String, Any>()))
                .params(JsonValue.from(mapOf<String, Any>()))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.method()).isEqualTo("method")
        assertThat(body.route()).isEqualTo("route")
        assertThat(body.data()).isEqualTo("data")
        assertThat(body.headers()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.params()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            RequestForwardingForwardParams.builder().method("method").route("route").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.method()).isEqualTo("method")
        assertThat(body.route()).isEqualTo("route")
    }
}
