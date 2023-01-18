package org.finch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import org.finch.api.core.ExcludeMissing
import org.finch.api.core.JsonField
import org.finch.api.core.JsonMissing
import org.finch.api.core.JsonValue
import org.finch.api.core.NoAutoDetect
import org.finch.api.core.toUnmodifiable
import org.finch.api.services.async.ats.ApplicationServiceAsync

class AtsApplicationListPageAsync
private constructor(
    private val applicationsService: ApplicationServiceAsync,
    private val params: AtsApplicationListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun paging(): Paging = response().paging()

    fun applications(): List<Application> = response().applications()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AtsApplicationListPageAsync &&
            this.applicationsService == other.applicationsService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            applicationsService,
            params,
            response,
        )
    }

    override fun toString() =
        "AtsApplicationListPageAsync{applicationsService=$applicationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (applications().isEmpty()) {
            return false
        }

        return paging().offset().orElse(0) + applications().count() <
            paging().count().orElse(Long.MAX_VALUE)
    }

    fun getNextPageParams(): Optional<AtsApplicationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            AtsApplicationListParams.builder()
                .from(params)
                .offset(paging().offset().orElse(0) + applications().count())
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<AtsApplicationListPageAsync>> {
        return getNextPageParams()
            .map { applicationsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            applicationsService: ApplicationServiceAsync,
            params: AtsApplicationListParams,
            response: Response
        ) =
            AtsApplicationListPageAsync(
                applicationsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val paging: JsonField<Paging>,
        private val applications: JsonField<List<Application>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun paging(): Paging = paging.getRequired("paging")

        fun applications(): List<Application> = applications.getRequired("applications")

        @JsonProperty("paging")
        fun _paging(): Optional<JsonField<Paging>> = Optional.ofNullable(paging)

        @JsonProperty("applications")
        fun _applications(): Optional<JsonField<List<Application>>> =
            Optional.ofNullable(applications)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                paging().validate()
                applications().forEach { it.validate() }
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
                this.applications == other.applications &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                paging,
                applications,
                additionalProperties,
            )
        }

        override fun toString() =
            "AtsApplicationListPageAsync.Response{paging=$paging, applications=$applications, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var paging: JsonField<Paging> = JsonMissing.of()
            private var applications: JsonField<List<Application>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.paging = page.paging
                this.applications = page.applications
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun paging(paging: Paging) = paging(JsonField.of(paging))

            @JsonProperty("paging")
            fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

            fun applications(applications: List<Application>) =
                applications(JsonField.of(applications))

            @JsonProperty("applications")
            fun applications(applications: JsonField<List<Application>>) = apply {
                this.applications = applications
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    paging,
                    applications,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: AtsApplicationListPageAsync,
    ) {

        fun forEach(action: Predicate<Application>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AtsApplicationListPageAsync>>.forEach(
                action: (Application) -> Boolean,
                executor: Executor
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.applications().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<Application>> {
            val values = mutableListOf<Application>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
