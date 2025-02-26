// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.models.RequestForwardingForwardParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RequestForwardingServiceAsyncTest {

    @Test
    fun forward() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val requestForwardingServiceAsync = client.requestForwarding()

        val responseFuture =
            requestForwardingServiceAsync.forward(
                RequestForwardingForwardParams.builder()
                    .method("POST")
                    .route("/people/search")
                    .data(null)
                    .headers(JsonValue.from(mapOf("content-type" to "application/json")))
                    .params(JsonValue.from(mapOf("showInactive" to true, "humanReadable" to true)))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
