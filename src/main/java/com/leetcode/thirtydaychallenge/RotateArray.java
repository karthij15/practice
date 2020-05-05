package com.leetcode.thirtydaychallenge;

/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

Follow up:

Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?
 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:

1 <= nums.length <= 2 * 10^4
It's guaranteed that nums[i] fits in a 32 bit-signed integer.
k >= 0

*/

class RotateArray {
    public void solution(int[] nums, int k) {
        
        int[] numsClone = nums.clone();
        
        int i = 0;
        while(i < numsClone.length) {
            int idx = getIdx(i, k, nums.length);
            nums[idx] = numsClone[i];
            i++;
        }
    }
    
    public int getIdx(int i, int k, int n) {
        k %= n; //when rotation count greater than size of an array. it will skip the below while loop
        
        int idx = (i + k);
       
        /*
        while(idx >= n)
        idx -= n;
        
        return idx;
        */

        return idx >= n ? idx - n : idx;
    }
}
