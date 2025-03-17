// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.jobs

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.JobManualRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ManualServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val manualServiceAsync = client.jobs().manual()

        val manualAsyncJobFuture =
            manualServiceAsync.retrieve(JobManualRetrieveParams.builder().jobId("job_id").build())

        val manualAsyncJob = manualAsyncJobFuture.get()
        manualAsyncJob.validate()
    }
}
