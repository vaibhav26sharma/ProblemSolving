package org.problemsolving.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Problem link -
 * https://www.geeksforgeeks.org/find-the-nearest-smaller-numbers-on-left-side-in-an-array/
 */
public class PreviousSmallerElement {
  public List<Integer> prevSmallerElement(int[] arr, int n) {
    if (arr == null || arr.length == 0 || n < 0)
      throw new IllegalArgumentException("Check if inputs are valid and non-empty!");
    // To push processed elements
    Stack<Integer> s = new Stack<>();

    // To store the list of previous smaller elements
    List<Integer> prevSmallerList = new ArrayList<>();

    // Considering leftmost element as processed,
    // since it has no element prior to it
    s.push(arr[0]);

    // Previous greater for first element is -1
    // prevSmallerList.add(-1);

    // Find previousGreater for every element from left
    for (int i = 0; i < n; i++) {
      // Pop all elements greater than i-th,
      // since we are looking for previous greater
      while (!s.isEmpty() && s.peek() >= arr[i]) s.pop();

      int prevSmaller = s.isEmpty() ? -1 : s.peek();
      prevSmallerList.add(prevSmaller);
      s.push(arr[i]);
    }
    return prevSmallerList;
  }
}
