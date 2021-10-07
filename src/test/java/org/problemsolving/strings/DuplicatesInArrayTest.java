package org.problemsolving.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesInArrayTest {
  private final DuplicatesInArray duplicatesInArray = new DuplicatesInArray();
  private int[] arr;

  @BeforeEach
  void setup() {
    arr = new int[] {1, 2, 3, 4, 2, 1, 5, 7, 8, 9, 30, 12, 13, 1, 0, 12};
  }

  @Test
  void duplicates() {
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(1);
    expected.add(2);
    expected.add(12);
    assertEquals(expected, duplicatesInArray.duplicates(arr));

    arr = new int[] {1, 2, 3, 4};
    expected = new ArrayList<>();
    expected.add(-1);
    assertEquals(expected, duplicatesInArray.duplicates(arr));
  }
}
