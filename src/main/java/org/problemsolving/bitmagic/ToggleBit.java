package org.problemsolving.bitmagic;

/**
 * 1. Left shift '1' by n i.e. 1<<n 2. XOR(^) i.e. num ^ leftShiftedOne, so that if bit is 0 it
 * becomes one and vice versa
 *
 * <p>XOR returns 1 only if both bits are different
 */
public class ToggleBit {
  public int toggleNthBit(int num, int n) {
    int leftShiftedOne = 1 << n;
    return num ^ leftShiftedOne;
  }
}
