package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import com.tryfinch.api.models.HriPaymentListParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PaymentServiceTest {

    @Test
    fun callList() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .clientId("string")
                .clientSecret("string")
                .build()
        val paymentService = client.hris().payments()
        val getPaymentsResponse =
            paymentService.list(
                HriPaymentListParams.builder()
                    .startDate(LocalDate.parse("2021-01-01"))
                    .endDate(LocalDate.parse("2021-01-01"))
                    .build()
            )
        println(getPaymentsResponse)
        getPaymentsResponse.items().forEach { it.validate() }
    }
}
