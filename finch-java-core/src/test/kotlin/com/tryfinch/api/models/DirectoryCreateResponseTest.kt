// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectoryCreateResponseTest {

    @Test
    fun create() {
        val directoryCreateResponse = DirectoryCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val directoryCreateResponse = DirectoryCreateResponse.builder().build()

        val roundtrippedDirectoryCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(directoryCreateResponse),
                jacksonTypeRef<DirectoryCreateResponse>(),
            )

        assertThat(roundtrippedDirectoryCreateResponse).isEqualTo(directoryCreateResponse)
    }
}
