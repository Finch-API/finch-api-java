// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.company.PayStatementItemServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
 * support will be added soon Retrieve a list of detailed pay statement items for the access token's
 * connection account.
 */
class HrisCompanyPayStatementItemListPageAsync
private constructor(
    private val payStatementItemService: PayStatementItemServiceAsync,
    private val params: HrisCompanyPayStatementItemListParams,
    private val response: HrisCompanyPayStatementItemListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): HrisCompanyPayStatementItemListPageResponse = response

    /**
     * Delegates to [HrisCompanyPayStatementItemListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [HrisCompanyPayStatementItemListPageResponse.responses]
     */
    fun responses(): List<PayStatementItemListResponse> =
        response._responses().getOptional("responses").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisCompanyPayStatementItemListPageAsync && payStatementItemService == other.payStatementItemService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(payStatementItemService, params, response) /* spotless:on */

    override fun toString() =
        "HrisCompanyPayStatementItemListPageAsync{payStatementItemService=$payStatementItemService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = responses().isNotEmpty()

    fun getNextPageParams(): Optional<HrisCompanyPayStatementItemListParams> = Optional.empty()

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
            response: HrisCompanyPayStatementItemListPageResponse,
        ) = HrisCompanyPayStatementItemListPageAsync(payStatementItemService, params, response)
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
