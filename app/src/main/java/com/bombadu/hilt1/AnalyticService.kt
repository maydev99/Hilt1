package com.bombadu.hilt1

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject

interface AnalyticService {
    fun analyticsMethods()
}

//Constructor-injected, because Hilt need to know how to
//provide instances of AnalyticsServiceImpl, too

class AnalyticsServiceImpl @Inject constructor(

) : AnalyticService{
    override fun analyticsMethods() {

    }

}

/*@Module
@InstallIn(ActivityComponent::class)
abstract class AnalyticsModule {
    @Binds
    abstract fun bindAnalyticsService(
        analyticsServiceImpl: AnalyticsServiceImpl
    ) : AnalyticService


}*/