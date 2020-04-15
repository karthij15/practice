package com.leetcode.thirtydaychallenge;

/*
You are given a string s containing lowercase English letters, and a matrix shift, where shift[i] = [direction, amount]:

direction can be 0 (for left shift) or 1 (for right shift). 
amount is the amount by which string s is to be shifted.
A left shift by 1 means remove the first character of s and append it to the end.
Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.
Return the final string after all operations.

 

Example 1:

Input: s = "abc", shift = [[0,1],[1,2]]
Output: "cab"
Explanation: 
[0,1] means shift to left by 1. "abc" -> "bca"
[1,2] means shift to right by 2. "bca" -> "cab"
Example 2:

Input: s = "abcdefg", shift = [[1,1],[1,1],[0,2],[1,3]]
Output: "efgabcd"
Explanation:  
[1,1] means shift to right by 1. "abcdefg" -> "gabcdef"
[1,1] means shift to right by 1. "gabcdef" -> "fgabcde"
[0,2] means shift to left by 2. "fgabcde" -> "abcdefg"
[1,3] means shift to right by 3. "abcdefg" -> "efgabcd"
 

Constraints:

1 <= s.length <= 100
s only contains lower case English letters.
1 <= shift.length <= 100
shift[i].length == 2
0 <= shift[i][0] <= 1
0 <= shift[i][1] <= 100
*/

class PerformStringShifts {
    public String solution(String s, int[][] shift) {
        
        int sh = 0;
        
     /*
        for (int i = 0; i < shift.length; i++) {
            if(shift[i][0] == 0)
                sh -= shift[i][1];
            else
                sh += shift[i][1];
        }
        */
        int[] shiftArr = new int[2];
        
        for (int i = 0; i < shift.length; i++) {
            shiftArr[shift[i][0]] += shift[i][1];
        }
        
        sh = shiftArr[1] - shiftArr[0];
        boolean isLS = sh < 0;
        
        if(isLS)
            sh *= -1;
        
        for(int i = 0; i < sh; i++) {
            s = isLS ? doLeftShift(s) : doRightShift(s);
        }
        
        return s;
    }
    
    public String doLeftShift(String s) {
        return s.substring(1, s.length()) + s.charAt(0);
    }
    
    public String doRightShift(String s) {
        return s.charAt(s.length() - 1 ) + s.substring(0, s.length() -1);
    }
}
