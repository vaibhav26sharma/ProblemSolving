package org.problemsolving.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoStacksInArrayTest {
  private final TwoStacksInArray twoStacksInArray = new TwoStacksInArray(10);

  @BeforeEach
  void setUp() {
    twoStacksInArray.push1(0);
    twoStacksInArray.push2(1);
    twoStacksInArray.push1(2);
    twoStacksInArray.push1(3);
  }

  @Test
  void push1() {
    twoStacksInArray.push1(222);
    assertEquals(222, twoStacksInArray.pop1());
  }

  @Test
  void push2() {
    twoStacksInArray.push1(333);
    assertEquals(1, twoStacksInArray.pop2());
  }

  @Test
  void pop1() {
    assertEquals(3, twoStacksInArray.pop1());
  }

  @Test
  void pop2() {
    twoStacksInArray.push2(1200);
    assertEquals(1200, twoStacksInArray.pop2());
    twoStacksInArray.pop2();
    assertThrows(IndexOutOfBoundsException.class, () -> twoStacksInArray.pop2());
  }
}
