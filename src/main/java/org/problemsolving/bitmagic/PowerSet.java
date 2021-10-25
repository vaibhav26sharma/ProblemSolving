package org.problemsolving.bitmagic;

import java.util.ArrayList;
import java.util.List;

/**
 * A set of all subsets of a set is called as power set, including empty set and itself
 *
 * <p>A set of length n can have 2^n subsets
 *
 * <p>Each bit in a binary expression represents existence of an element if 1, non-existence if 0
 *
 * <p>For {a,b,c}
 *
 * <p>Leftmost bit represents 'a', center represents 'b'and rightmost represents 'c'
 *
 * <p>000-> {} 001-> {c} 010->{b} 011->{bc} 100->{a} 101->{ac} 110->{ab} 111->{abc}
 */
public class PowerSet {
  public List<List<Integer>> generate(int[] S) {
    // List to store the output
    List<List<Integer>> powerSet = new ArrayList<>();
    if (S == null || S.length == 0) return powerSet;
    // Length of array or no of bits
    int n = S.length;
    // Possible subsets -> 2^n or 1<<n
    int count = 1 << n;

    // Outer loop to iterate through each subsets
    // of 2^n total subsets
    for (int i = 0; i < count; i++) {
      List<Integer> currentSubset = new ArrayList<>();
      // Inner loop to iterate through each bit in current subset
      // to check if it is set or not. If bit is set, add corresponding
      // element to current subset
      // i.e. 011 means b and c will be in current subset
      for (int j = 0; j < n; j++) {
        // To check if a bit is set, leftshift 1 till that bit
        // AND Shifted 1 and num, if output is non zero that means bit is set,since 1&1 = 1
        if ((i & (1 << j)) != 0) {
          currentSubset.add(S[j]);
        }
      }
      // Add current subset to the power set
      powerSet.add(currentSubset);
    }
    return powerSet;
  }
}
