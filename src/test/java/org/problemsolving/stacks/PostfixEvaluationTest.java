package org.problemsolving.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostfixEvaluationTest {
  private final PostfixEvaluation postfixEvaluation = new PostfixEvaluation();

  @Test
  void evaluatePostfix() {
    assertEquals(757, postfixEvaluation.evaluatePostfix("100 200 + 2 / 5 * 7 +"));
  }
}
