package com.leetcode.algo;

/*
 * Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

  Input: 123
  Output: 321
  Example 2:
  
  Input: -123
  Output: -321
  Example 3:
  
  Input: 120
  Output: 21
  Note:
  Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [-231,  231 - 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows
 */

class ReverseInteger {
    public int reverse(int x) {

        boolean isUnSigned = (x >= 0);
        x = (isUnSigned ? x : (x*-1));

        int out = 0;
        while(x > 0) {
            out = (out * 10) + (x%10);
            
            if(out > Integer.MAX_VALUE/10 && (x/10 > 0)) {
                return 0;
            }
            x/= 10;
        }
        
        
        if(!isUnSigned)
            out *= -1;
        
        return out;
    }
}
