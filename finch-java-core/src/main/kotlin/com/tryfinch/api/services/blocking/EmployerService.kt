@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking

import com.tryfinch.api.services.blocking.employer.BenefitService

interface EmployerService {

    fun benefits(): BenefitService
}
