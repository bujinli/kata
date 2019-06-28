package com.example.test.kata.twosum;

import java.util.HashMap;
import java.util.Map;

class Solution {

  private Map<Integer, Integer> cache = new HashMap<>();

  public int[] twoSum(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {

      if (cache.get(target - nums[i]) != null) {
        return new int[]{i, cache.get(target - nums[i])};
      } else {
        cache.put(nums[i], i);
      }

    }

    return null;
  }
}