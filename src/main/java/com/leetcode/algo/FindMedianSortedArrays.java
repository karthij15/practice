package com.leetcode.algo;

/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5

 */
public class FindMedianSortedArrays {
  public double findMedianSortedArrays(int[] num1, int[] num2) {

    int len = num1.length + num2.length;

    boolean isEven = len % 2 == 0;
    int l = len / 2 + 1; //for median half-way is enough
    int[] c = new int[l];

    int i = 0; //num1 pointer
    int j = 0; // num2 pointer
    int k = 0; // merged array pointer
    while (i < num1.length || j < num2.length) {

      int a = i < num1.length ? num1[i] : Integer.MAX_VALUE;
      int b = j < num2.length ? num2[j] : Integer.MAX_VALUE;

      if (a < b) {
        c[k] = a;
        i++;
      } else {
        c[k] = b;
        j++;
      }

      k++;

      if (k == c.length)
        break;
    }

    return isEven ? (c[l - 1] + c[l - 2]) / 2.0 : c[l - 1];

  }
}
