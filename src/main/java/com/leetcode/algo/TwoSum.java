package com.leetcode.algo;

import java.util.Map;
import java.util.HashMap;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class TwoSum {
  public int[] twoSum(int[] nums, int target) {

    Map<Integer, Integer> numsMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      if (numsMap.containsKey(target - nums[i])) {
        return new int[] {numsMap.get(target - nums[i]), i};
      }
      numsMap.put(nums[i], i);
    }
    return null;

  }
}
