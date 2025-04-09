// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.company.payStatementItem.RuleServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
 * support will be added soon List all rules of a connection account.
 */
class HrisCompanyPayStatementItemRuleListPageAsync
private constructor(
    private val rulesService: RuleServiceAsync,
    private val params: HrisCompanyPayStatementItemRuleListParams,
    private val response: HrisCompanyPayStatementItemRuleListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): HrisCompanyPayStatementItemRuleListPageResponse = response

    /**
     * Delegates to [HrisCompanyPayStatementItemRuleListPageResponse], but gracefully handles
     * missing data.
     *
     * @see [HrisCompanyPayStatementItemRuleListPageResponse.responses]
     */
    fun responses(): List<RuleListResponse> =
        response._responses().getOptional("responses").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisCompanyPayStatementItemRuleListPageAsync && rulesService == other.rulesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(rulesService, params, response) /* spotless:on */

    override fun toString() =
        "HrisCompanyPayStatementItemRuleListPageAsync{rulesService=$rulesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = responses().isNotEmpty()

    fun getNextPageParams(): Optional<HrisCompanyPayStatementItemRuleListParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<HrisCompanyPayStatementItemRuleListPageAsync>> {
        return getNextPageParams()
            .map { rulesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            rulesService: RuleServiceAsync,
            params: HrisCompanyPayStatementItemRuleListParams,
            response: HrisCompanyPayStatementItemRuleListPageResponse,
        ) = HrisCompanyPayStatementItemRuleListPageAsync(rulesService, params, response)
    }

    class AutoPager(private val firstPage: HrisCompanyPayStatementItemRuleListPageAsync) {

        fun forEach(
            action: Predicate<RuleListResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<HrisCompanyPayStatementItemRuleListPageAsync>>.forEach(
                action: (RuleListResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<RuleListResponse>> {
            val values = mutableListOf<RuleListResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
