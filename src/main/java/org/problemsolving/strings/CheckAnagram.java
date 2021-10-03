package org.problemsolving.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Problem link - https://practice.geeksforgeeks.org/problems/anagram-1587115620/1 */
public class CheckAnagram {

  public boolean naiveAnagramCheck(String s1, String s2) {
    if (s1.length() != s2.length()) return false;
    char a[] = s1.toCharArray();
    char b[] = s2.toCharArray();

    Arrays.sort(a);
    Arrays.sort(b);

    String ss1 = new String(a);

    String ss2 = new String(b);

    return ss1.equals(ss2);
  }

  /**
   * This is a naive procedure[O(n)]:
   *
   * <p>- Add each character in one of the strings to hashmap as key and its count as value.
   *
   * <p>- For another string check if the chars exist in the map as a key for each char and keep
   * reducing the count by 1
   *
   * <p>- if in map all keys have count 0 at the end they are anagrams else not
   *
   * @return
   */
  public boolean efficientAnagramCheckHashmap(String s1, String s2) {

    if (s1.length() != s2.length()) return false;

    HashMap<Character, Integer> countMap = new HashMap<>();

    // O(n)
    for (int i = 0; i < s1.length(); i++) {
      // if key for ith char isn't in the map,
      // add it and make its count as 1
      if (!countMap.containsKey(s1.charAt(i))) {
        countMap.put(s1.charAt(i), 1);
      } else {
        // else increase the count by 1
        countMap.put(s1.charAt(i), countMap.get(s1.charAt(i)) + 1);
      }
    }

    // Now for second string s2, check for all its characters in map
    // and reduce count in map for each key found
    // O(n)
    for (int i = 0; i < s2.length(); i++) {
      if (countMap.containsKey(s2.charAt(i))) {
        countMap.put(s2.charAt(i), countMap.get(s2.charAt(i)) - 1);
      } else {
        // It should stop and return false if even one char isn't found in map,
        // since anagrams needs to have all same characters and in same frequency
        return false;
      }
    }
    // Filtering map to find entries with value greater than 0, if any
    // if anagrams, all entries should have value as 0
    return (countMap.entrySet().stream()
            .filter(entry -> entry.getValue() > 0)
            .map(Map.Entry::getKey)
            .count())
        == 0;
  }

  // ASCII supports 256 characters
  static final int CHAR = 256;
  // O(n)
  public boolean efficientCheckAnagramArray(String s1, String s2) {
    if (s1.length() != s2.length()) return false;
    int count[] = new int[CHAR];
    for (int i = 0; i < s1.length(); i++) {
      // Index in array will be the ascii value of char
      count[s1.charAt(i)]++;
      // Decrease for the char in s2 by 1, so that count for elements
      // existing in both remains 0
      count[s2.charAt(i)]--;
    }

    for (int i = 0; i < CHAR; i++) {
      if (count[i] != 0) return false;
    }
    return true;
  }
}
