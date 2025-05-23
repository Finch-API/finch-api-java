// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobManualRetrieveParamsTest {

    @Test
    fun create() {
        JobManualRetrieveParams.builder().jobId("job_id").build()
    }

    @Test
    fun pathParams() {
        val params = JobManualRetrieveParams.builder().jobId("job_id").build()

        assertThat(params._pathParam(0)).isEqualTo("job_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
