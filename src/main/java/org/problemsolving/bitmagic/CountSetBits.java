package org.problemsolving.bitmagic;

/**
 * Count no of set bits in a number
 *
 * <p>Brian Kernighan's Algorithm:
 *
 * <p>Subtracting 1 from a decimal number flips all the bits after the rightmost set bit(which is 1)
 * including the rightmost bit.
 *
 * <p>for example :
 *
 * <p>10 in binary is 00001010 (1 at 2nd position frm right is rightmost set bit. moving to (n-1)
 * i.e. 9 will flip both this bit and next bit '0')
 *
 * <p>9 in binary is 00001001 (1 at 4th position frm right is rightmost set bit. moving to (n-1) *
 * i.e. 8 will flip both this bit and all bits after it)
 *
 * <p>8 in binary is 00001000
 *
 * <p>7 in binary is 00000111
 *
 * <p>Hence n& (n-1) will remove the rightmost set bit in n and keep doing this will eventually
 * bring down n to 0
 */
public class CountSetBits {
  // Brian Kernighan's Algorithm
  public int countSetBits(int n) {
    if (n <= 0) return 0;
    int count = 0;

    while (n > 0) {
      n = n & (n - 1);
      count++;
    }
    return count;
  }
}
