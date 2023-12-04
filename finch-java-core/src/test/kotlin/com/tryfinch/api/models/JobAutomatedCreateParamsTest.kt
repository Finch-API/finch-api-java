// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class JobAutomatedCreateParamsTest {

    @Test
    fun createJobAutomatedCreateParams() {
        JobAutomatedCreateParams.builder().type(JobAutomatedCreateParams.Type.DATA_SYNC_ALL).build()
    }

    @Test
    fun getBody() {
        val params =
            JobAutomatedCreateParams.builder()
                .type(JobAutomatedCreateParams.Type.DATA_SYNC_ALL)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.type()).isEqualTo(JobAutomatedCreateParams.Type.DATA_SYNC_ALL)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            JobAutomatedCreateParams.builder()
                .type(JobAutomatedCreateParams.Type.DATA_SYNC_ALL)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.type()).isEqualTo(JobAutomatedCreateParams.Type.DATA_SYNC_ALL)
    }
}
