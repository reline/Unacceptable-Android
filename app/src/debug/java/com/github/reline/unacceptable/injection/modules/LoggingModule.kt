package com.github.reline.unacceptable.injection.modules

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import timber.log.Timber
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object LoggingModule {
	@Provides
	@Singleton
	fun provideTree(): Timber.Tree = Timber.DebugTree()
}
