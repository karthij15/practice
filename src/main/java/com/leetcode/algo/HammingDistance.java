package com.leetcode.algo;

/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
*/

//Based on: https://medium.com/@vojtastavik/hamming-distance-programming-interview-problem-i-b2b3322a268f

class HammingDistance {
    public int hammingDistance(int x, int y) {
        
        int d = x ^ y;
        int hd = 0;
        
        while(d > 0) {
            if((d & 1) != 0)
                hd++;
            d = d >> 1;
        }
       
        return hd;
        
    }
}
