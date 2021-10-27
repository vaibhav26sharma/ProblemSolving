package org.problemsolving.bitmagic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlipBitsTest {
  private final FlipBits flipBits = new FlipBits();

  @Test
  void flipAllBits() {
    assertEquals("111", flipBits.flipAllBits("000"));
    assertEquals("0", flipBits.flipAllBits("111"));
    assertEquals("10", flipBits.flipAllBits("101"));
  }
}
