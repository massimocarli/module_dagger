package moduledagger

import java.util.*
import javax.inject.Inject

/**
 * Application which uses a Calculator and an IntReader in order to read
 * two integer from the standard input and make the sum
 */
class OptionalApplication @Inject constructor(
  private val calculator: Calculator,
  private val intReader: IntReader
) {

  @field:Inject
  lateinit var logger: Optional<Logger>

  fun execute() {
    val first = intReader.read()
    log("First value is $first")
    val second = intReader.read()
    log("Second value is $second")
    val result = calculator.sum(first, second)
    log("Result is $result")
    println("$first + $second = $result")
  }

  private fun log(msg: String) {
    logger.map {
      it.log(msg)
    }
  }
}
