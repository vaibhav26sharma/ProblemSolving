package org.problemsolving.recursion;

/** Problem Link -https://practice.geeksforgeeks.org/problems/power-of-numbers-1587115620/ */
public class PowerOfReverse {
  public int powOfReverse(int n, int r) {
    if (n == 0) return 0;

    if (r == 0) return 1;

    return (powOfReverse(n, r - 1) * n) % (1000000007);
  }
}
