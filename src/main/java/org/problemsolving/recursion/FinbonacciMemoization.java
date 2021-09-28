package org.problemsolving.recursion;

import java.util.Arrays;

/**
 * In the primitive recursive approach, time complexity is high i.e. O(2^n) Also, function is
 * re-computed with same values many times i.e. fun(3), fun(2), fun(1) are calculated multiple
 * times.
 *
 * <p>To tackle above problem, we define an array with all values as -1. If value for a specific
 * index in array is -1, then store its value to array, else fetch it from array directly instead of
 * computing again
 */
public class FinbonacciMemoization {

  public int fibMemoization(int n) {
    /* Declare an array to store Fibonacci numbers. */
    int Fib[] = new int[n + 2];

    // Fill array with -1
    Arrays.fill(Fib, -1);

    /* 0th and 1st number of the series are 0 and 1*/
    Fib[0] = 0;
    Fib[1] = 1;
    if (n <= 1) {
      Fib[n] = n;
      return n;
    } else {
      if (Fib[n - 2] == -1) Fib[n - 2] = fibMemoization(n - 2);
      if (Fib[n - 1] == -1) Fib[n - 1] = fibMemoization(n - 1);

      return Fib[n - 2] + Fib[n - 1];
    }
  }
}
