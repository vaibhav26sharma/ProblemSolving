package org.problemsolving.bitmagic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckKthBitTest {
  private final CheckKthBit checkBit = new CheckKthBit();

  @Test
  void isSet() {
    assertTrue(checkBit.isSet(5, 0));
    assertFalse(checkBit.isSet(5, 1));
    assertTrue(checkBit.isSet(5, 2));
  }
}
