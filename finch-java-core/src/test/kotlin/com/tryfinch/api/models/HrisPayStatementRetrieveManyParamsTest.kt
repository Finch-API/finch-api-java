// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HrisPayStatementRetrieveManyParamsTest {

    @Test
    fun createHrisPayStatementRetrieveManyParams() {
        HrisPayStatementRetrieveManyParams.builder()
            .requests(
                listOf(
                    HrisPayStatementRetrieveManyParams.Request.builder()
                        .paymentId("string")
                        .limit(123L)
                        .offset(123L)
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            HrisPayStatementRetrieveManyParams.builder()
                .requests(
                    listOf(
                        HrisPayStatementRetrieveManyParams.Request.builder()
                            .paymentId("string")
                            .limit(123L)
                            .offset(123L)
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.requests())
            .isEqualTo(
                listOf(
                    HrisPayStatementRetrieveManyParams.Request.builder()
                        .paymentId("string")
                        .limit(123L)
                        .offset(123L)
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            HrisPayStatementRetrieveManyParams.builder()
                .requests(
                    listOf(
                        HrisPayStatementRetrieveManyParams.Request.builder()
                            .paymentId("string")
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.requests())
            .isEqualTo(
                listOf(
                    HrisPayStatementRetrieveManyParams.Request.builder().paymentId("string").build()
                )
            )
    }
}
