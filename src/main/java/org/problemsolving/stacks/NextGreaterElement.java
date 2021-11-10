package org.problemsolving.stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NextGreaterElement {
  public List<Integer> efficientNextGreater(int[] arr, int n) {
    if (arr == null || arr.length == 0 || n < 0)
      throw new IllegalArgumentException("Check if inputs are valid and non-empty!");

    Stack<Integer> s = new Stack<>();
    List<Integer> nextGreaterList = new ArrayList<>();
    // Since right-most element won't have
    // any next greater as it is the last one,
    // hence considering it as processed and
    // pushing to the stack
    s.push(arr[n - 1]);
    // adding -1 since last element doesn't
    // have a next greater
    nextGreaterList.add(-1);

    // Iterating from n-1, since we've already added -1 for
    // rightmost element or 1st element from right
    for (int i = n - 2; i >= 0; i--) {
      // Keep on popping until an element > arr[i] is encountered
      while (!s.isEmpty() && s.peek() <= arr[i]) {
        s.pop();
      }
      int nextGreater = s.isEmpty() ? -1 : s.peek();
      nextGreaterList.add(nextGreater);
      // Pushed the ith processed item to stack
      s.push(arr[i]);
    }
    Collections.reverse(nextGreaterList);
    return nextGreaterList;
  }
}
