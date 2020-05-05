package com.leetcode.thirtydaychallenge;

/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
*/

class FirstUniqueCharacterInAString {
    public int solution(String s) {
      
        int idx = Integer.MAX_VALUE;
        
        for(char c = 'a'; c <= 'z'; c++) {
            int cIdx = s.indexOf(c);
            
            if(cIdx != -1 && cIdx == s.lastIndexOf(c))
                idx = Math.min(cIdx, idx);
        }
        
        return idx == Integer.MAX_VALUE ? -1 : idx;

        /*
        char[] arr = s.toCharArray(); //instead of s.chartAt it will be optimal
        int[] cArr = new int[26];
        
        for(int i = 0; i < arr.length; i++)
            cArr[arr[i] - 'a']++;
        
        for(int i = 0; i < arr.length; i++) {
            if(cArr[arr[i] - 'a'] == 1)
                return i;
        }
        
        return -1;
        */
        
        /*
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean isFound = true;

            for(int j = 0; j < s.length(); j++) {
                if(c == s.charAt(j) && i != j) {
                    isFound = false;
                    break;
                }
            }
            
            if(isFound)
                return i;
        }
        
        return -1;
        */
    }
}
