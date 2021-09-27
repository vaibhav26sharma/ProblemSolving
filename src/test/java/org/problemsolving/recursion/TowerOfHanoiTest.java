package org.problemsolving.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TowerOfHanoiTest {
  private final TowerOfHanoi towerOfHanoi = new TowerOfHanoi();

  @Test
  void TOH() {
    towerOfHanoi.TOH(3, 1, 2, 3);
  }
}
