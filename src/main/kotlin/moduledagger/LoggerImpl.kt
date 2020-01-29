package moduledagger

import javax.inject.Inject

class LoggerImpl @Inject constructor() : Logger {
  override fun log(msg: String) {
    println("${System.currentTimeMillis()} - $msg")
  }
}