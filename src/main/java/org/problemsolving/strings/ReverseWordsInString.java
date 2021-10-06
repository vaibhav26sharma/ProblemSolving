package org.problemsolving.strings;

import java.util.Stack;

/** Problem link - https://www.geeksforgeeks.org/reverse-words-in-a-given-string/ */
public class ReverseWordsInString {

  /**
   * Naive Solution
   *
   * <p>- Add all the chars in string to Stack
   *
   * <p>- Since stack works in LIFO, popping the stack should return characters in reverse
   *
   * <p>- Add popped characters to string builder
   *
   * @param str, string to be reversed
   * @return the reversed string
   */
  // O(n)
  public String naiveReverseString(String str) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      stack.push(str.charAt(i));
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      sb.append(stack.pop());
    }

    return sb.toString();
  }

  public String efficientReverseString(String s) {
    // Converting returned char array to string
    return new String(efficientReverseString(s.toCharArray(), s.length()));
  }

  private char[] efficientReverseString(char[] s, int n) {
    int start = 0;

    // First reverse each word in string
    for (int end = 0; end < n; end++) {
      // if the character is a space that means a word has ended there
      // from start to that specific end index, so reverse that word
      if (s[end] == ' ') {
        reverse(s, start, end - 1);
        // Update starting point of next word,
        // considering there is only one space between words
        start = end + 1;
      }
    }

    // Since last word won't have space after it, that won't be reversed in loop above,
    // hence reverse it separately
    reverse(s, start, n - 1);

    // Now reverse whole string
    reverse(s, 0, n - 1);

    return s;
  }

  // Reverse the char array, by maintaining two pointers,
  // start and end
  private void reverse(char[] s, int start, int end) {
    while (start <= end) {
      swap(s, start, end);
      start++;
      end--;
    }
  }

  // Swap two items in the array
  private void swap(char[] s, int start, int end) {
    char tmp = s[start];
    s[start] = s[end];
    s[end] = tmp;
  }
}
