package org.problemsolving.stacks;

import java.util.Stack;

public class PostfixEvaluation {
  public int evaluatePostfix(String expression) {
    if (expression == null || expression.length() == 0)
      throw new IllegalArgumentException("Please pass a valid string!");

    Stack<Integer> s = new Stack<>();

    for (int i = 0; i < expression.length(); i++) {
      char c = expression.charAt(i);

      if (c == ' ') continue;

      // If the scanned character is an operand
      // (number here),extract the number
      // Push it to the stack.
      else if (Character.isDigit(c)) {
        int n = 0;

        // extract the characters since a number can be more than 1 digit and append & store in num
        while (Character.isDigit(c)) {
          n = n * 10 + (int) (c - '0');
          i++;
          c = expression.charAt(i);
        }
        i--;

        s.push(n);
      }

      // If scanned char is an operator, pop two elements
      // from stack and apply the operator
      else {
        int val1 = s.pop();
        int val2 = s.pop();

        switch (c) {
          case '+':
            s.push(val2 + val1);
            break;

          case '-':
            s.push(val2 - val1);
            break;

          case '/':
            s.push(val2 / val1);
            break;

          case '*':
            s.push(val2 * val1);
            break;
        }
      }
    }
    return s.pop();
  }
}
