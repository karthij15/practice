package com.leetcode.algo;

/*

We are given two strings, A and B.

A shift on A consists of taking string A and moving the leftmost character to the rightmost position. For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. Return True if and only if A can become B after some number of shifts on A.

Example 1:
Input: A = 'abcde', B = 'cdeab'
Output: true

Example 2:
Input: A = 'abcde', B = 'abced'
Output: false
Note:

A and B will have length at most 100

*/

class RotateString {

    public boolean solution(String A, String B) {
        
        return isContains(A, B);
        /*
        if(A.length() != B.length())
            return false;
        
        boolean isRotate = false;
        int i = 0;
        while(!isRotate && i <= A.length()) {
            A = shift(A);
            System.out.println(i + " : " + A );
            isRotate = B.equals(A);
            i++;
        }
        
        return isRotate;
        */
    }
    
    public boolean isContains(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }
    
    public String shift(String s) {
        return s.length() > 0 ? s.substring(1, s.length()) + s.charAt(0) : s;
    }
}
