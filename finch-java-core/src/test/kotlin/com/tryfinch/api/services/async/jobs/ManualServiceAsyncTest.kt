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
            manualServiceAsync.retrieve(
                JobManualRetrieveParams.builder()
                    .jobId("job_id")
                    .entityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val manualAsyncJob = manualAsyncJobFuture.get()
        manualAsyncJob.validate()
    }
}
