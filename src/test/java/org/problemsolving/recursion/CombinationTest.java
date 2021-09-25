package org.problemsolving.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationTest {
  Combination combination = new Combination();

  @Test
  void nCr() {
    assertEquals(10, combination.nCr(5, 3));
    assertEquals(1, combination.nCr(5, 0));
    assertEquals(1, combination.nCr(5, 5));
  }
}
