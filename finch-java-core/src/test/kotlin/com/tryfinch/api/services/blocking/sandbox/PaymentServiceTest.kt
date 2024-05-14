// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PaymentServiceTest {

    @Test
    fun callCreate() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .clientId("4ab15e51-11ad-49f4-acae-f343b7794375")
                .clientSecret("My Client Secret")
                .build()
        val paymentService = client.sandbox().payment()
        val paymentCreateResponse =
            paymentService.create(
                SandboxPaymentCreateParams.builder()
                    .endDate("string")
                    .payStatements(
                        listOf(
                            SandboxPaymentCreateParams.PayStatement.builder()
                                .earnings(
                                    listOf(
                                        SandboxPaymentCreateParams.PayStatement.Earning.builder()
                                            .amount(123L)
                                            .currency("string")
                                            .hours(42.23)
                                            .name("string")
                                            .type(
                                                SandboxPaymentCreateParams.PayStatement.Earning.Type
                                                    .SALARY
                                            )
                                            .build()
                                    )
                                )
                                .employeeDeductions(
                                    listOf(
                                        SandboxPaymentCreateParams.PayStatement.EmployeeDeduction
                                            .builder()
                                            .amount(123L)
                                            .currency("string")
                                            .name("string")
                                            .preTax(true)
                                            .type(BenefitType._401K)
                                            .build()
                                    )
                                )
                                .employerContributions(
                                    listOf(
                                        SandboxPaymentCreateParams.PayStatement.EmployerContribution
                                            .builder()
                                            .amount(123L)
                                            .currency("string")
                                            .name("string")
                                            .type(BenefitType._401K)
                                            .build()
                                    )
                                )
                                .grossPay(Money.builder().amount(123L).currency("string").build())
                                .individualId("string")
                                .netPay(Money.builder().amount(123L).currency("string").build())
                                .paymentMethod(
                                    SandboxPaymentCreateParams.PayStatement.PaymentMethod.CHECK
                                )
                                .taxes(
                                    listOf(
                                        SandboxPaymentCreateParams.PayStatement.Tax.builder()
                                            .amount(123L)
                                            .currency("string")
                                            .employer(true)
                                            .name("string")
                                            .type(
                                                SandboxPaymentCreateParams.PayStatement.Tax.Type
                                                    .STATE
                                            )
                                            .build()
                                    )
                                )
                                .totalHours(42.23)
                                .type(SandboxPaymentCreateParams.PayStatement.Type.REGULAR_PAYROLL)
                                .build()
                        )
                    )
                    .startDate("string")
                    .build()
            )
        println(paymentCreateResponse)
        paymentCreateResponse.validate()
    }
}
