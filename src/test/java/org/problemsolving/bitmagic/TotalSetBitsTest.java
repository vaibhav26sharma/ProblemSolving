package org.problemsolving.bitmagic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalSetBitsTest {
  private final TotalSetBits totalSetBits = new TotalSetBits();

  @Test
  void countTotalSetBits() {
    assertEquals(35, totalSetBits.countTotalSetBits(17));
  }
}
