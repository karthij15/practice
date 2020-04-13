package com.leetcode.algo;

/*
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"

*/

class LongestPalindrome {
  public String solution(String s) {

    int max = 0;
    String longestPalindrome = "";

    for (int i = 0; i < s.length(); i++) {
      for (int j = i; j <= s.length(); j++) {
        String temp = s.substring(i, j);
        if (temp.length() > max && isPalindrome(temp)) {
          max = temp.length();
          longestPalindrome = temp;
        }

      }
    }

    return longestPalindrome;

  }

  public static boolean isPalindrome(String s) {
    boolean isValid = s != null && s.length() > 0;
    if (!isValid)
      return isValid;

    int i = 0;
    int j = s.length() - 1;

    while (i <= s.length() / 2 && j >= s.length() / 2) {
      if (s.charAt(i) != s.charAt(j)) {
        isValid = false;
        break;
      }
      i++;
      j--;
    }

    return isValid;
  }

}
