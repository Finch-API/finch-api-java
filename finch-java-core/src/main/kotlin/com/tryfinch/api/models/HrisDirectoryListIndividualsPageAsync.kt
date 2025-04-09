// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.DirectoryServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [DirectoryServiceAsync.listIndividuals] */
@Deprecated("use `list` instead")
class HrisDirectoryListIndividualsPageAsync
private constructor(
    private val service: DirectoryServiceAsync,
    private val params: HrisDirectoryListIndividualsParams,
    private val response: HrisDirectoryListIndividualsPageResponse,
) {

    /**
     * Delegates to [HrisDirectoryListIndividualsPageResponse], but gracefully handles missing data.
     *
     * @see [HrisDirectoryListIndividualsPageResponse.individuals]
     */
    fun individuals(): List<IndividualInDirectory> =
        response._individuals().getOptional("individuals").getOrNull() ?: emptyList()

    /**
     * Delegates to [HrisDirectoryListIndividualsPageResponse], but gracefully handles missing data.
     *
     * @see [HrisDirectoryListIndividualsPageResponse.paging]
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    fun hasNextPage(): Boolean {
        if (individuals().isEmpty()) {
            return false
        }

        val offset = paging().flatMap { it._offset().getOptional("offset") }.getOrDefault(0)
        val totalCount =
            paging().flatMap { it._count().getOptional("count") }.getOrDefault(Long.MAX_VALUE)
        return offset + individuals().size < totalCount
    }

    fun getNextPageParams(): Optional<HrisDirectoryListIndividualsParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        val offset = paging().flatMap { it._offset().getOptional("offset") }.getOrDefault(0)
        return Optional.of(params.toBuilder().offset(offset + individuals().size).build())
    }

    fun getNextPage(): CompletableFuture<Optional<HrisDirectoryListIndividualsPageAsync>> =
        getNextPageParams()
            .map { service.listIndividuals(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisDirectoryListIndividualsParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisDirectoryListIndividualsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisDirectoryListIndividualsPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HrisDirectoryListIndividualsPageAsync]. */
    class Builder internal constructor() {

        private var service: DirectoryServiceAsync? = null
        private var params: HrisDirectoryListIndividualsParams? = null
        private var response: HrisDirectoryListIndividualsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            hrisDirectoryListIndividualsPageAsync: HrisDirectoryListIndividualsPageAsync
        ) = apply {
            service = hrisDirectoryListIndividualsPageAsync.service
            params = hrisDirectoryListIndividualsPageAsync.params
            response = hrisDirectoryListIndividualsPageAsync.response
        }

        fun service(service: DirectoryServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisDirectoryListIndividualsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HrisDirectoryListIndividualsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [HrisDirectoryListIndividualsPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HrisDirectoryListIndividualsPageAsync =
            HrisDirectoryListIndividualsPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: HrisDirectoryListIndividualsPageAsync) {

        fun forEach(
            action: Predicate<IndividualInDirectory>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<HrisDirectoryListIndividualsPageAsync>>.forEach(
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisDirectoryListIndividualsPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "HrisDirectoryListIndividualsPageAsync{service=$service, params=$params, response=$response}"
}
