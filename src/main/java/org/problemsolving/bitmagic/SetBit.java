package org.problemsolving.bitmagic;

/*
 * Setting a bit means turning it to 1 from 0.
 *
 * <p>1. Left Shift 1(001) by n bits (n- num whose bit is to be set)
 *
 * <p>2. Do Bitwise OR -> Shifted 1 | num
 * */
public class SetBit {
  /**
   * @param num whose nth bit to be set
   * @param n is the bit which is to be set
   * @return returns num with nth bit set
   */
  public int setNthBit(int num, int n) {

    // Left shift '1' by n bits, so that the bit corresponding to n in '1' is set
    int mask = 1 << n;
    // OR(|) num and leftShiftedOne, since ORring with 1 will give 1 in o/p always
    return mask | num;

    // To get binary representation of processed num, uncomment below
    // BaseConversion.decToBinary(setBitResult);
  }
}
