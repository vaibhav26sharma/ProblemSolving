package org.problemsolving.bitmagic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PowerSetTest {
  private final PowerSet powerSet = new PowerSet();
  private int[] set;
  private List<List<Integer>> expectedOutput;
  private List<Integer> subset1;
  private List<Integer> subset2;
  private List<Integer> subset3;
  private List<Integer> subset4;

  @BeforeEach
  void setUp() {
    set = new int[] {1, 2};
    expectedOutput = new ArrayList<>();
    subset1 = new ArrayList<>();
    subset2 = new ArrayList<>();
    subset3 = new ArrayList<>();
    subset4 = new ArrayList<>();

    subset2.add(1);
    subset3.add(2);
    subset4.add(1);
    subset4.add(2);
    expectedOutput.add(subset1);
    expectedOutput.add(subset2);
    expectedOutput.add(subset3);
    expectedOutput.add(subset4);
  }

  @Test
  void generate() {
    assertEquals(expectedOutput, powerSet.generate(set));
  }
}
