package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HrisEmploymentRetrieveManyParamsTest {

    @Test
    fun createHrisEmploymentRetrieveManyParams() {
        HrisEmploymentRetrieveManyParams.builder()
            .requests(
                listOf(
                    HrisEmploymentRetrieveManyParams.Request.builder()
                        .individualId("string")
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            HrisEmploymentRetrieveManyParams.builder()
                .requests(
                    listOf(
                        HrisEmploymentRetrieveManyParams.Request.builder()
                            .individualId("string")
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.requests())
            .isEqualTo(
                listOf(
                    HrisEmploymentRetrieveManyParams.Request.builder()
                        .individualId("string")
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            HrisEmploymentRetrieveManyParams.builder()
                .requests(
                    listOf(
                        HrisEmploymentRetrieveManyParams.Request.builder()
                            .individualId("string")
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.requests())
            .isEqualTo(
                listOf(
                    HrisEmploymentRetrieveManyParams.Request.builder()
                        .individualId("string")
                        .build()
                )
            )
    }
}
