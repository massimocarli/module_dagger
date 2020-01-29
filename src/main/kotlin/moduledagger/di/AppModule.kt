package moduledagger.di

import dagger.Module
import dagger.Provides
import moduledagger.Calculator
import moduledagger.CalculatorImpl
import moduledagger.IntReader
import moduledagger.StdIOIntReader
import java.util.*

@Module
class AppModule {

  @Provides
  fun calculator(): Calculator = CalculatorImpl()

  @Provides
  fun intReader(scanner: Scanner): IntReader = StdIOIntReader(scanner)

  @Provides
  fun scanner(): Scanner = Scanner(System.`in`)
}