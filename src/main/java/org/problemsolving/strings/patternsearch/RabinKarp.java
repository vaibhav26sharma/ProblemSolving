package org.problemsolving.strings.patternsearch;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem link - https://www.geeksforgeeks.org/rabin-karp-algorithm-for-pattern-searching/
 * https://www.programiz.com/dsa/rabin-karp-algorithm
 */
public class RabinKarp {
  public List<Integer> rabinKarp(String text, String pattern) {
    List<Integer> occurrences = new ArrayList<>();
    if (text == null || text.isEmpty() || pattern == null || pattern.isEmpty()) return occurrences;
    // length of input set. 256 represents total characters in ASCIO
    final int d = 256;
    // large prime number for modulus to reduce collisions
    final int q = 257;
    // length of pattern
    int m = pattern.length();
    // length of text
    int n = text.length();
    // Hash value of Pattern
    int p = 0;
    // Hash value of text string
    int t = 0;
    // Exponential expression: h = d^(m-1)
    int h = 1;

    // Calculate the value of exponential term h = d^(m-1)
    for (int i = 0; i < m - 1; i++) {
      h = (h * d) % q;
    }

    for (int i = 0; i < m; i++) {
      // Hash for pattern using Horner's law
      p = (p * d + pattern.charAt(i)) % q;
      // Hash for 1st window of size m using Horner's law
      t = (t * d + text.charAt(i)) % q;
    }

    // Move window one character at a time
    for (int i = 0; i <= n - m; i++) {
      // if hash of pattern and window is equal,
      // do character matching
      if (p == t) {
        int j;
        // Compare character by character
        for (j = 0; j < m; j++) {
          if (text.charAt(i + j) != pattern.charAt(j)) {
            break;
          }
        }
        // if j reached end of pattern string,
        // it means that pattern is found at index i
        if (j == m) {
          occurrences.add(i);
        }
      }
      // if hashes of pattern and window aren't equal
      // calculate hash of next window
      if (i < n - m) {
        // Subtract 1st char in last window and
        // add last char in new window
        t = (d * (t - text.charAt(i) * h) + text.charAt(i + m)) % q;

        // if hash for next window is negative
        if (t < 0) t += q;
      }
    }
    return occurrences;
  }
}
