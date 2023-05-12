package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HrisIndividualEmploymentDataRetrieveManyParamsTest {

    @Test
    fun createHrisIndividualEmploymentDataRetrieveManyParams() {
        HrisIndividualEmploymentDataRetrieveManyParams.builder()
            .requests(
                listOf(
                    HrisIndividualEmploymentDataRetrieveManyParams.Request.builder()
                        .individualId("string")
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            HrisIndividualEmploymentDataRetrieveManyParams.builder()
                .requests(
                    listOf(
                        HrisIndividualEmploymentDataRetrieveManyParams.Request.builder()
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
                    HrisIndividualEmploymentDataRetrieveManyParams.Request.builder()
                        .individualId("string")
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            HrisIndividualEmploymentDataRetrieveManyParams.builder()
                .requests(
                    listOf(
                        HrisIndividualEmploymentDataRetrieveManyParams.Request.builder()
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
                    HrisIndividualEmploymentDataRetrieveManyParams.Request.builder()
                        .individualId("string")
                        .build()
                )
            )
    }
}
