// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisDirectoryListIndividualsPage
import com.tryfinch.api.models.HrisDirectoryListIndividualsParams
import com.tryfinch.api.models.HrisDirectoryListPage
import com.tryfinch.api.models.HrisDirectoryListParams
import java.util.function.Consumer

interface DirectoryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirectoryService

    /** Read company directory and organization structure */
    fun list(params: HrisDirectoryListParams): HrisDirectoryListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: HrisDirectoryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisDirectoryListPage

    /** Read company directory and organization structure */
    @Deprecated("use `list` instead")
    fun listIndividuals(
        params: HrisDirectoryListIndividualsParams
    ): HrisDirectoryListIndividualsPage = listIndividuals(params, RequestOptions.none())

    /** @see listIndividuals */
    @Deprecated("use `list` instead")
    fun listIndividuals(
        params: HrisDirectoryListIndividualsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisDirectoryListIndividualsPage

    /** A view of [DirectoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirectoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /employer/directory`, but is otherwise the same as
         * [DirectoryService.list].
         */
        @MustBeClosed
        fun list(params: HrisDirectoryListParams): HttpResponseFor<HrisDirectoryListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: HrisDirectoryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisDirectoryListPage>

        /**
         * Returns a raw HTTP response for `get /employer/directory`, but is otherwise the same as
         * [DirectoryService.listIndividuals].
         */
        @Deprecated("use `list` instead")
        @MustBeClosed
        fun listIndividuals(
            params: HrisDirectoryListIndividualsParams
        ): HttpResponseFor<HrisDirectoryListIndividualsPage> =
            listIndividuals(params, RequestOptions.none())

        /** @see listIndividuals */
        @Deprecated("use `list` instead")
        @MustBeClosed
        fun listIndividuals(
            params: HrisDirectoryListIndividualsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisDirectoryListIndividualsPage>
    }
}
