package org.problemsolving.recursion;

/**
 * Problems statement -
 * https://practice.geeksforgeeks.org/problems/fibonacci-using-recursion/1/?track=SPC-Recursion&batchId=140
 * 0,1,1,2,3,5,8,13....
 */
public class Fibonacci {

  public int fibonacciIterative(int n) {
    // Fibonacci(nth index) = (n-1)+(n-2)
    int a = 0, b = 1, c;

    if (n == 0) return a;

    // i starts from 2, since 0th and 1st elements are fixed as
    // 0 and 1
    for (int i = 2; i <= n; i++) {
      c = a + b; // fib on nth pos = (n-1)+(n-2)
      a = b; // move 'a' ahead by one position
      b = c; // move 'b' ahead by one position
    }
    return b;
  }

  public int fibonacciRecursive(int n) {
    if (n <= 1) return n;
    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
  }
}
