package org.problemsolving.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckAnagramTest {
  CheckAnagram checkAnagram = new CheckAnagram();

  @Test
  void naiveCheckAnagram() {
    assertFalse(checkAnagram.efficientAnagramCheckHashmap("abcde", "dcba"));
    assertFalse(checkAnagram.efficientAnagramCheckHashmap("accd", "dcca"));
    assertTrue(checkAnagram.efficientAnagramCheckHashmap("medical", "decimal"));
    assertTrue(checkAnagram.efficientAnagramCheckHashmap("arms", "mars"));
  }

  @Test
  void anotherNaiveCheckAnagram() {
    assertFalse(checkAnagram.naiveAnagramCheck("abcde", "dcba"));
    assertFalse(checkAnagram.naiveAnagramCheck("abcd", "dcca"));
    assertTrue(checkAnagram.naiveAnagramCheck("medical", "decimal"));
    assertTrue(checkAnagram.naiveAnagramCheck("arms", "mars"));
  }

  @Test
  void efficientCheckAnagramArray() {
    assertFalse(checkAnagram.efficientCheckAnagramArray("abcde", "dcba"));
    assertFalse(checkAnagram.efficientCheckAnagramArray("abcd", "dcca"));
    assertTrue(checkAnagram.efficientCheckAnagramArray("medical", "decimal"));
    assertTrue(checkAnagram.efficientCheckAnagramArray("arms", "mars"));
  }
}
