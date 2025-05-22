// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.models.BenefitType
import com.tryfinch.api.models.Money
import com.tryfinch.api.models.SandboxPaymentCreateParams
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
                    .endDate("end_date")
                    .addPayStatement(
                        SandboxPaymentCreateParams.PayStatement.builder()
                            .addEarning(
                                SandboxPaymentCreateParams.PayStatement.Earning.builder()
                                    .amount(0L)
                                    .currency("currency")
                                    .hours(0.0)
                                    .name("name")
                                    .type(
                                        SandboxPaymentCreateParams.PayStatement.Earning.Type.SALARY
                                    )
                                    .attributes(
                                        SandboxPaymentCreateParams.PayStatement.Earning.Attributes
                                            .builder()
                                            .metadata(
                                                SandboxPaymentCreateParams.PayStatement.Earning
                                                    .Attributes
                                                    .Metadata
                                                    .builder()
                                                    .metadata(
                                                        SandboxPaymentCreateParams.PayStatement
                                                            .Earning
                                                            .Attributes
                                                            .Metadata
                                                            .InnerMetadata
                                                            .builder()
                                                            .putAdditionalProperty(
                                                                "foo",
                                                                JsonValue.from(mapOf<String, Any>()),
                                                            )
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .addEmployeeDeduction(
                                SandboxPaymentCreateParams.PayStatement.EmployeeDeduction.builder()
                                    .amount(0L)
                                    .currency("currency")
                                    .name("name")
                                    .preTax(true)
                                    .type(BenefitType._457)
                                    .attributes(
                                        SandboxPaymentCreateParams.PayStatement.EmployeeDeduction
                                            .Attributes
                                            .builder()
                                            .metadata(
                                                SandboxPaymentCreateParams.PayStatement
                                                    .EmployeeDeduction
                                                    .Attributes
                                                    .Metadata
                                                    .builder()
                                                    .metadata(
                                                        SandboxPaymentCreateParams.PayStatement
                                                            .EmployeeDeduction
                                                            .Attributes
                                                            .Metadata
                                                            .InnerMetadata
                                                            .builder()
                                                            .putAdditionalProperty(
                                                                "foo",
                                                                JsonValue.from(mapOf<String, Any>()),
                                                            )
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .addEmployerContribution(
                                SandboxPaymentCreateParams.PayStatement.EmployerContribution
                                    .builder()
                                    .currency("currency")
                                    .name("name")
                                    .type(BenefitType._457)
                                    .amount(0L)
                                    .attributes(
                                        SandboxPaymentCreateParams.PayStatement.EmployerContribution
                                            .Attributes
                                            .builder()
                                            .metadata(
                                                SandboxPaymentCreateParams.PayStatement
                                                    .EmployerContribution
                                                    .Attributes
                                                    .Metadata
                                                    .builder()
                                                    .metadata(
                                                        SandboxPaymentCreateParams.PayStatement
                                                            .EmployerContribution
                                                            .Attributes
                                                            .Metadata
                                                            .InnerMetadata
                                                            .builder()
                                                            .putAdditionalProperty(
                                                                "foo",
                                                                JsonValue.from(mapOf<String, Any>()),
                                                            )
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .grossPay(Money.builder().amount(0L).currency("currency").build())
                            .individualId("individual_id")
                            .netPay(Money.builder().amount(0L).currency("currency").build())
                            .paymentMethod(
                                SandboxPaymentCreateParams.PayStatement.PaymentMethod.CHECK
                            )
                            .addTax(
                                SandboxPaymentCreateParams.PayStatement.Tax.builder()
                                    .currency("currency")
                                    .employer(true)
                                    .name("name")
                                    .type(SandboxPaymentCreateParams.PayStatement.Tax.Type.STATE)
                                    .amount(0L)
                                    .attributes(
                                        SandboxPaymentCreateParams.PayStatement.Tax.Attributes
                                            .builder()
                                            .metadata(
                                                SandboxPaymentCreateParams.PayStatement.Tax
                                                    .Attributes
                                                    .Metadata
                                                    .builder()
                                                    .metadata(
                                                        SandboxPaymentCreateParams.PayStatement.Tax
                                                            .Attributes
                                                            .Metadata
                                                            .InnerMetadata
                                                            .builder()
                                                            .putAdditionalProperty(
                                                                "foo",
                                                                JsonValue.from(mapOf<String, Any>()),
                                                            )
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .totalHours(0.0)
                            .type(SandboxPaymentCreateParams.PayStatement.Type.OFF_CYCLE_PAYROLL)
                            .build()
                    )
                    .startDate("start_date")
                    .build()
            )

        val payment = paymentFuture.get()
        payment.validate()
    }
}
