package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HrisIndividualsEmploymentDataRetrieveManyParamsTest {

    @Test
    fun createHrisIndividualsEmploymentDataRetrieveManyParams() {
        HrisIndividualsEmploymentDataRetrieveManyParams.builder()
            .requests(
                listOf(
                    HrisIndividualsEmploymentDataRetrieveManyParams.Request.builder()
                        .individualId("string")
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            HrisIndividualsEmploymentDataRetrieveManyParams.builder()
                .requests(
                    listOf(
                        HrisIndividualsEmploymentDataRetrieveManyParams.Request.builder()
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
                    HrisIndividualsEmploymentDataRetrieveManyParams.Request.builder()
                        .individualId("string")
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            HrisIndividualsEmploymentDataRetrieveManyParams.builder()
                .requests(
                    listOf(
                        HrisIndividualsEmploymentDataRetrieveManyParams.Request.builder()
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
                    HrisIndividualsEmploymentDataRetrieveManyParams.Request.builder()
                        .individualId("string")
                        .build()
                )
            )
    }
}
