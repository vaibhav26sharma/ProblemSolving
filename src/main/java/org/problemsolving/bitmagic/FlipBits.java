package org.problemsolving.bitmagic;

/**
 * Flips all the bits in a binary no
 *
 * <p>1.Take a Value with all bits as 1
 *
 * <p>2.Flipped number = Num - Value
 *
 * <p>OR X^1s = ~X i.e. 0110 ^ 1111 = 1001
 *
 * <p>Considering number of 3 bits only
 */
public class FlipBits {
  /**
   * @param num is a binary number
   * @return binary representation of flipped num
   */
  public String flipAllBits(String num) {
    // 7->111
    String value = "111";
    return Integer.toString(Integer.parseInt(num) ^ Integer.parseInt(value));
  }
}
