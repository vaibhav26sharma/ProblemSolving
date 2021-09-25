package org.problemsolving.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationPascalsTriangleTest {
  CombinationPascalsTriangle combinationPascalsTriangle = new CombinationPascalsTriangle();

  @Test
  void combinationRecursive() {
    assertEquals(10, combinationPascalsTriangle.combinationRecursive(5, 3));
    assertEquals(1, combinationPascalsTriangle.combinationRecursive(5, 0));
    assertEquals(1, combinationPascalsTriangle.combinationRecursive(5, 5));
  }
}
