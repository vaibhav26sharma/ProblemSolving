package org.problemsolving.bitmagic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightmostDiffBitTest {
  private final RightmostDiffBit rightmostDiffBit = new RightmostDiffBit();

  @Test
  void posOfRightMostDiffBit() {
    // 001 and 010 -> 1st Bit is rightmost diff bit in these
    assertEquals(1, rightmostDiffBit.posOfRightMostDiffBit(1, 2));
    // 010 and 100 -> 2nd Bit is rightmost diff bit in these
    assertEquals(2, rightmostDiffBit.posOfRightMostDiffBit(2, 4));
  }
}
