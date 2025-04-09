// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.blocking.hris.company.payStatementItem.RuleService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
 * support will be added soon List all rules of a connection account.
 */
class HrisCompanyPayStatementItemRuleListPage
private constructor(
    private val rulesService: RuleService,
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

        return /* spotless:off */ other is HrisCompanyPayStatementItemRuleListPage && rulesService == other.rulesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(rulesService, params, response) /* spotless:on */

    override fun toString() =
        "HrisCompanyPayStatementItemRuleListPage{rulesService=$rulesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = responses().isNotEmpty()

    fun getNextPageParams(): Optional<HrisCompanyPayStatementItemRuleListParams> = Optional.empty()

    fun getNextPage(): Optional<HrisCompanyPayStatementItemRuleListPage> {
        return getNextPageParams().map { rulesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            rulesService: RuleService,
            params: HrisCompanyPayStatementItemRuleListParams,
            response: HrisCompanyPayStatementItemRuleListPageResponse,
        ) = HrisCompanyPayStatementItemRuleListPage(rulesService, params, response)
    }

    class AutoPager(private val firstPage: HrisCompanyPayStatementItemRuleListPage) :
        Iterable<RuleListResponse> {

        override fun iterator(): Iterator<RuleListResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.responses().size) {
                    yield(page.responses()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<RuleListResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
