package org.problemsolving.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInStringTest {
  private final ReverseWordsInString reverseString = new ReverseWordsInString();

  @Test
  void naiveReverseString() {
    assertEquals("gfg ot emoclew", reverseString.naiveReverseString("welcome to gfg"));
    assertEquals("emoclew", reverseString.naiveReverseString("welcome"));
  }

  @Test
  void efficientReverseString() {
    assertEquals("gfg to welcome", reverseString.efficientReverseString("welcome to gfg"));
    assertEquals("welcome", reverseString.efficientReverseString("welcome"));
  }
}
