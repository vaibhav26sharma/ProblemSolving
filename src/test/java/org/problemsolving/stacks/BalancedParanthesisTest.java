package org.problemsolving.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedParanthesisTest {
  private final BalancedParanthesis balancedParanthesis = new BalancedParanthesis();

  @Test
  void isBalanced() {
    assertTrue(balancedParanthesis.isBalanced("((()))"));
    assertTrue(balancedParanthesis.isBalanced("[()]{}{[()()]()}"));
    assertFalse(balancedParanthesis.isBalanced("[(])"));
    assertFalse(balancedParanthesis.isBalanced("[])"));
    assertFalse(balancedParanthesis.isBalanced(""));
  }
}
