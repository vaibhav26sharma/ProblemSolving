package org.problemsolving.bitmagic;

/**
 * Find total count of set bits for all number from 1 to N(both inclusive)
 *
 * <p>Input: N = 4 Output: 5 Explanation:
 *
 * <p>For numbers from 1 to 4.
 *
 * <p>For 1: 0 0 1 = 1 set bits
 *
 * <p>For 2: 0 1 0 = 1 set bits
 *
 * <p>For 3: 0 1 1 = 2 set bits
 *
 * <p>For 4: 1 0 0 = 1 set bits Therefore, the total set bits is 5.
 *
 * <p>Step1 -> Find maximum power of 2 less than n. Let that power be x. Eg say n=11 , max power of
 * 2<11 is3 i.e. 2^3=8
 *
 * <p>Step2 -> Find total set bits from 0 to (2^x)-1 => x *2^(x-1)
 *
 * <p>Step3-> Find total set bits on Rightmost bit of each number from 2^x to n => (n-(2^x) +1)
 *
 * <p>Step4-> Now count total set bits in remaining bits of numbers from 2^x to n => solve
 * recursively for(n-2^x)
 *
 * <p>Total bits = (x*2^(x-1)) + (n-2^x+1) + solveRecursively(n-2^x)
 */
public class TotalSetBits {
  public int countTotalSetBits(int n) {
    if (n <= 0) return 0;
    // Max power of 2 less than n
    int x = findMaxPowerOf2(n);
    int bitsTill2PowerX = x * (1 << (x - 1)); // Here 1<<(x-1) means 2^(x-1)
    int msb2PowerXtoN = n - (1 << x) + 1; // (1<<x) represents 2^x
    int remaining = n - (1 << x); // (1<<x) represents 2^x
    return (bitsTill2PowerX + msb2PowerXtoN + countTotalSetBits(remaining));
  }

  private int findMaxPowerOf2(int n) {
    int power = 0;
    while ((1 << power) <= n) {
      power++;
    }
    return power - 1;
  }
}
