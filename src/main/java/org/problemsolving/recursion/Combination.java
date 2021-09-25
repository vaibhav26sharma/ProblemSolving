package org.problemsolving.recursion;

/** nCr = n!/r!(n-r)! */
public class Combination {
  int fact(int n) {
    if (n == 0) return 1;
    return fact(n - 1) * n;
  }

  int nCr(int n, int r) {
    int numerator = fact(n);
    int denominator = fact(r) * fact(n - r);
    return numerator / denominator;
  }
}
