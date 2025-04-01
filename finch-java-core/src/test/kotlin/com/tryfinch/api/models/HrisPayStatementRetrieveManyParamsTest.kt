// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisPayStatementRetrieveManyParamsTest {

    @Test
    fun create() {
        HrisPayStatementRetrieveManyParams.builder()
            .addRequest(
                HrisPayStatementRetrieveManyParams.Request.builder()
                    .paymentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(50L)
                    .offset(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            HrisPayStatementRetrieveManyParams.builder()
                .addRequest(
                    HrisPayStatementRetrieveManyParams.Request.builder()
                        .paymentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .limit(50L)
                        .offset(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.requests())
            .containsExactly(
                HrisPayStatementRetrieveManyParams.Request.builder()
                    .paymentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(50L)
                    .offset(0L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            HrisPayStatementRetrieveManyParams.builder()
                .addRequest(
                    HrisPayStatementRetrieveManyParams.Request.builder()
                        .paymentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.requests())
            .containsExactly(
                HrisPayStatementRetrieveManyParams.Request.builder()
                    .paymentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
