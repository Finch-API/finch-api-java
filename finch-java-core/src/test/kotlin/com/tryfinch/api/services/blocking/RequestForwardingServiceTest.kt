// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.models.RequestForwardingForwardParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RequestForwardingServiceTest {

    @Test
    fun forward() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val requestForwardingService = client.requestForwarding()

        val response =
            requestForwardingService.forward(
                RequestForwardingForwardParams.builder()
                    .method("method")
                    .route("route")
                    .data("data")
                    .params(
                        RequestForwardingForwardParams.Params.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .requestHeaders(
                        RequestForwardingForwardParams.RequestHeaders.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
