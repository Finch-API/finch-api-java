// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisDirectoryListIndividualsPage
import com.tryfinch.api.models.HrisDirectoryListIndividualsParams
import com.tryfinch.api.models.HrisDirectoryListPage
import com.tryfinch.api.models.HrisDirectoryListParams

interface DirectoryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Read company directory and organization structure */
    @JvmOverloads
    fun list(
        params: HrisDirectoryListParams = HrisDirectoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisDirectoryListPage

    /** Read company directory and organization structure */
    fun list(requestOptions: RequestOptions): HrisDirectoryListPage =
        list(HrisDirectoryListParams.none(), requestOptions)

    /** Read company directory and organization structure */
    @Deprecated("use `list` instead")
    @JvmOverloads
    fun listIndividuals(
        params: HrisDirectoryListIndividualsParams = HrisDirectoryListIndividualsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisDirectoryListIndividualsPage

    /** Read company directory and organization structure */
    @Deprecated("use `list` instead")
    fun listIndividuals(requestOptions: RequestOptions): HrisDirectoryListIndividualsPage =
        listIndividuals(HrisDirectoryListIndividualsParams.none(), requestOptions)

    /** A view of [DirectoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /employer/directory`, but is otherwise the same as
         * [DirectoryService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: HrisDirectoryListParams = HrisDirectoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisDirectoryListPage>

        /**
         * Returns a raw HTTP response for `get /employer/directory`, but is otherwise the same as
         * [DirectoryService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<HrisDirectoryListPage> =
            list(HrisDirectoryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/directory`, but is otherwise the same as
         * [DirectoryService.listIndividuals].
         */
        @Deprecated("use `list` instead")
        @JvmOverloads
        @MustBeClosed
        fun listIndividuals(
            params: HrisDirectoryListIndividualsParams = HrisDirectoryListIndividualsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisDirectoryListIndividualsPage>

        /**
         * Returns a raw HTTP response for `get /employer/directory`, but is otherwise the same as
         * [DirectoryService.listIndividuals].
         */
        @Deprecated("use `list` instead")
        @MustBeClosed
        fun listIndividuals(
            requestOptions: RequestOptions
        ): HttpResponseFor<HrisDirectoryListIndividualsPage> =
            listIndividuals(HrisDirectoryListIndividualsParams.none(), requestOptions)
    }
}
