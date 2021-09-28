package org.problemsolving.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinbonacciMemoizationTest {
  private final FinbonacciMemoization finbonacciMemoization = new FinbonacciMemoization();

  @Test
  void fibMemoization() {
    assertEquals(5, finbonacciMemoization.fibMemoization(5));
    assertEquals(0, finbonacciMemoization.fibMemoization(0));
  }
}
