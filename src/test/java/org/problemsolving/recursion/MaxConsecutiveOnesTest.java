package org.problemsolving.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesTest {
  private final MaxConsecutiveOnes max = new MaxConsecutiveOnes();

  private int[] nums;

  @BeforeEach
  public void setUp() {
    nums = new int[] {1, 1, 1, 0, 1, 1, 1, 1};
  }

  @Test
  void findMaxConsecutiveOnes() {}

  @Test
  void findMaxConsecutiveRecursive() {
    assertEquals(4, max.findMaxConsecutiveRecursive(nums));
  }
}
