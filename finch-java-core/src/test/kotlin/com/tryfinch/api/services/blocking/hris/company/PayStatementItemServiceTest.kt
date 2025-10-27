// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris.company

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PayStatementItemServiceTest {

    @Test
    fun list() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val payStatementItemService = client.hris().company().payStatementItem()

        val page = payStatementItemService.list()

        page.response().validate()
    }
}
