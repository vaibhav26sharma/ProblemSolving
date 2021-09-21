package org.problemsolving.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
  private final Factorial factorial = new Factorial();

  @Test
  void fact() {
    assertEquals(120, factorial.fact(5));
    assertEquals(0, factorial.fact(-1));
  }
}
