package moduledagger

import javax.inject.Inject

/**
 * Application which uses a Calculator and an IntReader in order to read
 * two integer from the standard input and make the sum
 */
class Application @Inject constructor(
  private val calculator: Calculator,
  private val intReader: IntReader
) {

  fun execute() {
    val first = intReader.read()
    val second = intReader.read()
    val result = calculator.sum(first, second)
    println("$first + $second = $result")
  }
}
