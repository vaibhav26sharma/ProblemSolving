package org.problemsolving.recursion;

// fact(n) = 1 * 2 * 3 * 4 *...... * (n-1) * n
// fact(n) = fact(n-1) * n when n >0 & fact(1) when n =0
public class Factorial {
  public int fact(int n) {
    if (n < 0) return 0;
    if (n == 0) return 1;
    return fact(n - 1) * n;
  }
}
