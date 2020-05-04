package com.leetcode.thirtydaychallenge;

/*
Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
 
Example 1:

Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
 

Example 2:

Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 

Note:

The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.
This question is the same as 1009: https://leetcode.com/problems/complement-of-base-10-integer/
*/

class NumberComplement {
    public int solution(int num) {
        
        //Trick is to find the immediate number having all 1's and substract it from the number to find its complemet
        //For 5 - 101, complement 010 - addition is 111 (7) - 7 - 5 = 2 is the expected answer.
        
        int completeOnes = 0;
        int i = 0;
        while(completeOnes < num) {
            completeOnes += getPowerOf2(i);
            i++;
        }
        
        System.out.println("One's: " + completeOnes);
        
        return completeOnes - num;
        /*
        Queue<Integer> bQ = new LinkedList<>();
        
        while(num > 0) {
            bQ.add(num%2);
            num /= 2;
        }
        
        int complement = 0;
        int pow = 0;

        while(!bQ.isEmpty()) {
            complement += (bQ.poll() ^ 1) * getPowerOf2(pow);
            pow++;
        }
        
        return complement;
        */
    }
    
    private int getPowerOf2(int pow) {
        int powTwo = 1;
        
        int i = 0;
        while(i < pow) {
            powTwo *= 2;
            i++;
        }

        return powTwo;
    }
}
