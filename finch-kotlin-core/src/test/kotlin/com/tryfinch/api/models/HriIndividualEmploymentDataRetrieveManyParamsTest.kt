package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HriIndividualEmploymentDataRetrieveManyParamsTest {

    @Test
    fun createHriIndividualEmploymentDataRetrieveManyParams() {
        HriIndividualEmploymentDataRetrieveManyParams.builder()
            .requests(
                listOf(
                    HriIndividualEmploymentDataRetrieveManyParams.Request.builder()
                        .individualId("string")
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            HriIndividualEmploymentDataRetrieveManyParams.builder()
                .requests(
                    listOf(
                        HriIndividualEmploymentDataRetrieveManyParams.Request.builder()
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
                    HriIndividualEmploymentDataRetrieveManyParams.Request.builder()
                        .individualId("string")
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            HriIndividualEmploymentDataRetrieveManyParams.builder()
                .requests(
                    listOf(
                        HriIndividualEmploymentDataRetrieveManyParams.Request.builder()
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
                    HriIndividualEmploymentDataRetrieveManyParams.Request.builder()
                        .individualId("string")
                        .build()
                )
            )
    }
}
