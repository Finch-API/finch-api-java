@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.async.ats

import java.util.concurrent.CompletableFuture
import org.finch.api.core.RequestOptions
import org.finch.api.models.AtsOfferListPageAsync
import org.finch.api.models.AtsOfferListParams
import org.finch.api.models.AtsOfferRetrieveParams
import org.finch.api.models.Offer

interface OfferServiceAsync {

    /** Get a single offer from an organization. */
    @JvmOverloads
    fun retrieve(
        params: AtsOfferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Offer>

    /** Get all offers put out by an organization. */
    @JvmOverloads
    fun list(
        params: AtsOfferListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AtsOfferListPageAsync>
}
