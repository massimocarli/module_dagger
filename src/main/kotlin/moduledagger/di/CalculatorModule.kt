package moduledagger.di

import dagger.Binds
import dagger.Module
import moduledagger.Calculator
import moduledagger.CalculatorImpl

@Module
abstract class CalculatorModule {

  @Binds
  abstract fun calculator(impl: CalculatorImpl): Calculator
}