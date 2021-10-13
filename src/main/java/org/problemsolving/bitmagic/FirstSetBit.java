package org.problemsolving.bitmagic;

/**
 * Returns the index of first set bit in a binary number Eg: in 10110, first set bit from right is
 * 2nd
 *
 * <p>1. Take a mask with initial value 1 and left shift it after each iteration
 *
 * <p>2. Do AND(&) of num and 1 in each iteration. AND will yield zero as long as we are
 * encountering zero (from right) in num
 *
 * <p>3. If 1 is the O/P, it mean that bit is set and is our answer
 */
public class FirstSetBit {
  public int getFirstSetBit(int num) {
    if (num == 0) return 0;

    // Variable for left Shifting
    int mask = 1;

    int position = 1;

    while ((num & mask) == 0) {
      position++;
      // Left shift mask by 1
      mask = mask << 1;
    }
    return position;
  }
}
