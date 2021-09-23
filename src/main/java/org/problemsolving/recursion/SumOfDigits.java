package org.problemsolving.recursion;

/**
 * Problem Link -
 * https://practice.geeksforgeeks.org/problems/sum-of-digits-of-a-number/0/?track=SPC-Recursion&batchId=140
 *
 * <p>sumOfDigits(235) -> sumOfDigits(235/10 = 25) -> sumOfDigits(25/10 = 2) -> sumOfDigits(2/10 =
 * 0) ---returns 0---> sum(2)+ (2%10) or 0 + 2 = 2 ---returns 2---> sum(25) + (25%10) or 2 + 5 =7
 * ---returns 7---> sum(253) + (253%10) OR 7 + 3 = 10
 */
public class SumOfDigits {
  public static int sumOfDigits(int n) {
    if (n == 0) return 0;
    else return sumOfDigits(n / 10) + (n % 10);
  }
}
