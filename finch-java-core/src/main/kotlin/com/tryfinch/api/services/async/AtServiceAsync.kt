@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async

import com.tryfinch.api.services.async.ats.ApplicationServiceAsync
import com.tryfinch.api.services.async.ats.CandidateServiceAsync
import com.tryfinch.api.services.async.ats.JobServiceAsync
import com.tryfinch.api.services.async.ats.OfferServiceAsync
import com.tryfinch.api.services.async.ats.StageServiceAsync

interface AtServiceAsync {

    fun candidates(): CandidateServiceAsync

    fun applications(): ApplicationServiceAsync

    fun stages(): StageServiceAsync

    fun jobs(): JobServiceAsync

    fun offers(): OfferServiceAsync
}
