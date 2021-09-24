package org.problemsolving.recursion;

/**
 * This is an optimized approach for taylor series where the number of multiplications is reduced to
 * almost O(n) by reducing the series to form 1+x/1[1+x/2[1+x/3[1+x/4]]]]
 */
public class TaylorSeriesHornersRule {
  double s;

  public double e(int x, int n) {
    if (n == 0) return s; // For first term in series
    s = 1 + x * s / n;
    return e(x, n - 1);
  }
}
