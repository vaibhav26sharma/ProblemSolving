package org.problemsolving.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementTest {
  private final NextGreaterElement nextGreaterElement = new NextGreaterElement();
  private int[] arr;
  private List<Integer> resultList;

  @BeforeEach
  void setUp() {
    arr = new int[] {18, 12, 13, 14, 11, 20};
    resultList = new ArrayList<>();
    resultList.add(20);
    resultList.add(13);
    resultList.add(14);
    resultList.add(20);
    resultList.add(20);
    resultList.add(-1);
  }

  @Test
  void efficientNextGreater() {
    assertEquals(resultList, nextGreaterElement.efficientNextGreater(arr, arr.length));
  }
}
