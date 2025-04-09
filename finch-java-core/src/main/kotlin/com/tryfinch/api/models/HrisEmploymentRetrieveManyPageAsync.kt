// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.EmploymentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [EmploymentServiceAsync.retrieveMany] */
class HrisEmploymentRetrieveManyPageAsync
private constructor(
    private val service: EmploymentServiceAsync,
    private val params: HrisEmploymentRetrieveManyParams,
    private val response: HrisEmploymentRetrieveManyPageResponse,
) {

    /**
     * Delegates to [HrisEmploymentRetrieveManyPageResponse], but gracefully handles missing data.
     *
     * @see [HrisEmploymentRetrieveManyPageResponse.responses]
     */
    fun responses(): List<EmploymentDataResponse> =
        response._responses().getOptional("responses").getOrNull() ?: emptyList()

    fun hasNextPage(): Boolean = responses().isNotEmpty()

    fun getNextPageParams(): Optional<HrisEmploymentRetrieveManyParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<HrisEmploymentRetrieveManyPageAsync>> =
        getNextPageParams()
            .map { service.retrieveMany(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisEmploymentRetrieveManyParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisEmploymentRetrieveManyPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisEmploymentRetrieveManyPageAsync].
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

    /** A builder for [HrisEmploymentRetrieveManyPageAsync]. */
    class Builder internal constructor() {

        private var service: EmploymentServiceAsync? = null
        private var params: HrisEmploymentRetrieveManyParams? = null
        private var response: HrisEmploymentRetrieveManyPageResponse? = null

        @JvmSynthetic
        internal fun from(
            hrisEmploymentRetrieveManyPageAsync: HrisEmploymentRetrieveManyPageAsync
        ) = apply {
            service = hrisEmploymentRetrieveManyPageAsync.service
            params = hrisEmploymentRetrieveManyPageAsync.params
            response = hrisEmploymentRetrieveManyPageAsync.response
        }

        fun service(service: EmploymentServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisEmploymentRetrieveManyParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HrisEmploymentRetrieveManyPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [HrisEmploymentRetrieveManyPageAsync].
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
        fun build(): HrisEmploymentRetrieveManyPageAsync =
            HrisEmploymentRetrieveManyPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisEmploymentRetrieveManyPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "HrisEmploymentRetrieveManyPageAsync{service=$service, params=$params, response=$response}"
}
