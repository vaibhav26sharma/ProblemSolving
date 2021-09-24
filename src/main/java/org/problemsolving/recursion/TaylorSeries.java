package org.problemsolving.recursion;

/**
 * Problem link - https://www.geeksforgeeks.org/program-to-calculate-ex-by-recursion/
 *
 * <p>e^x = 1 + x/1!+ x^2/2! + x^3/3! + ...... + until n terms
 */
// O(n2) multiplications
public class TaylorSeries {

  double P = 1; // Power i.e.Numerator
  double F = 1; // Factorial i.e. Denominator

  public double e(int x, int n) {

    double r; // To store the result

    if (n == 0) return 1; // First term in series
    else {
      r = e(x, n - 1);
      P = P * x; // As power of x increase by 1 in each term
      F = F * n; // As factorial need to move further in each term
      return r + P / F; // 1+X/1!
    }
  }
}
