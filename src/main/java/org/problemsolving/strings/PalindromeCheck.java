package org.problemsolving.strings;

/** Problem link - https://practice.geeksforgeeks.org/problems/palindrome-string0817/1 */
public class PalindromeCheck {

  /**
   * Below is a naive way of checking if a string is palindrome: - Reverse string and store it - if
   * Reversed string== original string, then palindrome
   *
   * @return true if string is palindrome, false otherwise
   */
  public boolean naivePalindromeCheck(String s) {
    StringBuilder sb = new StringBuilder(s);
    sb.reverse();
    return s.equals(sb.toString());
  }

  /**
   * -Make two pointers, one pointing at beginning of char array of the string and other pointing at
   * the end. - Compare value at those pointers and keep moving them forward if values are equal -
   * Will run as long as begin pointer is smaller than end pointer
   *
   * @param s, string to be checked for palindrome
   * @return true if string is palindrome, false otherwise
   */
  public boolean efficientPalindromeCheck(String s) {
    int begin = 0;
    int end = s.length() - 1;

    while (begin < end) {
      if (s.charAt(begin) != s.charAt(end)) return false;
      begin++;
      end--;
    }
    return true;
  }
}
