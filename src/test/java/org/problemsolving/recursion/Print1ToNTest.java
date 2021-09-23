package org.problemsolving.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Print1ToNTest {
  private static final Print1ToN print1ToN = new Print1ToN();

  @Test
  void printNos() {
    print1ToN.printNos(10);
  }
}
