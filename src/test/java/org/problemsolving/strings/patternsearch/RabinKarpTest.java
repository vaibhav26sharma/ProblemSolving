package org.problemsolving.strings.patternsearch;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RabinKarpTest {
  RabinKarp testRabinKarp = new RabinKarp();

  @Test
  void rabinKarp() {
    String text = "ABCCDDAEFG";
    String pattern = "CDD";
    List<Integer> expected = Collections.singletonList(3);
    assertEquals(expected, testRabinKarp.rabinKarp(text, pattern));

    text = "";
    expected = Collections.emptyList();
    assertEquals(expected, testRabinKarp.rabinKarp(text, null));
  }
}
