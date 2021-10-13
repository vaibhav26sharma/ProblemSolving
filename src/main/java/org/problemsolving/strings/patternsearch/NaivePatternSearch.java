package org.problemsolving.strings.patternsearch;

import java.util.ArrayList;
import java.util.List;

/** Problem link - https://www.geeksforgeeks.org/naive-algorithm-for-pattern-searching/ */
public class NaivePatternSearch {

  public List<Integer> naivePatternSearch(String text, String pattern) {
    List<Integer> occurrences = new ArrayList<>();
    int m = pattern.length();
    int n = text.length();

    // Slide through each window
    for (int i = 0; i < n - m; i++) {
      // Reinitialize j in every window
      int j;
      for (j = 0; i < m; j++) {
        // if any character doesn't match, move to new window
        if (pattern.charAt(j) != text.charAt(i + j)) {
          break;
        }
        // if pattern index reaches at end of pattern
        // that means pattern is found,
        // hence return the index at which pattern starts
        if (j == m) {
          occurrences.add(i);
        }
      }
    }
    return occurrences;
  }
}
