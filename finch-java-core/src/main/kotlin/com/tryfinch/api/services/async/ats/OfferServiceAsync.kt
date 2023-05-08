@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.ats

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.AtOfferListPageAsync
import com.tryfinch.api.models.AtOfferListParams
import com.tryfinch.api.models.AtOfferRetrieveParams
import com.tryfinch.api.models.Offer
import java.util.concurrent.CompletableFuture

interface OfferServiceAsync {

    /** Get a single offer from an organization. */
    @JvmOverloads
    fun retrieve(
        params: AtOfferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Offer>

    /** Get all offers put out by an organization. */
    @JvmOverloads
    fun list(
        params: AtOfferListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AtOfferListPageAsync>
}
