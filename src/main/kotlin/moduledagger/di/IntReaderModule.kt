package moduledagger.di

import dagger.Module
import dagger.Provides
import moduledagger.IntReader
import moduledagger.StdIOIntReader
import java.util.*

@Module
class IntReaderModule {

  @Module
  companion object {
    @Provides
    @JvmStatic
    fun intReader(scanner: Scanner): IntReader = StdIOIntReader(scanner)

    @Provides
    @JvmStatic
    fun scanner(): Scanner = Scanner(System.`in`)
  }
}

/*
@Module
object IntReaderModule {

  @Provides
  @JvmStatic
  fun intReader(scanner: Scanner): IntReader = StdIOIntReader(scanner)

  @Provides
  @JvmStatic
  fun scanner(): Scanner = Scanner(System.`in`)
}
 */

