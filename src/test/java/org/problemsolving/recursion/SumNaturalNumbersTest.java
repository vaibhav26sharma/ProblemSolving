package org.problemsolving.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumNaturalNumbersTest {
  private final SumNaturalNumbers sumNaturalNumbers = new SumNaturalNumbers();

  @Test
  void sum() {
    Assertions.assertEquals(15, sumNaturalNumbers.sum(5));
  }
}
