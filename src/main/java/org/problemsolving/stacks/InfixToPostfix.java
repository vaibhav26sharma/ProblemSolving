package org.problemsolving.stacks;

import java.util.Stack;

/**
 * Problem link - https://www.geeksforgeeks.org/stack-set-2-infix-to-postfix/
 *
 * <p>Algorithm:
 *
 * <ul>
 *   <li>1. Scan infix exp from L to R
 *   <li>2. If scanned characters is an operand, output it
 *   <li>3. Else:
 *       <p>- If precedence of scanned operator > precedence of operator in stack top(or stack is
 *       empty or stack contains '(' ), push scanned operator to stack
 *       <p>-Else pop all operators from stack which have greater or equal precedence than that of
 *       scanned operator. After that push scanned operator to the stack. If you encounter
 *       paranthesis while popping, stop there and push scanned operator to the stack.
 *   <li>4. If scanned character is '(', push it to the stack
 *   <li>5. If scanned character is ')', pop the stack & output untill a'(' is encountered & then
 *       discard both the parenthesis
 *   <li>6. Repeat 2-6 until infix expression is scanned fully
 *   <li>7. Print or append the ouput to a string
 *   <li>8. Pop and output from the stack until it is empty
 * </ul>
 */
public class InfixToPostfix {
  public String infixToPostfixEfficient(String expression) {
    // Initializing emtpy string to store postfix expression
    String result = new String("");

    // Initializing empty stack to handle the expression
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < expression.length(); i++) {
      char c = expression.charAt(i);

      // If the scanned character is an
      // operand, add it to output.
      if (Character.isLetterOrDigit(c)) result += c;

      // If the scanned character is an '(',
      // push it to the stack.
      else if (c == '(') stack.push(c);

      //  If the scanned character is an ')',
      // pop and output from the stack
      // until an '(' is encountered.
      else if (c == ')') {
        while (!stack.isEmpty() && stack.peek() != '(') result += stack.pop();

        // Pop corresponding '(' from stack
        stack.pop();
      }

      // If an operator is encountered
      else {

        // Keep on popping() as long as operators of higher precedence than
        // current operand are encountered on stack top
        while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
          result += stack.pop();
        }

        // Push current operator to stack now
        stack.push(c);
      }
    }

    while (!stack.isEmpty()) {
      if (stack.peek() == '(') return "Invalid Exception";
      result += stack.pop();
    }
    return result;
  }

  /**
   * @param ch is the operator whose precedence is to be calculated
   * @return the precedence of passed operator 'ch'
   */
  static int precedence(char ch) {
    switch (ch) {
      case '+':
      case '-':
        return 1;

      case '*':
      case '/':
        return 2;

      case '^':
        return 3;
    }
    return -1;
  }
}
