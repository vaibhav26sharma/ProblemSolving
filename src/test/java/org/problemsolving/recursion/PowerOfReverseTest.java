package org.problemsolving.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfReverseTest {
  PowerOfReverse powerOfReverse = new PowerOfReverse();

  @Test
  void powOfReverse() {
    assertEquals(4, powerOfReverse.powOfReverse(2, 2));
    // assertEquals(10, powerOfReverse.powOfReverse(12, 21));
  }
}
