// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.HrisPayStatementRetrieveManyParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PayStatementServiceAsyncTest {

    @Test
    fun retrieveMany() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val payStatementServiceAsync = client.hris().payStatements()

        val pageFuture =
            payStatementServiceAsync.retrieveMany(
                HrisPayStatementRetrieveManyParams.builder()
                    .addRequest(
                        HrisPayStatementRetrieveManyParams.Request.builder()
                            .paymentId("string")
                            .build()
                    )
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
