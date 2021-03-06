package org.problemsolving.strings;

/**
 * Problem link -
 * https://www.geeksforgeeks.org/given-two-strings-find-first-string-subsequence-second/
 */
public class CheckSubsequence {
  // int i, j = 0;

  public boolean iterativeCheckSubsequence(String s, String subsequence) {
    return iterativeCheckSubsequence(s, subsequence, s.length(), subsequence.length());
  }

  /**
   * -Make two pointers i and j. -Both pointing at beginning of string and subsequence string
   * respectively -if the values at pointers match, increase both by 1, else only increase i by 1
   *
   * @param s
   * @param subsequence
   * @param n, length of String s
   * @param m, length of String subsequence
   * @return true if is subsequence, false otherwise
   */
  private boolean iterativeCheckSubsequence(String s, String subsequence, int n, int m) {
    int j = 0;

    for (int i = 0; i < n && j < m; i++) {
      if (s.charAt(i) == subsequence.charAt(j)) {
        j++;
      }
    }
    // if j pointer reached last char of subsequence, then it is matched
    return j == m;
  }

  public boolean recursiveCheckSubsequence(String s, String subsequence) {
    return recursiveCheckSubsequence(s, subsequence, s.length(), subsequence.length());
  }

  private boolean recursiveCheckSubsequence(String s, String subsequence, int n, int m) {
    // if m reaches to first element of subsequence then it exists
    if (m == 0) return true;
    // if n reaches to first element of string s, then subsequence doesn't exist
    if (n == 0) return false;

    // Start comparing from last elements and keep on decreasing indices
    if (s.charAt(n - 1) == subsequence.charAt(m - 1)) {
      return recursiveCheckSubsequence(s, subsequence, n - 1, m - 1);
    }
    // Increase i only, if unequal
    else {
      return recursiveCheckSubsequence(s, subsequence, n - 1, m);
    }
  }
}
