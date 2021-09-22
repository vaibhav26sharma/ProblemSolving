package org.problemsolving.recursion;

/** Problem Link - https://leetcode.com/problems/max-consecutive-ones/ */
public class MaxConsecutiveOnes {

  int max, max1 = Integer.MIN_VALUE;
  int count, count1 = 0;

  // Input is a binary array
  public int findMaxConsecutiveOnes(int[] num) {
    for (int i = 0; i < num.length; i++) {
      if (num[i] == 1) {
        count++;
      } else {
        // Reset count if 0 found.
        count = 0;
      }
      max = Math.max(max, count);
    }
    return max;
  }

  public int findMaxConsecutiveRecursive(int[] nums) {
    return findMaxConsecutiveRecursive(nums, 0);
  }

  public int findMaxConsecutiveRecursive(int[] nums, int current) {
    if (current >= nums.length) {
      return 0;
    } else {
      if (nums[current] == 1) {
        count1++;
      } else {
        count1 = 0;
      }
    }
    max1 = Math.max(count1, max1);
    findMaxConsecutiveRecursive(nums, ++current);
    return max1;
  }
}
