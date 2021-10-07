package org.problemsolving.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DuplicatesInArray {

  public ArrayList<Integer> duplicates(int arr[]) {
    HashMap<Integer, Integer> countmap = new HashMap<>();
    ArrayList<Integer> al = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if (!countmap.containsKey(arr[i])) {
        countmap.put(arr[i], 1);
      } else {
        countmap.put(arr[i], countmap.get(arr[i]) + 1);
      }
    }

    boolean flag = false;
    for (Map.Entry mapElement : countmap.entrySet()) {
      int key = (int) mapElement.getKey();
      int value = (int) mapElement.getValue();
      if (value > 1) {
        al.add(key);
        flag = true;
      }
    }
    if (al.isEmpty()) {
      al.add(-1);
    }
    Collections.sort(al);
    return al;
  }
}
