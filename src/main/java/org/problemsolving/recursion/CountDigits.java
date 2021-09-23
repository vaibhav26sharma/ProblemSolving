package org.problemsolving.recursion;

/**
 * Problem link -
 * https://practice.geeksforgeeks.org/problems/count-total-digits-in-a-number/0/?track=SPC-Recursion&batchId=140
 */
public class CountDigits {
  public int count = 0;

  public int countDigits(int n) {
    if (n == 0) return 1;
    else {
      countDigits(n / 10);
      count++;
    }
    return count;
  }
}
