package moduledagger.di

import dagger.Binds
import dagger.BindsOptionalOf
import dagger.Module
import moduledagger.Logger
import moduledagger.LoggerImpl

@Module
abstract class LoggerModule {

  @Binds
  abstract fun logger(impl: LoggerImpl): Logger

  @BindsOptionalOf
  abstract fun provideLogger(): Logger
}