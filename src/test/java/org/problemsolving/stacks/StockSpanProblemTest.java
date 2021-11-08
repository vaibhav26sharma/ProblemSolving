package org.problemsolving.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StockSpanProblemTest {
  private final StockSpanProblem stockSpanProblem = new StockSpanProblem();
  private int[] arr;
  private List<Integer> resultList;

  @BeforeEach
  void setup() {
    arr = new int[] {18, 12, 13, 14, 11, 16};
    resultList = new ArrayList<>();
    resultList.add(1);
    resultList.add(1);
    resultList.add(2);
    resultList.add(3);
    resultList.add(1);
    resultList.add(5);
  }

  @Test
  void naiveStockSpan() {
    assertEquals(resultList, stockSpanProblem.naiveStockSpan(arr, 6));
    assertThrows(
        IllegalArgumentException.class, () -> stockSpanProblem.naiveStockSpan(new int[] {}, 5));
    assertThrows(IllegalArgumentException.class, () -> stockSpanProblem.naiveStockSpan(arr, -1));
    assertThrows(
        IllegalArgumentException.class, () -> stockSpanProblem.naiveStockSpan(new int[] {}, -2));
  }

  @Test
  void efficientStockSpan() {
    assertEquals(resultList, stockSpanProblem.efficientStockSpan(arr, 6));
    assertThrows(
        IllegalArgumentException.class, () -> stockSpanProblem.naiveStockSpan(new int[] {}, 5));
    assertThrows(IllegalArgumentException.class, () -> stockSpanProblem.naiveStockSpan(arr, -1));
    assertThrows(
        IllegalArgumentException.class, () -> stockSpanProblem.naiveStockSpan(new int[] {}, -2));
  }
}
