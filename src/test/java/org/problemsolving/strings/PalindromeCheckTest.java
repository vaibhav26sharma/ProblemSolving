package org.problemsolving.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckTest {
  PalindromeCheck palindromeCheck = new PalindromeCheck();

  @Test
  void naivePalindromeCheck() {
    assertFalse(palindromeCheck.naivePalindromeCheck("ABBCA"));
    assertTrue(palindromeCheck.naivePalindromeCheck("ACBCA"));
  }

  @Test
  void efficientPalindromeCheck() {
    assertFalse(palindromeCheck.naivePalindromeCheck("AABCA"));
    assertTrue(palindromeCheck.naivePalindromeCheck("AACBCAA"));
  }
}
