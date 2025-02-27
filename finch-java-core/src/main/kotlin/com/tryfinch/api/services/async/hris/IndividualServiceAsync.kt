// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HrisIndividualRetrieveManyPageAsync
import com.tryfinch.api.models.HrisIndividualRetrieveManyParams
import java.util.concurrent.CompletableFuture

interface IndividualServiceAsync {

    /** Read individual data, excluding income and employment data */
    @JvmOverloads
    fun retrieveMany(
        params: HrisIndividualRetrieveManyParams = HrisIndividualRetrieveManyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisIndividualRetrieveManyPageAsync>

    /** Read individual data, excluding income and employment data */
    fun retrieveMany(
        requestOptions: RequestOptions
    ): CompletableFuture<HrisIndividualRetrieveManyPageAsync> =
        retrieveMany(HrisIndividualRetrieveManyParams.none(), requestOptions)
}
