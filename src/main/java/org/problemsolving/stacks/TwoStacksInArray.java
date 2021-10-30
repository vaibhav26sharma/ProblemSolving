package org.problemsolving.stacks;

import java.util.EmptyStackException;

/**
 * Problem link - https://www.geeksforgeeks.org/implement-two-stacks-in-an-array/
 *
 * <p>This problem aims to implement two stacks using one array i.e., both stacks should use the
 * same array for storing elements.
 *
 * <p>Following functions must be supported by twoStacks:
 *
 * <p>push1(int x) –> pushes x to first stack
 *
 * <p>push2(int x) –> pushes x to second stack
 *
 * <p>pop1() –> pops an element from first stack and return the popped element
 *
 * <p>pop2() –> pops an element from second stack and return the popped element
 */
public class TwoStacksInArray {
  /**
   * This is an efficient space solution in which, stack 1's Top will start from LHS and stack 2's
   * Top will right from RHS of the array.
   *
   * <p>They will fill in elements from Left and Right sides respectively, until the two top
   * pointers come adjacent to each other and array has no more space
   */
  int capacity;

  int top1;
  int top2;
  int[] arr;

  TwoStacksInArray(int n) {
    arr = new int[n];
    capacity = n;
    top1 = -1;
    top2 = capacity;
  }

  void push1(int x) {
    // Insert only if top1 and top2 are not at adjacent positions
    if (top1 < top2 - 1) {
      top1++;
      arr[top1] = x;
    } else {
      throw new StackOverflowError("Stack 1 is full, cannot add");
    }
  }

  void push2(int x) {
    if (top1 < top2 - 1) {
      top2--;
      arr[top2] = x;
    } else {
      throw new StackOverflowError("Stack 2 is full, cannot add");
    }
  }

  int pop1() {
    if (top1 >= 0) {
      int x = arr[top1];
      top1--;
      return x;
    } else {
      throw new IndexOutOfBoundsException("Stack is empty, cannot Pop!");
    }
  }

  int pop2() {
    if (top2 < capacity) {
      int x = arr[top2];
      top2++;
      return x;
    } else {
      throw new IndexOutOfBoundsException("Stack is empty, cannot Pop!");
    }
  }
}
