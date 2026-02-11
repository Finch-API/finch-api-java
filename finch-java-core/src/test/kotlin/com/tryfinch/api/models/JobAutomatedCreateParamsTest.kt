// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobAutomatedCreateParamsTest {

    @Test
    fun create() {
        JobAutomatedCreateParams.builder().bodyDataSyncAll().build()
    }

    @Test
    fun body() {
        val params = JobAutomatedCreateParams.builder().bodyDataSyncAll().build()

        val body = params._body()

        assertThat(body).isEqualTo(JobAutomatedCreateParams.Body.ofDataSyncAll())
    }
}
