package org.jetbrains.demo.kotlinfractals

import org.jetbrains.demo.complex.ComplexNumber
import kotlin.math.absoluteValue
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class GeometryTest {

  @Test
  fun test1() {
    val t = Transformation(
            Rect(0, 0, 10, 10),
            Rect(-1.0, -1.0, 1.0, 1.0)
    )

    assertEquals(-1.0, -1.0, t.toComplex(0, 0))
    assertEquals(1.0, 1.0, t.toComplex(10, 10))
    assertEquals(0.0, 0.0, t.toComplex(5, 5))

    assertEquals(0, 0, t.toPoint(-1.0, -1.0))
    assertEquals(10, 10, t.toPoint(1.0, 1.0))
    assertEquals(5, 5, t.toPoint(0.0, 0.0))
  }
}

fun assertEqualsE(expected: Double, actual: Double) {
  assertTrue("Expected = $expected, actual = $actual") {
    (actual - expected).absoluteValue < 1e-5
  }
}

fun assertEquals(re: Double, im: Double, actual: ComplexNumber) {
  assertEqualsE(re, actual.re)
  assertEqualsE(im, actual.im)
}

fun assertEquals(x: Int, y: Int, actual: Point) {
  assertEquals(x, actual.x)
  assertEquals(y, actual.y)
}
