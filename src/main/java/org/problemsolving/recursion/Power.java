package org.problemsolving.recursion;

/** Problem link - https://practice.geeksforgeeks.org/problems/power-using-recursion/ */
public class Power {
  public int pow(int n, int p) {
    // if power reduces to 0, return 1
    if (p == 0) return 1;
    return pow(n, p - 1) * n;
  }
}
