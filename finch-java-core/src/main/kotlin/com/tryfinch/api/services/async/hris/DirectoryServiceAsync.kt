// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisDirectoryListIndividualsPageAsync
import com.tryfinch.api.models.HrisDirectoryListIndividualsParams
import com.tryfinch.api.models.HrisDirectoryListPageAsync
import com.tryfinch.api.models.HrisDirectoryListParams
import java.util.concurrent.CompletableFuture

interface DirectoryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Read company directory and organization structure */
    fun list(): CompletableFuture<HrisDirectoryListPageAsync> = list(HrisDirectoryListParams.none())

    /** @see [list] */
    fun list(
        params: HrisDirectoryListParams = HrisDirectoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisDirectoryListPageAsync>

    /** @see [list] */
    fun list(
        params: HrisDirectoryListParams = HrisDirectoryListParams.none()
    ): CompletableFuture<HrisDirectoryListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<HrisDirectoryListPageAsync> =
        list(HrisDirectoryListParams.none(), requestOptions)

    /** Read company directory and organization structure */
    @Deprecated("use `list` instead")
    fun listIndividuals(): CompletableFuture<HrisDirectoryListIndividualsPageAsync> =
        listIndividuals(HrisDirectoryListIndividualsParams.none())

    /** @see [listIndividuals] */
    @Deprecated("use `list` instead")
    fun listIndividuals(
        params: HrisDirectoryListIndividualsParams = HrisDirectoryListIndividualsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisDirectoryListIndividualsPageAsync>

    /** @see [listIndividuals] */
    @Deprecated("use `list` instead")
    fun listIndividuals(
        params: HrisDirectoryListIndividualsParams = HrisDirectoryListIndividualsParams.none()
    ): CompletableFuture<HrisDirectoryListIndividualsPageAsync> =
        listIndividuals(params, RequestOptions.none())

    /** @see [listIndividuals] */
    @Deprecated("use `list` instead")
    fun listIndividuals(
        requestOptions: RequestOptions
    ): CompletableFuture<HrisDirectoryListIndividualsPageAsync> =
        listIndividuals(HrisDirectoryListIndividualsParams.none(), requestOptions)

    /**
     * A view of [DirectoryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /employer/directory`, but is otherwise the same as
         * [DirectoryServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<HrisDirectoryListPageAsync>> =
            list(HrisDirectoryListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: HrisDirectoryListParams = HrisDirectoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HrisDirectoryListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: HrisDirectoryListParams = HrisDirectoryListParams.none()
        ): CompletableFuture<HttpResponseFor<HrisDirectoryListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<HrisDirectoryListPageAsync>> =
            list(HrisDirectoryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/directory`, but is otherwise the same as
         * [DirectoryServiceAsync.listIndividuals].
         */
        @Deprecated("use `list` instead")
        @MustBeClosed
        fun listIndividuals():
            CompletableFuture<HttpResponseFor<HrisDirectoryListIndividualsPageAsync>> =
            listIndividuals(HrisDirectoryListIndividualsParams.none())

        /** @see [listIndividuals] */
        @Deprecated("use `list` instead")
        @MustBeClosed
        fun listIndividuals(
            params: HrisDirectoryListIndividualsParams = HrisDirectoryListIndividualsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HrisDirectoryListIndividualsPageAsync>>

        /** @see [listIndividuals] */
        @Deprecated("use `list` instead")
        @MustBeClosed
        fun listIndividuals(
            params: HrisDirectoryListIndividualsParams = HrisDirectoryListIndividualsParams.none()
        ): CompletableFuture<HttpResponseFor<HrisDirectoryListIndividualsPageAsync>> =
            listIndividuals(params, RequestOptions.none())

        /** @see [listIndividuals] */
        @Deprecated("use `list` instead")
        @MustBeClosed
        fun listIndividuals(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<HrisDirectoryListIndividualsPageAsync>> =
            listIndividuals(HrisDirectoryListIndividualsParams.none(), requestOptions)
    }
}
