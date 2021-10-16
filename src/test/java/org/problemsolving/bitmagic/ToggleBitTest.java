package org.problemsolving.bitmagic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToggleBitTest {
  private final ToggleBit toggleBit = new ToggleBit();

  @Test
  void toggleNthBit() {
    // i.e. 101 to 100
    assertEquals(4, toggleBit.toggleNthBit(5, 0));
    // i.e. 101 to 111
    assertEquals(7, toggleBit.toggleNthBit(5, 1));
    // i.e. 101 to 001
    assertEquals(1, toggleBit.toggleNthBit(5, 2));
  }
}
