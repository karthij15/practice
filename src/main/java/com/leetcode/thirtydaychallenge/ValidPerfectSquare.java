package com.leetcode.thirtydaychallenge;

/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Output: true
Example 2:

Input: 14
Output: false
*/

class ValidPerfectSquare {
    public boolean isPerfectSquare(int n) {
        
        return calculatorMethod(n);
        
        //return newtonMethod(n);

        /*
        //Basic Checks
        int lastDigit = n%10;

        if(lastDigit == 2 ||
          lastDigit == 3 ||
          lastDigit == 7 ||
          lastDigit == 8)
            return false;

        int digitalRoot = findDigitalRoot(n);
        
        if(!(digitalRoot == 1 ||
          digitalRoot == 4 ||
          digitalRoot == 7 ||
          digitalRoot == 9))
            return false;
        
        //Apply
        //1 + 3 + 5 + 7 + 9 + 
        //1-->4-->9-->16->25--

        int i = 1;

        while (n > 0) {
            n -= i;
            i += 2;
        }

        return n == 0;
        */
    }
    
    boolean calculatorMethod(int num) {
        int low = 1, high = num;
        
        while (low <= high) {
            long mid = (low + high) >>> 1; //To find the middle element

            if (mid * mid == num) 
                return true;
            else if (mid * mid < num)
                low = (int) mid + 1;
            else
                high = (int) mid - 1;
        }

        return false;
    }
    
    boolean newtonMethod(int num) {
        long x = num;
        
        while (x * x > num) {
            x = (x + num / x) >> 1;
        }

        return x * x == num;
    }
    
    int findDigitalRoot(int n) {
        
        int d = 0;
        
        while(n > 0) {
            d += n%10;
            n /= 10;
        }
        
        return d > 9 ? findDigitalRoot(d) : d;
    }
}
