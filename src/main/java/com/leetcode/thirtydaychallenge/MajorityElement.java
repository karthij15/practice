package com.leetcode.thirtydaychallenge;

/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
*/

class MajorityElement {
    public int solution(int[] nums) {
        //A linear time majority algorithm. AKA Boyer Moor Majority Voting Algorithm invented in 1980
        //http://www.cs.utexas.edu/~moore/best-ideas/mjrty/index.html
        //This algorithm returns expected major if it occurs more than n/2 times. Ex: 2, 3, 7, 3, 4. 
        int m = nums[0];
        int count = 0;
        
        int i = 0;
        while(i < nums.length) {
            if(m == nums[i])
                count++;
            else
                count--;
            if(count == 0) {
                m = nums[i];
                count++;
            }
            i++;
        }
        
        return m;
        
        /*
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums) {
                map.put(i, (map.getOrDefault(i, 0) + 1));
        }

        int max = Integer.MIN_VALUE;
        int key = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                key = entry.getKey();
            }
        }

        return key;
        */
    }
}
