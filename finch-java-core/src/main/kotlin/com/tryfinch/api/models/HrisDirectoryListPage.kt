// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.blocking.hris.DirectoryService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** Read company directory and organization structure */
class HrisDirectoryListPage
private constructor(
    private val directoryService: DirectoryService,
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

        return /* spotless:off */ other is HrisDirectoryListPage && directoryService == other.directoryService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(directoryService, params, response) /* spotless:on */

    override fun toString() =
        "HrisDirectoryListPage{directoryService=$directoryService, params=$params, response=$response}"

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

    fun getNextPage(): Optional<HrisDirectoryListPage> {
        return getNextPageParams().map { directoryService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            directoryService: DirectoryService,
            params: HrisDirectoryListParams,
            response: HrisDirectoryListPageResponse,
        ) = HrisDirectoryListPage(directoryService, params, response)
    }

    class AutoPager(private val firstPage: HrisDirectoryListPage) :
        Iterable<IndividualInDirectory> {

        override fun iterator(): Iterator<IndividualInDirectory> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.individuals().size) {
                    yield(page.individuals()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<IndividualInDirectory> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
