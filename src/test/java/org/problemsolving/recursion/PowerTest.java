package org.problemsolving.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerTest {
  Power power = new Power();

  @Test
  void pow() {
    assertEquals(387420489, power.pow(9, 9));
    assertEquals(1, power.pow(2, 0));
  }
}
