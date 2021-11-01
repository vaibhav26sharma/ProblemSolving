package org.problemsolving.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfixToPostfixTest {
  private final InfixToPostfix infixToPostfix = new InfixToPostfix();

  @Test
  void testInfixToPostfixEfficient() {
    assertEquals(
        "abcd^e-fgh*+^*+i-", infixToPostfix.infixToPostfixEfficient("a+b*(c^d-e)^(f+g*h)-i"));
    assertEquals("abc*d/+", infixToPostfix.infixToPostfixEfficient("a+b*c/d"));
  }

  @Test
  void testPrecedence() {
    assertTrue(InfixToPostfix.precedence('*') > InfixToPostfix.precedence('+'));
    assertTrue(InfixToPostfix.precedence('*') > InfixToPostfix.precedence('-'));
    assertFalse(InfixToPostfix.precedence('*') > InfixToPostfix.precedence('^'));
  }
}
