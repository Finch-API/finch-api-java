// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class JobAutomatedRetrieveParamsTest {

    @Test
    fun createJobAutomatedRetrieveParams() {
        JobAutomatedRetrieveParams.builder().jobId("job_id").build()
    }

    @Test
    fun getPathParam() {
        val params = JobAutomatedRetrieveParams.builder().jobId("job_id").build()
        assertThat(params).isNotNull
        // path param "jobId"
        assertThat(params.getPathParam(0)).isEqualTo("job_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
