// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.models.BenefitType
import com.tryfinch.api.models.Money
import com.tryfinch.api.models.PayStatement
import com.tryfinch.api.models.SandboxPaymentCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentServiceTest {

    @Test
    fun create() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val paymentService = client.sandbox().payment()

        val payment =
            paymentService.create(
                SandboxPaymentCreateParams.builder()
                    .endDate("end_date")
                    .addPayStatement(
                        PayStatement.builder()
                            .addEarning(
                                PayStatement.Earning.builder()
                                    .amount(0L)
                                    .currency("currency")
                                    .hours(0.0)
                                    .name("name")
                                    .type(PayStatement.Earning.Type.SALARY)
                                    .attributes(
                                        PayStatement.Earning.Attributes.builder()
                                            .metadata(
                                                PayStatement.Earning.Attributes.Metadata.builder()
                                                    .metadata(
                                                        PayStatement.Earning.Attributes.Metadata
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
                                PayStatement.EmployeeDeduction.builder()
                                    .amount(0L)
                                    .currency("currency")
                                    .name("name")
                                    .preTax(true)
                                    .type(BenefitType._457)
                                    .attributes(
                                        PayStatement.EmployeeDeduction.Attributes.builder()
                                            .metadata(
                                                PayStatement.EmployeeDeduction.Attributes.Metadata
                                                    .builder()
                                                    .metadata(
                                                        PayStatement.EmployeeDeduction.Attributes
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
                                PayStatement.EmployerContribution.builder()
                                    .currency("currency")
                                    .name("name")
                                    .type(BenefitType._457)
                                    .amount(0L)
                                    .attributes(
                                        PayStatement.EmployerContribution.Attributes.builder()
                                            .metadata(
                                                PayStatement.EmployerContribution.Attributes
                                                    .Metadata
                                                    .builder()
                                                    .metadata(
                                                        PayStatement.EmployerContribution.Attributes
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
                            .paymentMethod(PayStatement.PaymentMethod.CHECK)
                            .addTax(
                                PayStatement.Tax.builder()
                                    .currency("currency")
                                    .employer(true)
                                    .name("name")
                                    .type(PayStatement.Tax.Type.STATE)
                                    .amount(0L)
                                    .attributes(
                                        PayStatement.Tax.Attributes.builder()
                                            .metadata(
                                                PayStatement.Tax.Attributes.Metadata.builder()
                                                    .metadata(
                                                        PayStatement.Tax.Attributes.Metadata
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
                            .type(PayStatement.Type.OFF_CYCLE_PAYROLL)
                            .build()
                    )
                    .startDate("start_date")
                    .build()
            )

        payment.validate()
    }
}
