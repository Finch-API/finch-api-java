// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.core.JsonNull
import com.tryfinch.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RequestForwardingServiceTest {

    @Test
    fun callForward() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val requestForwardingService = client.requestForwarding()
        val requestForwardingForwardResponse =
            requestForwardingService.forward(
                RequestForwardingForwardParams.builder()
                    .method("string")
                    .route("string")
                    .data("string")
                    .headers(JsonNull.of())
                    .params(JsonNull.of())
                    .build()
            )
        println(requestForwardingForwardResponse)
        requestForwardingForwardResponse.validate()
    }
}
