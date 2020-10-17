package com.bombadu.hilt1

import javax.inject.Inject

class AnalyticsAdapter @Inject constructor(
    private val service: AnalyticService
) {
}