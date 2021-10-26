package org.problemsolving.bitmagic;

/**
 * In the binary representation of any number which is a power of 2, we have only MSB set, and all
 * remaining bits are 0
 *
 * <p>2 -> 10 ; 4 -> 100 ; 8 -> 1000 ; 16 -> 10000
 *
 * <p>for all numbers which are 1 less than a number which is power of 2, all bits are 1
 *
 * <p>1 -> 1 3 -> 11 7 -> 111 15 -> 1111
 *
 * <p>So, n(power of 2) and n-1 both have all diff bits. Hence, If we AND n and n-1, then we will
 * get 0 for all powers of two.
 */
public class PowerOf2 {
  public boolean isPowerOfTwo(long num) {
    if (num <= 0) return false;

    return (num & (num - 1)) == 0;
  }
}
