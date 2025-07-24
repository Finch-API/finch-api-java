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
    fun list(): HrisDirectoryListPage = list(HrisDirectoryListParams.none())

    /** @see list */
    fun list(
        params: HrisDirectoryListParams = HrisDirectoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisDirectoryListPage

    /** @see list */
    fun list(
        params: HrisDirectoryListParams = HrisDirectoryListParams.none()
    ): HrisDirectoryListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): HrisDirectoryListPage =
        list(HrisDirectoryListParams.none(), requestOptions)

    /** Read company directory and organization structure */
    @Deprecated("use `list` instead")
    fun listIndividuals(): HrisDirectoryListIndividualsPage =
        listIndividuals(HrisDirectoryListIndividualsParams.none())

    /** @see listIndividuals */
    @Deprecated("use `list` instead")
    fun listIndividuals(
        params: HrisDirectoryListIndividualsParams = HrisDirectoryListIndividualsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisDirectoryListIndividualsPage

    /** @see listIndividuals */
    @Deprecated("use `list` instead")
    fun listIndividuals(
        params: HrisDirectoryListIndividualsParams = HrisDirectoryListIndividualsParams.none()
    ): HrisDirectoryListIndividualsPage = listIndividuals(params, RequestOptions.none())

    /** @see listIndividuals */
    @Deprecated("use `list` instead")
    fun listIndividuals(requestOptions: RequestOptions): HrisDirectoryListIndividualsPage =
        listIndividuals(HrisDirectoryListIndividualsParams.none(), requestOptions)

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
        fun list(): HttpResponseFor<HrisDirectoryListPage> = list(HrisDirectoryListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: HrisDirectoryListParams = HrisDirectoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisDirectoryListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: HrisDirectoryListParams = HrisDirectoryListParams.none()
        ): HttpResponseFor<HrisDirectoryListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<HrisDirectoryListPage> =
            list(HrisDirectoryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/directory`, but is otherwise the same as
         * [DirectoryService.listIndividuals].
         */
        @Deprecated("use `list` instead")
        @MustBeClosed
        fun listIndividuals(): HttpResponseFor<HrisDirectoryListIndividualsPage> =
            listIndividuals(HrisDirectoryListIndividualsParams.none())

        /** @see listIndividuals */
        @Deprecated("use `list` instead")
        @MustBeClosed
        fun listIndividuals(
            params: HrisDirectoryListIndividualsParams = HrisDirectoryListIndividualsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisDirectoryListIndividualsPage>

        /** @see listIndividuals */
        @Deprecated("use `list` instead")
        @MustBeClosed
        fun listIndividuals(
            params: HrisDirectoryListIndividualsParams = HrisDirectoryListIndividualsParams.none()
        ): HttpResponseFor<HrisDirectoryListIndividualsPage> =
            listIndividuals(params, RequestOptions.none())

        /** @see listIndividuals */
        @Deprecated("use `list` instead")
        @MustBeClosed
        fun listIndividuals(
            requestOptions: RequestOptions
        ): HttpResponseFor<HrisDirectoryListIndividualsPage> =
            listIndividuals(HrisDirectoryListIndividualsParams.none(), requestOptions)
    }
}
