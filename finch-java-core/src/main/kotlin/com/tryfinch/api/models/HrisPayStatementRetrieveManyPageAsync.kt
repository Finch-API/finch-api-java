// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.PayStatementServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Read detailed pay statements for each individual.
 *
 * Deduction and contribution types are supported by the payroll systems that supports Benefits.
 */
class HrisPayStatementRetrieveManyPageAsync
private constructor(
    private val payStatementsService: PayStatementServiceAsync,
    private val params: HrisPayStatementRetrieveManyParams,
    private val response: HrisPayStatementRetrieveManyPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): HrisPayStatementRetrieveManyPageResponse = response

    /**
     * Delegates to [HrisPayStatementRetrieveManyPageResponse], but gracefully handles missing data.
     *
     * @see [HrisPayStatementRetrieveManyPageResponse.responses]
     */
    fun responses(): List<PayStatementResponse> =
        response._responses().getOptional("responses").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisPayStatementRetrieveManyPageAsync && payStatementsService == other.payStatementsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(payStatementsService, params, response) /* spotless:on */

    override fun toString() =
        "HrisPayStatementRetrieveManyPageAsync{payStatementsService=$payStatementsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = responses().isNotEmpty()

    fun getNextPageParams(): Optional<HrisPayStatementRetrieveManyParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<HrisPayStatementRetrieveManyPageAsync>> {
        return getNextPageParams()
            .map { payStatementsService.retrieveMany(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            payStatementsService: PayStatementServiceAsync,
            params: HrisPayStatementRetrieveManyParams,
            response: HrisPayStatementRetrieveManyPageResponse,
        ) = HrisPayStatementRetrieveManyPageAsync(payStatementsService, params, response)
    }

    class AutoPager(private val firstPage: HrisPayStatementRetrieveManyPageAsync) {

        fun forEach(
            action: Predicate<PayStatementResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<HrisPayStatementRetrieveManyPageAsync>>.forEach(
                action: (PayStatementResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<PayStatementResponse>> {
            val values = mutableListOf<PayStatementResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
