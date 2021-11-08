package org.problemsolving.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Problem link - https://www.geeksforgeeks.org/the-stock-span-problem/
 *
 * <p>-> All the numbers to the left of num including itself which are smaller than num and are
 * consecutive and counted and considered as span.
 *
 * <p>Eg. {13,16,12,4}
 *
 * <p>Span for 13 -> 1 (Since no number to its left is smaller, but it itself will be counted hence
 * 1)
 *
 * <p>Span for 16-> 2 (13 and 16)
 *
 * <p>Span for 12->1 (No smaller consecutive number to its left, since 1st no to its left is 16 >12)
 *
 * <p>Span for 4 ->1
 */
public class StockSpanProblem {
  /**
   * @param arr
   * @param n
   * @return span list with span of all elements
   */
  public List<Integer> naiveStockSpan(int[] arr, int n) {
    if (arr == null || arr.length == 0 || n < 0)
      throw new IllegalArgumentException("Check if inputs are valid and non-empty!");
    List<Integer> spanList = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      // Initializing span for each element
      int span = 1;
      // Loop to check span for each element
      for (int j = i - 1; j >= 0; j--) {
        if (arr[j] <= arr[i]) {
          span++;
        }
      }
      // Once inner loop is done for one element,
      // add its span to the list
      spanList.add(span);
    }
    return spanList;
  }

  public List<Integer> efficientStockSpan(int arr[], int n) {
    if (arr == null || arr.length == 0 || n < 0)
      throw new IllegalArgumentException("Check if inputs are valid and non-empty!");
    // Initializing with 1 to count itself
    List<Integer> spanList = new ArrayList<>();
    Stack<Integer> s = new Stack<>();
    // Push index of 1st item to stack
    s.push(0);
    // Span of 1st item in the array will always be 1,
    // since it is the leftmost item
    spanList.add(1);

    for (int i = 1; i < n; i++) {
      int span = 1;
      // Keep removing all items from stack
      // which are smaller or equal to present item,
      // since we only preserve items larger
      // Span of item = Index of current item - Index of closest greater element on the left
      // if item is greatest from all items to its left, then its span = Index of item+1;
      while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
        s.pop();
      }
      // Once above while condition is false
      // either stack will be empty or it will have all elements greater than current element
      span = s.isEmpty() ? i + 1 : (i - s.peek());
      spanList.add(span);
      // adding index of closest greater element on left
      s.push(i);
    }
    return spanList;
  }
}
