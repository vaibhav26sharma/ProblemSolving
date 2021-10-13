package org.problemsolving.bitmagic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstSetBitTest {
  private final FirstSetBit firstSetBit = new FirstSetBit();

  @Test
  void getFirstSetBit() {
    // 2nd bit from right is 1st set bit in binary rep of 22
    assertEquals(2, firstSetBit.getFirstSetBit(22));
  }
}
