package org.jetbrains.demo.kotlinfractals

import org.jetbrains.demo.kotlinfractals.Color


actual class Color()

private val white = Color()
private val black = Color()

actual fun Colors.hsl(h: Double,
                      s: Double,
                      l: Double) = white

actual val Colors.BLACK
  get() = black

val Colors.WHITE
  get() = white

