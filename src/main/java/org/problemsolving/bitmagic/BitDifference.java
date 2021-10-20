package org.problemsolving.bitmagic;

/**
 * Given two numbers A and B, count the number of bits needed to be flipped to convert A to B
 *
 * <p>1. XOR A and B so that output has 1s where bits in A and B are different
 *
 * <p>2. In XOR Output count the number of 1s to find no of diff bits in A and B
 */
public class BitDifference {
  public int countBitsDiff(int a, int b) {
    int xor = a ^ b;

    // Count no of set bits in xor, which will be same as diff bits in a and b
    return new CountSetBits().countSetBits(xor);
  }
}
