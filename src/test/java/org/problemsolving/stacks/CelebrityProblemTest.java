package org.problemsolving.stacks;

import jdk.jfr.BooleanFlag;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CelebrityProblemTest {
  private final CelebrityProblem celebrityProblem = new CelebrityProblem();
  private int[][] grid;
  private int n;

  @BeforeEach
  public void setup() {
    grid = new int[][] {{0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 1, 0}};
    n = 4;
  }

  @Test
  void testFindCelebrity() {
    assertEquals(2, celebrityProblem.findCelebrity(grid, n));
  }
}
