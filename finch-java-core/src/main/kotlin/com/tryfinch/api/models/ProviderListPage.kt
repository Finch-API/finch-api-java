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
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.services.blocking.ProviderService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Return details on all available payroll and HR systems. */
class ProviderListPage private constructor(
    private val providersService: ProviderService,
    private val params: ProviderListParams,
    private val response: Response,

) {

    fun response(): Response = response

    fun items(): List<Provider> = response().items()

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is ProviderListPage && providersService == other.providersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(providersService, params, response) /* spotless:on */

    override fun toString() = "ProviderListPage{providersService=$providersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
      return !items().isEmpty()
    }

    fun getNextPageParams(): Optional<ProviderListParams> {
      return Optional.empty()
    }

    fun getNextPage(): Optional<ProviderListPage> {
      return getNextPageParams().map { providersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(providersService: ProviderService, params: ProviderListParams, response: Response) =
            ProviderListPage(
              providersService,
              params,
              response,
            )
    }

    @NoAutoDetect
    class Response @JsonCreator constructor(
        @JsonProperty("items") private val items: JsonField<List<Provider>> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        fun items(): List<Provider> = items.getNullable("items") ?: listOf()

        @JsonProperty("items")
        fun _items(): Optional<JsonField<List<Provider>>> = Optional.ofNullable(items)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response =
            apply {
                if (validated) {
                  return@apply
                }

                items().map { it.validate() }
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Response && items == other.items && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(items, additionalProperties) /* spotless:on */

        override fun toString() = "Response{items=$items, additionalProperties=$additionalProperties}"

        companion object {

            /** Returns a mutable builder for constructing an instance of [ProviderListPage]. */
            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<Provider>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) =
                apply {
                    this.items = page.items
                    this.additionalProperties.putAll(page.additionalProperties)
                }

            fun items(items: List<Provider>) = items(JsonField.of(items))

            fun items(items: JsonField<List<Provider>>) = apply { this.items = items }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    this.additionalProperties.put(key, value)
                }

            fun build() =
                Response(
                  items, additionalProperties.toImmutable()
                )
        }
    }

    class AutoPager(
        private val firstPage: ProviderListPage,

    ) : Iterable<Provider> {

        override fun iterator(): Iterator<Provider> =
            iterator {
                var page = firstPage
                var index = 0
                while (true) {
                  while (index < page.items().size) {
                    yield(page.items()[index++])
                  }
                  page = page.getNextPage().getOrNull() ?: break
                  index = 0
                }
            }

        fun stream(): Stream<Provider> {
          return StreamSupport.stream(spliterator(), false)
        }
    }
}
