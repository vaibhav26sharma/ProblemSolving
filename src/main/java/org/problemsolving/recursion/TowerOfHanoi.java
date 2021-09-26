package org.problemsolving.recursion;

import java.sql.SQLOutput;

/**
 * Move all discs from Tower A to Tower C using aux tower B
 *
 * <p>Only one disc can be moved at a time
 *
 * <p>You can't put a bigger disc on a smaller one
 *
 * <p>Algorithm:
 *
 * <p>Step1 - TOH(n-1,A,C,B) => Move all small discs on top from Tower A to Tower B using C as aux,
 * recursively Step2 - Move Largest disc from Tower A to Tower C Step 3 - TOH(n-1,B,A,C) =>Now move
 * all small discs from Tower B to Tower C using A as aux, recursively
 */

// No of moves = 2^N -1;
public class TowerOfHanoi {
  /**
   * @param n - no of discs to move
   * @param A - Source Tower
   * @param B - Auxiliary Tower
   * @param C - Destination Tower
   */
  public void TOH(int n, int A, int B, int C) {
    if (n > 0) {
      TOH(n - 1, A, C, B);
      System.out.println("Move Disc" + n + " from Tower" + A + " to Tower" + C);
      TOH(n - 1, B, A, C);
    }
  }
}
