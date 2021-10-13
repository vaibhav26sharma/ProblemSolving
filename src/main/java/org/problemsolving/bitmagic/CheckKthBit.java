package org.problemsolving.bitmagic;

import org.problemsolving.utils.BaseConversion;

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

    // if o/p at Nth bit is 1 then bit is set, else not set
    if ((num & mask) > 0) return true;
    else return false;
  }
}
