@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.services.async

import org.finch.api.services.async.ats.ApplicationServiceAsync
import org.finch.api.services.async.ats.CandidateServiceAsync
import org.finch.api.services.async.ats.JobServiceAsync
import org.finch.api.services.async.ats.OfferServiceAsync
import org.finch.api.services.async.ats.StageServiceAsync

interface AtServiceAsync {

    fun candidates(): CandidateServiceAsync

    fun applications(): ApplicationServiceAsync

    fun stages(): StageServiceAsync

    fun jobs(): JobServiceAsync

    fun offers(): OfferServiceAsync
}
