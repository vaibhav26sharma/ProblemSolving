package org.problemsolving.bitmagic;

import org.junit.jupiter.api.Test;
import org.problemsolving.recursion.Power;

import static org.junit.jupiter.api.Assertions.*;

class PowerOf2Test {
  private final PowerOf2 powerOf2 = new PowerOf2();

  @Test
  void isPowerOfTwo() {
    assertTrue(powerOf2.isPowerOfTwo(4));
    assertFalse(powerOf2.isPowerOfTwo(3));
    assertFalse(powerOf2.isPowerOfTwo(6));
    assertTrue(powerOf2.isPowerOfTwo(8));
  }
}
