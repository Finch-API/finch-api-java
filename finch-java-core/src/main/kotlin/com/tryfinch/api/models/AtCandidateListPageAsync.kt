package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.services.async.ats.CandidateServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

class AtCandidateListPageAsync
private constructor(
    private val candidatesService: CandidateServiceAsync,
    private val params: AtCandidateListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun paging(): Paging = response().paging()

    fun candidates(): List<Candidate> = response().candidates()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AtCandidateListPageAsync &&
            this.candidatesService == other.candidatesService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            candidatesService,
            params,
            response,
        )
    }

    override fun toString() =
        "AtCandidateListPageAsync{candidatesService=$candidatesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (candidates().isEmpty()) {
            return false
        }

        return paging().offset().orElse(0) + candidates().count() <
            paging().count().orElse(Long.MAX_VALUE)
    }

    fun getNextPageParams(): Optional<AtCandidateListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            AtCandidateListParams.builder()
                .from(params)
                .offset(paging().offset().orElse(0) + candidates().count())
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<AtCandidateListPageAsync>> {
        return getNextPageParams()
            .map { candidatesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            candidatesService: CandidateServiceAsync,
            params: AtCandidateListParams,
            response: Response
        ) =
            AtCandidateListPageAsync(
                candidatesService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val paging: JsonField<Paging>,
        private val candidates: JsonField<List<Candidate>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun paging(): Paging = paging.getRequired("paging")

        fun candidates(): List<Candidate> = candidates.getRequired("candidates")

        @JsonProperty("paging")
        fun _paging(): Optional<JsonField<Paging>> = Optional.ofNullable(paging)

        @JsonProperty("candidates")
        fun _candidates(): Optional<JsonField<List<Candidate>>> = Optional.ofNullable(candidates)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                paging().validate()
                candidates().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                this.paging == other.paging &&
                this.candidates == other.candidates &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                paging,
                candidates,
                additionalProperties,
            )
        }

        override fun toString() =
            "AtCandidateListPageAsync.Response{paging=$paging, candidates=$candidates, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var paging: JsonField<Paging> = JsonMissing.of()
            private var candidates: JsonField<List<Candidate>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.paging = page.paging
                this.candidates = page.candidates
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun paging(paging: Paging) = paging(JsonField.of(paging))

            @JsonProperty("paging")
            fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

            fun candidates(candidates: List<Candidate>) = candidates(JsonField.of(candidates))

            @JsonProperty("candidates")
            fun candidates(candidates: JsonField<List<Candidate>>) = apply {
                this.candidates = candidates
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    paging,
                    candidates,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: AtCandidateListPageAsync,
    ) {

        fun forEach(action: Predicate<Candidate>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AtCandidateListPageAsync>>.forEach(
                action: (Candidate) -> Boolean,
                executor: Executor
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.candidates().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<Candidate>> {
            val values = mutableListOf<Candidate>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
