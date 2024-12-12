// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.junit.jupiter.api.Test

class JobAutomatedCreateParamsTest {

    @Test
    fun createJobAutomatedCreateParams() {
        JobAutomatedCreateParams.builder()
            .forDataSyncAll(
                JobAutomatedCreateParams.DataSyncAll.builder()
                    .type(JobAutomatedCreateParams.DataSyncAll.Type.DATA_SYNC_ALL)
                    .build()
            )
            .build()
    }
}
