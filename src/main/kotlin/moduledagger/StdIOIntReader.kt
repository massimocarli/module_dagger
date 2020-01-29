package moduledagger

import java.util.*
import javax.inject.Inject

/**
 * Reads an int value from the stdin
 */
class StdIOIntReader @Inject constructor(private val scanner: Scanner) : IntReader {

  /**
   * Read an Int value
   */
  override fun read() = scanner.nextInt()
}
