package org.problemsolving.recursion;

/**
 * Problem link -
 * https://practice.geeksforgeeks.org/problems/digital-root/0/?track=SPC-Recursion&batchId=140
 */
public class DigitalRoot__REVISIT {

  public int sumOfDigits(int n) {
    if (n > 10) {
      int sum = (n % 10) + sumOfDigits(n / 10);
      if (sum >= 10) {
        return sumOfDigits(sum);
      } else {
        return sum;
      }
    } else {
      return n;
    }
  }

  public static void main(String[] args) {
    DigitalRoot__REVISIT digitalRoot = new DigitalRoot__REVISIT();
    int a = digitalRoot.sumOfDigits(2773);
    System.out.println(a);
  }
}
