// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.DirectoryServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** Read company directory and organization structure */
class HrisDirectoryListPageAsync
private constructor(
    private val directoryService: DirectoryServiceAsync,
    private val params: HrisDirectoryListParams,
    private val response: HrisDirectoryListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): HrisDirectoryListPageResponse = response

    /**
     * Delegates to [HrisDirectoryListPageResponse], but gracefully handles missing data.
     *
     * @see [HrisDirectoryListPageResponse.individuals]
     */
    fun individuals(): List<IndividualInDirectory> =
        response._individuals().getOptional("individuals").getOrNull() ?: emptyList()

    /**
     * Delegates to [HrisDirectoryListPageResponse], but gracefully handles missing data.
     *
     * @see [HrisDirectoryListPageResponse.paging]
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisDirectoryListPageAsync && directoryService == other.directoryService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(directoryService, params, response) /* spotless:on */

    override fun toString() =
        "HrisDirectoryListPageAsync{directoryService=$directoryService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (individuals().isEmpty()) {
            return false
        }

        val offset = paging().flatMap { it._offset().getOptional("offset") }.getOrDefault(0)
        val totalCount =
            paging().flatMap { it._count().getOptional("count") }.getOrDefault(Long.MAX_VALUE)
        return offset + individuals().size < totalCount
    }

    fun getNextPageParams(): Optional<HrisDirectoryListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        val offset = paging().flatMap { it._offset().getOptional("offset") }.getOrDefault(0)
        return Optional.of(params.toBuilder().offset(offset + individuals().size).build())
    }

    fun getNextPage(): CompletableFuture<Optional<HrisDirectoryListPageAsync>> {
        return getNextPageParams()
            .map { directoryService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            directoryService: DirectoryServiceAsync,
            params: HrisDirectoryListParams,
            response: HrisDirectoryListPageResponse,
        ) = HrisDirectoryListPageAsync(directoryService, params, response)
    }

    class AutoPager(private val firstPage: HrisDirectoryListPageAsync) {

        fun forEach(
            action: Predicate<IndividualInDirectory>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<HrisDirectoryListPageAsync>>.forEach(
                action: (IndividualInDirectory) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.individuals().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<IndividualInDirectory>> {
            val values = mutableListOf<IndividualInDirectory>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
