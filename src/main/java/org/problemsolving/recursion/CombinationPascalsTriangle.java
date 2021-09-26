package org.problemsolving.recursion;

/**
 * As per Pascal's Triangle: nC0 =1; nCn=1; nCr = n-1Cr-1 + n-1Cr
 *
 * <p>This is a recursive implementation for Combination
 */
public class CombinationPascalsTriangle {
  int combinationRecursive(int n, int r) {
    if (r == 0 || n == r) {
      return 1;
    } else {
      return combinationRecursive(n - 1, r - 1) + combinationRecursive(n - 1, r);
    }
  }
}
