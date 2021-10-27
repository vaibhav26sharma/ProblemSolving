package org.problemsolving.bitmagic;

/**
 * In a non-empty array of integer numbers, every element appears twice except for one. Find the
 * single one
 *
 * <p>Since x^x =0, we XOR all the nos in array, the pairs will cancel out each other and we will be
 * left with the single one
 */
public class SingleNumber {
  public int findSingle(int[] nums) {
    int xor = nums[0];
    for (int i = 1; i < nums.length; i++) {
      xor ^= nums[i];
    }
    return xor;
  }
}
