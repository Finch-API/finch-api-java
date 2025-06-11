// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.SandboxPaymentCreateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentServiceAsyncTest {

    @Test
    fun create() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val paymentServiceAsync = client.sandbox().payment()

        val paymentFuture =
            paymentServiceAsync.create(
                SandboxPaymentCreateParams.builder()
                    .endDate(LocalDate.parse("2019-12-27"))
                    .addPayStatement(
                        SandboxPaymentCreateParams.PayStatement.builder()
                            .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addEarning(
                                SandboxPaymentCreateParams.PayStatement.Earning.builder()
                                    .amount(0L)
                                    .hours(0.0)
                                    .name("x")
                                    .type(
                                        SandboxPaymentCreateParams.PayStatement.Earning.Type.BONUS
                                    )
                                    .build()
                            )
                            .addEmployeeDeduction(
                                SandboxPaymentCreateParams.PayStatement.EmployeeDeduction.builder()
                                    .amount(0L)
                                    .name("x")
                                    .preTax(true)
                                    .type(
                                        SandboxPaymentCreateParams.PayStatement.EmployeeDeduction
                                            .Type
                                            ._457
                                    )
                                    .build()
                            )
                            .addEmployerContribution(
                                SandboxPaymentCreateParams.PayStatement.EmployerContribution
                                    .builder()
                                    .amount(0L)
                                    .name("x")
                                    .type(
                                        SandboxPaymentCreateParams.PayStatement.EmployerContribution
                                            .Type
                                            ._457
                                    )
                                    .build()
                            )
                            .grossPay(1L)
                            .netPay(9007199254740991L)
                            .paymentMethod(
                                SandboxPaymentCreateParams.PayStatement.PaymentMethod.CHECK
                            )
                            .addTax(
                                SandboxPaymentCreateParams.PayStatement.Tax.builder()
                                    .amount(0L)
                                    .employer(true)
                                    .name("x")
                                    .type(SandboxPaymentCreateParams.PayStatement.Tax.Type.FEDERAL)
                                    .build()
                            )
                            .totalHours(1.0)
                            .type(SandboxPaymentCreateParams.PayStatement.Type.OFF_CYCLE_PAYROLL)
                            .build()
                    )
                    .startDate(LocalDate.parse("2019-12-27"))
                    .build()
            )

        val payment = paymentFuture.get()
        payment.validate()
    }
}
