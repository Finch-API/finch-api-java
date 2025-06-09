// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.HrisPaymentListParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentServiceAsyncTest {

    @Test
    fun list() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val paymentServiceAsync = client.hris().payments()

        val pageFuture =
            paymentServiceAsync.list(
                HrisPaymentListParams.builder()
                    .endDate(LocalDate.parse("2021-01-01"))
                    .startDate(LocalDate.parse("2021-01-01"))
                    .build()
            )

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }
}
