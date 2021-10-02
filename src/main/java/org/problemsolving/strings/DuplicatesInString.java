package org.problemsolving.strings;

import java.util.HashMap;
import java.util.Map;

/** Problem link - https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/ */
public class DuplicatesInString {

  public void printDuplicates(String s) {
    // Map will contain character as a key, and no of times it appears in string as value
    HashMap<Character, Integer> countMap = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      // if key doesn't exist add it with a value of 1
      if (!countMap.containsKey(s.charAt(i))) {
        countMap.put(s.charAt(i), 1);
      }
      // if key exists in map, increase its count by 1
      else {
        countMap.put(s.charAt(i), countMap.get(s.charAt(i)) + 1);
      }
    }

    // In map, whichever key has value > 1, will have duplicates
    for (Map.Entry mapElement : countMap.entrySet()) {
      char key = (char) mapElement.getKey();
      int value = (int) mapElement.getValue();
      if (value > 1) {
        System.out.println(key + ",count= " + value);
      }
    }
  }
}
