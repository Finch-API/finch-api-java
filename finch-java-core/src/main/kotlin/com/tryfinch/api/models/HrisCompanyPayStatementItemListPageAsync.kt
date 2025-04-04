// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.errors.FinchInvalidDataException
import com.tryfinch.api.services.async.hris.company.PayStatementItemServiceAsync
import java.util.Collections
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/**
 * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
 * support will be added soon Retrieve a list of detailed pay statement items for the access token's
 * connection account.
 */
class HrisCompanyPayStatementItemListPageAsync
private constructor(
    private val payStatementItemService: PayStatementItemServiceAsync,
    private val params: HrisCompanyPayStatementItemListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun responses(): List<PayStatementItemListResponse> = response().responses()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisCompanyPayStatementItemListPageAsync && payStatementItemService == other.payStatementItemService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(payStatementItemService, params, response) /* spotless:on */

    override fun toString() =
        "HrisCompanyPayStatementItemListPageAsync{payStatementItemService=$payStatementItemService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !responses().isEmpty()
    }

    fun getNextPageParams(): Optional<HrisCompanyPayStatementItemListParams> {
        return Optional.empty()
    }

    fun getNextPage(): CompletableFuture<Optional<HrisCompanyPayStatementItemListPageAsync>> {
        return getNextPageParams()
            .map { payStatementItemService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            payStatementItemService: PayStatementItemServiceAsync,
            params: HrisCompanyPayStatementItemListParams,
            response: Response,
        ) = HrisCompanyPayStatementItemListPageAsync(payStatementItemService, params, response)
    }

    class Response(
        private val responses: JsonField<List<PayStatementItemListResponse>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("responses")
            responses: JsonField<List<PayStatementItemListResponse>> = JsonMissing.of()
        ) : this(responses, mutableMapOf())

        fun responses(): List<PayStatementItemListResponse> =
            responses.getNullable("responses") ?: listOf()

        @JsonProperty("responses")
        fun _responses(): Optional<JsonField<List<PayStatementItemListResponse>>> =
            Optional.ofNullable(responses)

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            responses().map { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: FinchInvalidDataException) {
                false
            }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && responses == other.responses && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(responses, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{responses=$responses, additionalProperties=$additionalProperties}"

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [HrisCompanyPayStatementItemListPageAsync].
             */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var responses: JsonField<List<PayStatementItemListResponse>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.responses = page.responses
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun responses(responses: List<PayStatementItemListResponse>) =
                responses(JsonField.of(responses))

            fun responses(responses: JsonField<List<PayStatementItemListResponse>>) = apply {
                this.responses = responses
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            /**
             * Returns an immutable instance of [Response].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Response = Response(responses, additionalProperties.toMutableMap())
        }
    }

    class AutoPager(private val firstPage: HrisCompanyPayStatementItemListPageAsync) {

        fun forEach(
            action: Predicate<PayStatementItemListResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<HrisCompanyPayStatementItemListPageAsync>>.forEach(
                action: (PayStatementItemListResponse) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.responses().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<PayStatementItemListResponse>> {
            val values = mutableListOf<PayStatementItemListResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
