package com.barebonesScala

import org.junit.Assert
import org.junit.Test

class MathTest extends Math {
  @Test def verifyIsOdd() {
    Assert.assertTrue(isOdd(3))
  }

  @Test def verifyNotOdd() {
    Assert.assertFalse(isOdd(2))
  }
}
