package org.problemsolving.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrefixEvaluationTest {
  private final PrefixEvaluation prefixEvaluation = new PrefixEvaluation();

  @Test
  void evaluatePrefixEfficient() {
    assertEquals(81, (int) prefixEvaluation.evaluatePrefixEfficient("+ 9 * 12 6"));
  }
}
