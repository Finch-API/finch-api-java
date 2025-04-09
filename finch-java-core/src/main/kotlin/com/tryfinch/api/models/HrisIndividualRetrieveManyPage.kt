// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.blocking.hris.IndividualService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Read individual data, excluding income and employment data */
class HrisIndividualRetrieveManyPage
private constructor(
    private val individualsService: IndividualService,
    private val params: HrisIndividualRetrieveManyParams,
    private val response: HrisIndividualRetrieveManyPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): HrisIndividualRetrieveManyPageResponse = response

    /**
     * Delegates to [HrisIndividualRetrieveManyPageResponse], but gracefully handles missing data.
     *
     * @see [HrisIndividualRetrieveManyPageResponse.responses]
     */
    fun responses(): List<IndividualResponse> =
        response._responses().getOptional("responses").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisIndividualRetrieveManyPage && individualsService == other.individualsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(individualsService, params, response) /* spotless:on */

    override fun toString() =
        "HrisIndividualRetrieveManyPage{individualsService=$individualsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = responses().isNotEmpty()

    fun getNextPageParams(): Optional<HrisIndividualRetrieveManyParams> = Optional.empty()

    fun getNextPage(): Optional<HrisIndividualRetrieveManyPage> {
        return getNextPageParams().map { individualsService.retrieveMany(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            individualsService: IndividualService,
            params: HrisIndividualRetrieveManyParams,
            response: HrisIndividualRetrieveManyPageResponse,
        ) = HrisIndividualRetrieveManyPage(individualsService, params, response)
    }

    class AutoPager(private val firstPage: HrisIndividualRetrieveManyPage) :
        Iterable<IndividualResponse> {

        override fun iterator(): Iterator<IndividualResponse> = iterator {
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

        fun stream(): Stream<IndividualResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
