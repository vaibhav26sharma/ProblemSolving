package org.problemsolving.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckSubsequenceTest {
  CheckSubsequence checkSubsequence = new CheckSubsequence();

  @Test
  void iterativeCheckSubsequence() {
    assertTrue(checkSubsequence.iterativeCheckSubsequence("GEEKSFORGEEKS", "GRGES"));
    assertTrue(checkSubsequence.iterativeCheckSubsequence("KOTTAYAM", "KOTA"));
    assertFalse(checkSubsequence.iterativeCheckSubsequence("ABCDE", "AEB"));
  }

  @Test
  void recursiveCheckSubsequence() {
    assertTrue(checkSubsequence.recursiveCheckSubsequence("GEEKSFORGEEKS", "GRGES"));
    assertTrue(checkSubsequence.recursiveCheckSubsequence("KOTTAYAM", "KOTA"));
    assertFalse(checkSubsequence.recursiveCheckSubsequence("ABCDE", "AEB"));
  }
}
