// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RequestForwardingForwardParamsTest {

    @Test
    fun createRequestForwardingForwardParams() {
        RequestForwardingForwardParams.builder()
            .method("POST")
            .route("/people/search")
            .headers(JsonValue.from(mapOf("content-type" to "application/json")))
            .params(JsonValue.from(mapOf("showInactive" to true, "humanReadable" to true)))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            RequestForwardingForwardParams.builder()
                .method("POST")
                .route("/people/search")
                .headers(JsonValue.from(mapOf("content-type" to "application/json")))
                .params(JsonValue.from(mapOf("showInactive" to true, "humanReadable" to true)))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.method()).isEqualTo("POST")
        assertThat(body.route()).isEqualTo("/people/search")
        assertThat(body.headers())
            .isEqualTo(JsonValue.from(mapOf("content-type" to "application/json")))
        assertThat(body.params())
            .isEqualTo(JsonValue.from(mapOf("showInactive" to true, "humanReadable" to true)))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            RequestForwardingForwardParams.builder().method("POST").route("/people/search").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.method()).isEqualTo("POST")
        assertThat(body.route()).isEqualTo("/people/search")
    }
}
