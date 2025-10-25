// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris.company

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.HrisCompanyPayStatementItemListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PayStatementItemServiceAsyncTest {

    @Test
    fun list() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val payStatementItemServiceAsync = client.hris().company().payStatementItem()

        val pageFuture =
            payStatementItemServiceAsync.list(
                HrisCompanyPayStatementItemListParams.builder()
                    .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
