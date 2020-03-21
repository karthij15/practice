package com.leetcode.algo;

import java.util.HashSet;

/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

 */
public class LongestSubstringWithoutRepeatingCharacters {
  // apply sliding window algorithm
  int lengthOfLongestSubstring(String s) {

    HashSet<Character> set = new HashSet<>();

    int temp = 0;
    int max = 0;

    int j = 0;
    int i = 0;
    while (i < s.length()) {
      if (!set.contains(s.charAt(i))) {
        set.add(s.charAt(i));
        temp++;
        max = Math.max(temp, max);
        i++;
      } else {
        temp = 0;
        j++;
        i = j;
        set = new HashSet<>();
      }
    }

    return max;

  }
}
