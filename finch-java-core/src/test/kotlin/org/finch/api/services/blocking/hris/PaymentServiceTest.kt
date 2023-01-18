package org.finch.api.services.blocking.hris

import java.time.LocalDate
import org.finch.api.TestServerExtension
import org.finch.api.client.okhttp.FinchOkHttpClient
import org.finch.api.models.*
import org.finch.api.models.HrisPaymentListParams
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
                HrisPaymentListParams.builder()
                    .startDate(LocalDate.parse("2021-01-01"))
                    .endDate(LocalDate.parse("2021-01-01"))
                    .build()
            )
        println(getPaymentsResponse)
        getPaymentsResponse.items().forEach { it.validate() }
    }
}
