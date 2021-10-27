package org.problemsolving.bitmagic;

/**
 * Check if kth bit is set or not
 *
 * <p>1. Left shift 1 by k i.e. 1<<n
 *
 * <p>2. AND(&) i.e. num & leftShiftedOne so that if nth bit in num is 1 then output will be 1 else
 * 0
 *
 * <p>AND gives 1 only if both are 1
 */
public class CheckKthBit {
  public boolean isSet(int num, int k) {
    // Variable for shifting
    int mask = 1 << k;

    // Negate the shift
    mask = ~mask; // so that all other bits but kth become 1

    // if o/p of OR is All 1's , that mean Kth bit is set since 1 | 0 = 1
    return (mask | num) == ~0; // ~0 mean all bits set to 1 i.e. 111
  }
}
