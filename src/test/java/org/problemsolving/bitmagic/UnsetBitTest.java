package org.problemsolving.bitmagic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnsetNthBitTest {
  private final UnsetBit unsetNthBit = new UnsetBit();

  @Test
  void unsetNthBit() {
    assertEquals(0, unsetNthBit.unsetNthBit(0, 2));
    assertEquals(4, unsetNthBit.unsetNthBit(5, 0));
    assertEquals(5, unsetNthBit.unsetNthBit(5, 1));
  }
}
