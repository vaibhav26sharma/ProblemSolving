package org.problemsolving.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsTest {

  @Test
  void sumOfDigits() {
    assertEquals(10, SumOfDigits.sumOfDigits(235));
    assertEquals(1, SumOfDigits.sumOfDigits(1));
  }
}
