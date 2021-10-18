package org.problemsolving.bitmagic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitDifferenceTest {
  private final BitDifference bitDifference = new BitDifference();

  @Test
  void countBitsDiff() {
    assertEquals(1, bitDifference.countBitsDiff(0, 1));
    assertEquals(2, bitDifference.countBitsDiff(4, 7));
  }
}
