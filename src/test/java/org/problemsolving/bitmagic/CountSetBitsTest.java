package org.problemsolving.bitmagic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountSetBitsTest {
  private final CountSetBits countSetBits = new CountSetBits();

  @Test
  void countSetBitsTest() {
    assertEquals(75, countSetBits.countSetBits(30));
    assertEquals(1, countSetBits.countSetBits(4));
    assertEquals(3, countSetBits.countSetBits(7));
    assertEquals(0, countSetBits.countSetBits(0));
    assertEquals(0, countSetBits.countSetBits(-2));
  }
}
