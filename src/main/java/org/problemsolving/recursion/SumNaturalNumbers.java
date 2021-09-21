package org.problemsolving.recursion;

/** This calculates sum of n natural numbers recursively */
public class SumNaturalNumbers {
  int sum = 0;

  public int sum(int n) {
    // Base case
    if (n == 0) {
      return 0;
    }
    return sum(n - 1) + n;
  }
}
