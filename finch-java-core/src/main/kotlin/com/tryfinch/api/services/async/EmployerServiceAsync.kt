@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async

import com.tryfinch.api.services.async.employer.BenefitServiceAsync

interface EmployerServiceAsync {

    fun benefits(): BenefitServiceAsync
}
