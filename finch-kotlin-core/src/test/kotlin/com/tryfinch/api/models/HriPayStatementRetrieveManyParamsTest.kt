package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HriPayStatementRetrieveManyParamsTest {

    @Test
    fun createHriPayStatementRetrieveManyParams() {
        HriPayStatementRetrieveManyParams.builder()
            .requests(
                listOf(
                    HriPayStatementRetrieveManyParams.Request.builder()
                        .paymentId("e8b90071-0c11-471c-86e8-e303ef2f6782")
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
            HriPayStatementRetrieveManyParams.builder()
                .requests(
                    listOf(
                        HriPayStatementRetrieveManyParams.Request.builder()
                            .paymentId("e8b90071-0c11-471c-86e8-e303ef2f6782")
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
                    HriPayStatementRetrieveManyParams.Request.builder()
                        .paymentId("e8b90071-0c11-471c-86e8-e303ef2f6782")
                        .limit(123L)
                        .offset(123L)
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            HriPayStatementRetrieveManyParams.builder()
                .requests(
                    listOf(
                        HriPayStatementRetrieveManyParams.Request.builder()
                            .paymentId("e8b90071-0c11-471c-86e8-e303ef2f6782")
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.requests())
            .isEqualTo(
                listOf(
                    HriPayStatementRetrieveManyParams.Request.builder()
                        .paymentId("e8b90071-0c11-471c-86e8-e303ef2f6782")
                        .build()
                )
            )
    }
}
