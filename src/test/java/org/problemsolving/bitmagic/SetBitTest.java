package org.problemsolving.bitmagic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SetBitTest {
  private final SetBit setBit = new SetBit();

  @Test
  void setNthBit() {
    Assertions.assertEquals(7, setBit.setNthBit(5, 1));
    Assertions.assertEquals(1, setBit.setNthBit(0, 0));
    Assertions.assertEquals(2, setBit.setNthBit(0, 1));
  }
}
