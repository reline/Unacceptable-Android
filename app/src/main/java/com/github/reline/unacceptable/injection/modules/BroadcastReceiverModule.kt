package com.github.reline.unacceptable.injection.modules

import com.github.reline.unacceptable.injection.appwidget.UnacceptableWidgetProvider
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [ApplicationModule::class])
abstract class BroadcastReceiverModule {
    @ContributesAndroidInjector
    abstract fun contributeUnacceptableWidgetProviderInjector(): UnacceptableWidgetProvider
}