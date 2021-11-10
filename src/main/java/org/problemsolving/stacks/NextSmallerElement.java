package org.problemsolving.stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/** Problem link - https://www.geeksforgeeks.org/next-smaller-element/ */
public class NextSmallerElement {
  public List<Integer> nextSmallerElement(int[] arr, int n) {
    if (arr == null || arr.length == 0 || n < 0)
      throw new IllegalArgumentException("Check if inputs are valid and non-empty!");
    // To push processed elements
    Stack<Integer> s = new Stack<>();

    // To store the list of previous smaller elements
    List<Integer> nextSmallerList = new ArrayList<>();

    // Since right-most element won't have
    // any next smaller as it is the last one,
    // hence considering it as processed and
    // pushing to the stack
    s.push(arr[n - 1]);
    nextSmallerList.add(-1);

    // Iterating from n-1, since we've already added -1 for
    // rightmost element or 1st element from right
    for (int i = n - 2; i >= 0; i--) {
      // Keep on popping until first/nearest element < arr[i]  is encountered
      while (!s.isEmpty() && s.peek() >= arr[i]) s.pop();

      int nextSmaller = s.isEmpty() ? -1 : s.peek();
      nextSmallerList.add(nextSmaller);

      // Pushed the ith processed item to stack
      s.push(arr[i]);
    }
    Collections.reverse(nextSmallerList);
    return nextSmallerList;
  }
}
