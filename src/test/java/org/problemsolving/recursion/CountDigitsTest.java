package org.problemsolving.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDigitsTest {
  private final CountDigits countDigits = new CountDigits();

  @Test
  void countDigits() {
    assertEquals(3, countDigits.countDigits(253));
  }
}
