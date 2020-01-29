package moduledagger

import moduledagger.di.DaggerAppComponent

fun main() {
  DaggerAppComponent
    .create()
    .app()
    .execute()
}