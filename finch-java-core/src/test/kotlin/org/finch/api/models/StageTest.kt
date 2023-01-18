package org.finch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StageTest {

    @Test
    fun createStage() {
        val stage =
            Stage.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("string")
                .build()
        assertThat(stage).isNotNull
        assertThat(stage.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(stage.jobId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(stage.name()).contains("string")
    }
}
