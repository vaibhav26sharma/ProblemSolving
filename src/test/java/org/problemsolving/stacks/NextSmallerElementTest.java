package org.problemsolving.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NextSmallerElementTest {
  private final NextSmallerElement nextSmallerElement = new NextSmallerElement();
  private int[] arr;
  private List<Integer> resultList;

  @BeforeEach
  void setUp() {
    arr = new int[] {4, 8, 5, 2, 25};
    resultList = new ArrayList<>();
    resultList.add(2);
    resultList.add(5);
    resultList.add(2);
    resultList.add(-1);
    resultList.add(-1);
  }

  @Test
  void nextSmallerElement() {
    assertEquals(resultList, nextSmallerElement.nextSmallerElement(arr, arr.length));
  }
}
