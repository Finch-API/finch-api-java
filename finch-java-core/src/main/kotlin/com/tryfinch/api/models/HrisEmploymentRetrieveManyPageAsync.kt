// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.EmploymentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Read individual employment and income data */
class HrisEmploymentRetrieveManyPageAsync
private constructor(
    private val employmentsService: EmploymentServiceAsync,
    private val params: HrisEmploymentRetrieveManyParams,
    private val response: HrisEmploymentRetrieveManyPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): HrisEmploymentRetrieveManyPageResponse = response

    /**
     * Delegates to [HrisEmploymentRetrieveManyPageResponse], but gracefully handles missing data.
     *
     * @see [HrisEmploymentRetrieveManyPageResponse.responses]
     */
    fun responses(): List<EmploymentDataResponse> =
        response._responses().getOptional("responses").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisEmploymentRetrieveManyPageAsync && employmentsService == other.employmentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(employmentsService, params, response) /* spotless:on */

    override fun toString() =
        "HrisEmploymentRetrieveManyPageAsync{employmentsService=$employmentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = responses().isNotEmpty()

    fun getNextPageParams(): Optional<HrisEmploymentRetrieveManyParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<HrisEmploymentRetrieveManyPageAsync>> {
        return getNextPageParams()
            .map { employmentsService.retrieveMany(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            employmentsService: EmploymentServiceAsync,
            params: HrisEmploymentRetrieveManyParams,
            response: HrisEmploymentRetrieveManyPageResponse,
        ) = HrisEmploymentRetrieveManyPageAsync(employmentsService, params, response)
    }

    class AutoPager(private val firstPage: HrisEmploymentRetrieveManyPageAsync) {

        fun forEach(
            action: Predicate<EmploymentDataResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<HrisEmploymentRetrieveManyPageAsync>>.forEach(
                action: (EmploymentDataResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<EmploymentDataResponse>> {
            val values = mutableListOf<EmploymentDataResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
