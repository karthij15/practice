package com.leetcode.algo;

import java.util.ArrayList;
import java.util.List;

/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I
*/

class ZigZagConversion {
    public String convert(String s, int numRows) {
        
        List<StringBuffer> list = new ArrayList<>();

        for(int n1 = 0; n1 < numRows; n1++) {
            list.add(new StringBuffer());
        }


        int i = 0;
        int r = 0;
        boolean drop = false;
        
        if(numRows == 1) {
            return s;
        }

        while( i < s.length()) {

            if(r == 0 || r == (numRows-1)) {
                drop = !drop;
            }
            list.get(r).append(s.charAt(i));
            if(drop) {
               r++;
            } else {
                r--;
            }

            i++;
        }

        StringBuffer toRet = new StringBuffer();

        for(StringBuffer s1 : list) {
            toRet.append(s1);
        }


        return toRet.toString();
        
    }
}
