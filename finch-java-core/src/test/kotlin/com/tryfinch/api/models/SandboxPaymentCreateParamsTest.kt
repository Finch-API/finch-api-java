// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SandboxPaymentCreateParamsTest {

    @Test
    fun create() {
        SandboxPaymentCreateParams.builder()
            .endDate("end_date")
            .addPayStatement(
                SandboxPaymentCreateParams.PayStatement.builder()
                    .addEarning(
                        SandboxPaymentCreateParams.PayStatement.Earning.builder()
                            .amount(0L)
                            .attributes(
                                SandboxPaymentCreateParams.PayStatement.Earning.Metadata.builder()
                                    .metadata(
                                        SandboxPaymentCreateParams.PayStatement.Earning.Metadata
                                            .InnerMetadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .build()
                            )
                            .currency("currency")
                            .hours(0.0)
                            .name("name")
                            .type(SandboxPaymentCreateParams.PayStatement.Earning.Type.SALARY)
                            .build()
                    )
                    .addEmployeeDeduction(
                        SandboxPaymentCreateParams.PayStatement.EmployeeDeduction.builder()
                            .amount(0L)
                            .attributes(
                                SandboxPaymentCreateParams.PayStatement.EmployeeDeduction.Metadata
                                    .builder()
                                    .metadata(
                                        SandboxPaymentCreateParams.PayStatement.EmployeeDeduction
                                            .Metadata
                                            .InnerMetadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .build()
                            )
                            .currency("currency")
                            .name("name")
                            .preTax(true)
                            .type(BenefitType._401K)
                            .build()
                    )
                    .addEmployerContribution(
                        SandboxPaymentCreateParams.PayStatement.EmployerContribution.builder()
                            .amount(0L)
                            .attributes(
                                SandboxPaymentCreateParams.PayStatement.EmployerContribution
                                    .Metadata
                                    .builder()
                                    .metadata(
                                        SandboxPaymentCreateParams.PayStatement.EmployerContribution
                                            .Metadata
                                            .InnerMetadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .build()
                            )
                            .currency("currency")
                            .name("name")
                            .type(BenefitType._401K)
                            .build()
                    )
                    .grossPay(Money.builder().amount(0L).currency("currency").build())
                    .individualId("individual_id")
                    .netPay(Money.builder().amount(0L).currency("currency").build())
                    .paymentMethod(SandboxPaymentCreateParams.PayStatement.PaymentMethod.CHECK)
                    .addTax(
                        SandboxPaymentCreateParams.PayStatement.Tax.builder()
                            .amount(0L)
                            .attributes(
                                SandboxPaymentCreateParams.PayStatement.Tax.Metadata.builder()
                                    .metadata(
                                        SandboxPaymentCreateParams.PayStatement.Tax.Metadata
                                            .InnerMetadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .build()
                            )
                            .currency("currency")
                            .employer(true)
                            .name("name")
                            .type(SandboxPaymentCreateParams.PayStatement.Tax.Type.STATE)
                            .build()
                    )
                    .totalHours(0.0)
                    .type(SandboxPaymentCreateParams.PayStatement.Type.REGULAR_PAYROLL)
                    .build()
            )
            .startDate("start_date")
            .build()
    }

    @Test
    fun body() {
        val params =
            SandboxPaymentCreateParams.builder()
                .endDate("end_date")
                .addPayStatement(
                    SandboxPaymentCreateParams.PayStatement.builder()
                        .addEarning(
                            SandboxPaymentCreateParams.PayStatement.Earning.builder()
                                .amount(0L)
                                .attributes(
                                    SandboxPaymentCreateParams.PayStatement.Earning.Metadata
                                        .builder()
                                        .metadata(
                                            SandboxPaymentCreateParams.PayStatement.Earning.Metadata
                                                .InnerMetadata
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .build()
                                )
                                .currency("currency")
                                .hours(0.0)
                                .name("name")
                                .type(SandboxPaymentCreateParams.PayStatement.Earning.Type.SALARY)
                                .build()
                        )
                        .addEmployeeDeduction(
                            SandboxPaymentCreateParams.PayStatement.EmployeeDeduction.builder()
                                .amount(0L)
                                .attributes(
                                    SandboxPaymentCreateParams.PayStatement.EmployeeDeduction
                                        .Metadata
                                        .builder()
                                        .metadata(
                                            SandboxPaymentCreateParams.PayStatement
                                                .EmployeeDeduction
                                                .Metadata
                                                .InnerMetadata
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .build()
                                )
                                .currency("currency")
                                .name("name")
                                .preTax(true)
                                .type(BenefitType._401K)
                                .build()
                        )
                        .addEmployerContribution(
                            SandboxPaymentCreateParams.PayStatement.EmployerContribution.builder()
                                .amount(0L)
                                .attributes(
                                    SandboxPaymentCreateParams.PayStatement.EmployerContribution
                                        .Metadata
                                        .builder()
                                        .metadata(
                                            SandboxPaymentCreateParams.PayStatement
                                                .EmployerContribution
                                                .Metadata
                                                .InnerMetadata
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .build()
                                )
                                .currency("currency")
                                .name("name")
                                .type(BenefitType._401K)
                                .build()
                        )
                        .grossPay(Money.builder().amount(0L).currency("currency").build())
                        .individualId("individual_id")
                        .netPay(Money.builder().amount(0L).currency("currency").build())
                        .paymentMethod(SandboxPaymentCreateParams.PayStatement.PaymentMethod.CHECK)
                        .addTax(
                            SandboxPaymentCreateParams.PayStatement.Tax.builder()
                                .amount(0L)
                                .attributes(
                                    SandboxPaymentCreateParams.PayStatement.Tax.Metadata.builder()
                                        .metadata(
                                            SandboxPaymentCreateParams.PayStatement.Tax.Metadata
                                                .InnerMetadata
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .build()
                                )
                                .currency("currency")
                                .employer(true)
                                .name("name")
                                .type(SandboxPaymentCreateParams.PayStatement.Tax.Type.STATE)
                                .build()
                        )
                        .totalHours(0.0)
                        .type(SandboxPaymentCreateParams.PayStatement.Type.REGULAR_PAYROLL)
                        .build()
                )
                .startDate("start_date")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.endDate()).contains("end_date")
        assertThat(body.payStatements())
            .contains(
                listOf(
                    SandboxPaymentCreateParams.PayStatement.builder()
                        .addEarning(
                            SandboxPaymentCreateParams.PayStatement.Earning.builder()
                                .amount(0L)
                                .attributes(
                                    SandboxPaymentCreateParams.PayStatement.Earning.Metadata
                                        .builder()
                                        .metadata(
                                            SandboxPaymentCreateParams.PayStatement.Earning.Metadata
                                                .InnerMetadata
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .build()
                                )
                                .currency("currency")
                                .hours(0.0)
                                .name("name")
                                .type(SandboxPaymentCreateParams.PayStatement.Earning.Type.SALARY)
                                .build()
                        )
                        .addEmployeeDeduction(
                            SandboxPaymentCreateParams.PayStatement.EmployeeDeduction.builder()
                                .amount(0L)
                                .attributes(
                                    SandboxPaymentCreateParams.PayStatement.EmployeeDeduction
                                        .Metadata
                                        .builder()
                                        .metadata(
                                            SandboxPaymentCreateParams.PayStatement
                                                .EmployeeDeduction
                                                .Metadata
                                                .InnerMetadata
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .build()
                                )
                                .currency("currency")
                                .name("name")
                                .preTax(true)
                                .type(BenefitType._401K)
                                .build()
                        )
                        .addEmployerContribution(
                            SandboxPaymentCreateParams.PayStatement.EmployerContribution.builder()
                                .amount(0L)
                                .attributes(
                                    SandboxPaymentCreateParams.PayStatement.EmployerContribution
                                        .Metadata
                                        .builder()
                                        .metadata(
                                            SandboxPaymentCreateParams.PayStatement
                                                .EmployerContribution
                                                .Metadata
                                                .InnerMetadata
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .build()
                                )
                                .currency("currency")
                                .name("name")
                                .type(BenefitType._401K)
                                .build()
                        )
                        .grossPay(Money.builder().amount(0L).currency("currency").build())
                        .individualId("individual_id")
                        .netPay(Money.builder().amount(0L).currency("currency").build())
                        .paymentMethod(SandboxPaymentCreateParams.PayStatement.PaymentMethod.CHECK)
                        .addTax(
                            SandboxPaymentCreateParams.PayStatement.Tax.builder()
                                .amount(0L)
                                .attributes(
                                    SandboxPaymentCreateParams.PayStatement.Tax.Metadata.builder()
                                        .metadata(
                                            SandboxPaymentCreateParams.PayStatement.Tax.Metadata
                                                .InnerMetadata
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .build()
                                )
                                .currency("currency")
                                .employer(true)
                                .name("name")
                                .type(SandboxPaymentCreateParams.PayStatement.Tax.Type.STATE)
                                .build()
                        )
                        .totalHours(0.0)
                        .type(SandboxPaymentCreateParams.PayStatement.Type.REGULAR_PAYROLL)
                        .build()
                )
            )
        assertThat(body.startDate()).contains("start_date")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SandboxPaymentCreateParams.builder().build()

        val body = params._body()

        assertNotNull(body)
    }
}
