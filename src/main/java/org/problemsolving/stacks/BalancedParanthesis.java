package org.problemsolving.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParanthesis {

  public boolean isBalanced(String str) {
    if (str == null || str.length() == 0) return false;

    // Deque works better than stack but has same
    // functionality
    Deque<Character> s = new ArrayDeque<>();

    for (int i = 0; i < str.length(); i++) {
      char x = str.charAt(i);
      // When encountering an opening bracket,
      // push it to stack
      if (x == '(' || x == '{' || x == '[') {
        s.push(x);
      } else {
        // if it is a closing bracket and stack is empty
        // i.e. it doesn't have corresponding opening bracket,
        // return false
        if (s.isEmpty()) return false;
        // if type of bracket in string and
        // at the top of stack doesn't match
        // For eg. one is curly other is square,
        // return false
        else if (!matching(s.peek(), x)) return false;
        else s.pop();
      }
    }
    return s.isEmpty();
  }

  /**
   * @param a Char on top of stack
   * @param b Current Char in the string
   * @return true, if both brackets are of same type, false otherwise
   */
  private boolean matching(char a, char b) {
    return ((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}'));
  }
}
