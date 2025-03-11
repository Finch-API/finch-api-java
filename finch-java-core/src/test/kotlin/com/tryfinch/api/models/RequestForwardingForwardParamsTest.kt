// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RequestForwardingForwardParamsTest {

    @Test
    fun create() {
        RequestForwardingForwardParams.builder()
            .method("POST")
            .route("/people/search")
            .data(null)
            .headers(JsonValue.from(mapOf("content-type" to "application/json")))
            .params(JsonValue.from(mapOf("showInactive" to true, "humanReadable" to true)))
            .build()
    }

    @Test
    fun body() {
        val params =
            RequestForwardingForwardParams.builder()
                .method("POST")
                .route("/people/search")
                .data(null)
                .headers(JsonValue.from(mapOf("content-type" to "application/json")))
                .params(JsonValue.from(mapOf("showInactive" to true, "humanReadable" to true)))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.method()).isEqualTo("POST")
        assertThat(body.route()).isEqualTo("/people/search")
        assertThat(body.data()).isEmpty
        assertThat(body._headers_())
            .isEqualTo(JsonValue.from(mapOf("content-type" to "application/json")))
        assertThat(body._params())
            .isEqualTo(JsonValue.from(mapOf("showInactive" to true, "humanReadable" to true)))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RequestForwardingForwardParams.builder().method("POST").route("/people/search").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.method()).isEqualTo("POST")
        assertThat(body.route()).isEqualTo("/people/search")
    }
}
