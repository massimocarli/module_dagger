package moduledagger

import javax.inject.Inject

/**
 * This is a simple calculator which adds 2 integers
 */
class CalculatorImpl @Inject constructor() : Calculator {
  /**
   * Adds two integers
   */
  override fun sum(a: Int, b: Int) = a + b
}
