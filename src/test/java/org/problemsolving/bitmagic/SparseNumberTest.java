package org.problemsolving.bitmagic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SparseNumberTest {
  private final SparseNumber sparseNumber = new SparseNumber();

  @Test
  void isSparse() {
    assertTrue(sparseNumber.isSparse(4));
    assertTrue(sparseNumber.isSparse(1));
    assertFalse(sparseNumber.isSparse(3));
  }
}
