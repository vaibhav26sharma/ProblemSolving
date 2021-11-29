package org.problemsolving.stacks;

import java.util.Stack;

public class PrefixEvaluation {
  public double evaluatePrefixEfficient(String expression) {
    if (expression == null || expression.length() == 0)
      throw new IllegalArgumentException("Pass a valid string");
    Stack<Double> stack = new Stack<Double>();

    for (int j = expression.length() - 1; j >= 0; j--) {

      // if jth character is the delimiter ( which is
      // space in this case) then skip it
      if (expression.charAt(j) == ' ') continue;

      // Push operand to Stack
      // To convert expression[j] to digit subtract
      // '0' from expression[j].
      else if (Character.isDigit(expression.charAt(j))) {

        // there may be more than
        // one digit in a number
        double num = 0, i = j;
        while (j < expression.length() && Character.isDigit(expression.charAt(j))) {
          j--;
        }
        j++;

        // from [j, i] expression contains a number
        for (int k = j; k <= i; k++) {
          num = num * 10 + (double) (expression.charAt(k) - '0');
        }

        stack.push(num);
      } else {

        // Operator encountered
        // Pop two elements from Stack
        double o1 = (double) stack.peek();
        stack.pop();
        double o2 = (double) stack.peek();
        stack.pop();

        // Use switch case to operate on o1
        // and o2 and perform o1 O o2.
        switch (expression.charAt(j)) {
          case '+':
            stack.push(o1 + o2);
            break;
          case '-':
            stack.push(o1 - o2);
            break;
          case '*':
            stack.push(o1 * o2);
            break;
          case '/':
            stack.push(o1 / o2);
            break;
        }
      }
    }

    return stack.peek();
  }
}
