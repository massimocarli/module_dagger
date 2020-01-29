package moduledagger.di

import dagger.Component
import moduledagger.OptionalApplication

@Component(
  modules = arrayOf(
    CalculatorModule::class,
    IntReaderModule::class,
    LoggerModule::class
  )
)
interface AppComponent {

  fun app(): OptionalApplication
}