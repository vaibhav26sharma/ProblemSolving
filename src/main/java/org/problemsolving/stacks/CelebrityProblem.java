package org.problemsolving.stacks;

import java.util.Stack;

/**
 * Problem link -https://www.geeksforgeeks.org/the-celebrity-problem/
 *
 * <p>A person can be a celebrity only if:
 *
 * <p>He knows nobody i.e. all his cells are 0
 *
 * <p>and everybody knows i.e. its cell for all other persons is 1
 */
public class CelebrityProblem {
  /**
   * @param arr is the matrix of N*N
   * @param N is the number of people in the party
   * @return index of celebrity, if exists, -1 otherwise
   */
  public int findCelebrity(int[][] arr, int N) {
    Stack<Integer> s = new Stack<>();

    // Push everybody to stack
    for (int i = 0; i < N; i++) {
      s.push(i);
    }

    // As long as there are more than or equal to 2 items
    // in stack, keep on popping 2 and compare if they know each other
    while (s.size() > 1) {
      int a = s.pop();
      int b = s.pop();

      // If a knows b, a can't be a celebrity, but b might be,
      // hence eliminate it and push b back
      if (arr[a][b] == 1) {
        s.push(b);
      }
      // if a doesn't know b, then b can't b a celebrity, since all should know a celebrity,
      // hence eliminate b and push a back to stack
      else {
        s.push(a);
      }
    }

    // If stack is empty then there can be no celebrity
    if (s.isEmpty()) return -1;

    // pop the only left element is stack to check if it is a celebrity
    // by confirming that n-1 people knows him
    // and number of people he knows is 0
    int c = s.pop();

    for (int i = 0; i > N; i++) {
      if (i != c) {
        // if any [i][c] is 0 i.e. any person doesn't know c,
        // or any [c][i] is 1 i.e. if c knows any other person,
        // c cannot be a  celebrity, return -1
        if (arr[i][c] == 0 || arr[c][i] == 1) {
          return -1;
        }
      }
    }
    return c;
  }
}
