// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SandboxPaymentCreateParamsTest {

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
                                SandboxPaymentCreateParams.PayStatement.Earning.Attributes.builder()
                                    .metadata(
                                        SandboxPaymentCreateParams.PayStatement.Earning.Attributes
                                            .Metadata
                                            .builder()
                                            .metadata(
                                                SandboxPaymentCreateParams.PayStatement.Earning
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
                            .currency("currency")
                            .hours(0.0)
                            .name("name")
                            .type(SandboxPaymentCreateParams.PayStatement.Earning.Type.SALARY)
                            .build()
                    )
                    .addEmployeeDeduction(
                        SandboxPaymentCreateParams.PayStatement.EmployeeDeduction.builder()
                            .amount(2000L)
                            .attributes(
                                SandboxPaymentCreateParams.PayStatement.EmployeeDeduction.Attributes
                                    .builder()
                                    .metadata(
                                        SandboxPaymentCreateParams.PayStatement.EmployeeDeduction
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
                            .currency("usd")
                            .name("401k test")
                            .preTax(true)
                            .type(BenefitType._401K)
                            .build()
                    )
                    .addEmployerContribution(
                        SandboxPaymentCreateParams.PayStatement.EmployerContribution.builder()
                            .amount(0L)
                            .attributes(
                                SandboxPaymentCreateParams.PayStatement.EmployerContribution
                                    .Attributes
                                    .builder()
                                    .metadata(
                                        SandboxPaymentCreateParams.PayStatement.EmployerContribution
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
                            .currency("currency")
                            .name("name")
                            .type(BenefitType._401K)
                            .build()
                    )
                    .grossPay(Money.builder().amount(0L).currency("currency").build())
                    .individualId("b2338cfb-472f-4f72-9faa-e028c083144a")
                    .netPay(Money.builder().amount(0L).currency("currency").build())
                    .paymentMethod(SandboxPaymentCreateParams.PayStatement.PaymentMethod.CHECK)
                    .addTax(
                        SandboxPaymentCreateParams.PayStatement.Tax.builder()
                            .amount(0L)
                            .attributes(
                                SandboxPaymentCreateParams.PayStatement.Tax.Attributes.builder()
                                    .metadata(
                                        SandboxPaymentCreateParams.PayStatement.Tax.Attributes
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
                                    SandboxPaymentCreateParams.PayStatement.Earning.Attributes
                                        .builder()
                                        .metadata(
                                            SandboxPaymentCreateParams.PayStatement.Earning
                                                .Attributes
                                                .Metadata
                                                .builder()
                                                .metadata(
                                                    SandboxPaymentCreateParams.PayStatement.Earning
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
                                .currency("currency")
                                .hours(0.0)
                                .name("name")
                                .type(SandboxPaymentCreateParams.PayStatement.Earning.Type.SALARY)
                                .build()
                        )
                        .addEmployeeDeduction(
                            SandboxPaymentCreateParams.PayStatement.EmployeeDeduction.builder()
                                .amount(2000L)
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
                                .currency("usd")
                                .name("401k test")
                                .preTax(true)
                                .type(BenefitType._401K)
                                .build()
                        )
                        .addEmployerContribution(
                            SandboxPaymentCreateParams.PayStatement.EmployerContribution.builder()
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
                                .currency("currency")
                                .name("name")
                                .type(BenefitType._401K)
                                .build()
                        )
                        .grossPay(Money.builder().amount(0L).currency("currency").build())
                        .individualId("b2338cfb-472f-4f72-9faa-e028c083144a")
                        .netPay(Money.builder().amount(0L).currency("currency").build())
                        .paymentMethod(SandboxPaymentCreateParams.PayStatement.PaymentMethod.CHECK)
                        .addTax(
                            SandboxPaymentCreateParams.PayStatement.Tax.builder()
                                .amount(0L)
                                .attributes(
                                    SandboxPaymentCreateParams.PayStatement.Tax.Attributes.builder()
                                        .metadata(
                                            SandboxPaymentCreateParams.PayStatement.Tax.Attributes
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

        assertThat(body.endDate()).contains("end_date")
        assertThat(body.payStatements().getOrNull())
            .containsExactly(
                SandboxPaymentCreateParams.PayStatement.builder()
                    .addEarning(
                        SandboxPaymentCreateParams.PayStatement.Earning.builder()
                            .amount(0L)
                            .attributes(
                                SandboxPaymentCreateParams.PayStatement.Earning.Attributes.builder()
                                    .metadata(
                                        SandboxPaymentCreateParams.PayStatement.Earning.Attributes
                                            .Metadata
                                            .builder()
                                            .metadata(
                                                SandboxPaymentCreateParams.PayStatement.Earning
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
                            .currency("currency")
                            .hours(0.0)
                            .name("name")
                            .type(SandboxPaymentCreateParams.PayStatement.Earning.Type.SALARY)
                            .build()
                    )
                    .addEmployeeDeduction(
                        SandboxPaymentCreateParams.PayStatement.EmployeeDeduction.builder()
                            .amount(2000L)
                            .attributes(
                                SandboxPaymentCreateParams.PayStatement.EmployeeDeduction.Attributes
                                    .builder()
                                    .metadata(
                                        SandboxPaymentCreateParams.PayStatement.EmployeeDeduction
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
                            .currency("usd")
                            .name("401k test")
                            .preTax(true)
                            .type(BenefitType._401K)
                            .build()
                    )
                    .addEmployerContribution(
                        SandboxPaymentCreateParams.PayStatement.EmployerContribution.builder()
                            .amount(0L)
                            .attributes(
                                SandboxPaymentCreateParams.PayStatement.EmployerContribution
                                    .Attributes
                                    .builder()
                                    .metadata(
                                        SandboxPaymentCreateParams.PayStatement.EmployerContribution
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
                            .currency("currency")
                            .name("name")
                            .type(BenefitType._401K)
                            .build()
                    )
                    .grossPay(Money.builder().amount(0L).currency("currency").build())
                    .individualId("b2338cfb-472f-4f72-9faa-e028c083144a")
                    .netPay(Money.builder().amount(0L).currency("currency").build())
                    .paymentMethod(SandboxPaymentCreateParams.PayStatement.PaymentMethod.CHECK)
                    .addTax(
                        SandboxPaymentCreateParams.PayStatement.Tax.builder()
                            .amount(0L)
                            .attributes(
                                SandboxPaymentCreateParams.PayStatement.Tax.Attributes.builder()
                                    .metadata(
                                        SandboxPaymentCreateParams.PayStatement.Tax.Attributes
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
        assertThat(body.startDate()).contains("start_date")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SandboxPaymentCreateParams.builder().build()

        val body = params._body()
    }
}
