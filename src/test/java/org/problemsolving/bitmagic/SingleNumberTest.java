package org.problemsolving.bitmagic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {
  private final SingleNumber singleNumber = new SingleNumber();
  int[] nums;

  @BeforeEach
  void setUp() {
    nums = new int[] {2, 4, 3, 3, 2, 4, 7, 6, 8, 6, 7};
  }

  @Test
  void findSingle() {
    assertEquals(8, singleNumber.findSingle(nums));
  }
}
