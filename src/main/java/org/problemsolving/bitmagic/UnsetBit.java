package org.problemsolving.bitmagic;

/**
 * 1. Left shift '1' by n i.e. 1<<n
 *
 * <p>2. Not(~) the leftShifted 1, so that nth bit is 0, so that other bits are not disturbed
 *
 * <p>3. AND(&) numeber got in 2nd step with num
 */
public class UnsetBit {

  /**
   * @param num whose nth bit is to be unset
   * @param n bit to be unset
   * @return the num with nth bit unset
   */
  public int unsetNthBit(int num, int n) {
    if (num == 0) return 0;
    int mask = (1 << n);
    // Negate mask
    mask = ~mask;
    return mask & num;
  }
}
