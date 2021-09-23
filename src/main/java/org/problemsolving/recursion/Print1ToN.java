package org.problemsolving.recursion;

/**
 * Problem link -
 * https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1/?track=SPC-Recursion&batchId=140#
 */
public class Print1ToN {

  public void printNos(int N) {
    if (N > 0) {
      printNos(N - 1);
      System.out.print(N + " ");
    }
  }
}
