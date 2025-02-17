// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HrisPayStatementRetrieveManyParamsTest {

    @Test
    fun create() {
        HrisPayStatementRetrieveManyParams.builder()
            .addRequest(
                HrisPayStatementRetrieveManyParams.Request.builder()
                    .paymentId("string")
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
                        .paymentId("string")
                        .limit(50L)
                        .offset(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.requests())
            .isEqualTo(
                listOf(
                    HrisPayStatementRetrieveManyParams.Request.builder()
                        .paymentId("string")
                        .limit(50L)
                        .offset(0L)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            HrisPayStatementRetrieveManyParams.builder()
                .addRequest(
                    HrisPayStatementRetrieveManyParams.Request.builder().paymentId("string").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.requests())
            .isEqualTo(
                listOf(
                    HrisPayStatementRetrieveManyParams.Request.builder().paymentId("string").build()
                )
            )
    }
}
