package org.problemsolving.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

  private final Fibonacci fibonacci = new Fibonacci();

  @Test
  void fibonacciIterative() {
    assertEquals(5, fibonacci.fibonacciIterative(5));
  }

  @Test
  void fibonacciRecursive() {
    assertEquals(0, fibonacci.fibonacciRecursive(0));
  }
}
