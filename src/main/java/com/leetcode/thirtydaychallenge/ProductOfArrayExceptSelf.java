package com.leetcode.thirtydaychallenge;

/*
Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.

Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

*/

/*
The trick is to construct the arrays (in the case for 4 elements)

{              1,         a[0],    a[0]*a[1],    a[0]*a[1]*a[2],  }
{ a[1]*a[2]*a[3],    a[2]*a[3],         a[3],                 1,  }
Both of which can be done in O(n) by starting at the left and right edges respectively.

Then multiplying the two arrays element by element gives the required result
*/
//https://stackoverflow.com/questions/2680548/given-an-array-of-numbers-return-array-of-products-of-all-other-numbers-no-div?page=1&tab=votes#tab-top

class ProductOfArrayExceptSelf {
    public int[] solution(int[] nums) {
        
        
        //int[] nums = new int[]{2, 3, 4, 5};
        int[] out = new int[nums.length];

  // Get the products below the current index
        int p=1;
        for(int i=0;i<nums.length;++i) {
            out[i]=p;
            p*=nums[i];
        }
        System.out.println("============ 1");
        for(int k : out) {
            System.out.print(k + " ");
        }

        System.out.println();
// Get the products above the curent index

        p=1;
        for(int i=nums.length-1;i>=0;--i) {
            System.out.println();
            out[i]*=p;
            p*=nums[i];
        }

        System.out.println("============ 2");
        for(int k : out) {
            System.out.println(k + " ");
        }
        
        return out;
    }
}
