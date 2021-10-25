package org.problemsolving.bitmagic;

/**
 * Given two numbers m and n, find the position of the rightmost different bit in the binary
 * representation of numbers.
 *
 * <p>1. Can use XOR here, since it will be 1 only if two bits are diff
 *
 * <p>2. So, if we find the position of 1st set bit in XOR, that will be our answer
 */
public class RightmostDiffBit {
  public int posOfRightMostDiffBit(int m, int n) {
    // find XOR of both to get 1st rightmost position with a set bit
    // Since Set bit in XOR represents both numbers having diff bits
    int xor = m ^ n;
    if (xor == 0) return 0;

    // Now find the position of the rightmost set bit
    // Position of the first set bit from the right
    int position = 1;

    // Variable for shifting
    int mask = 1;
    // As we get one from AND operation it means that bit in xor is set
    while ((xor & mask) == 0) {
      position++;
      mask = mask << 1;
    }
    return position;
  }
}
