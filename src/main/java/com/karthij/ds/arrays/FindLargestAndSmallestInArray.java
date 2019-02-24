package com.karthij.ds.arrays;

import com.karthij.ds.arrays.util.ArraysUtil;

public class FindLargestAndSmallestInArray
{
    public FindLargestAndSmallestInArray()
    {
        int[] arr = ArraysUtil.getIntegerArrayFromUser();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : arr)
        {
            if(i > max)
                max = i;
            if(i < min)
                min = i;
        }
        System.out.println("Smallest value  " + min + " Largest Value " + max);
    }
}
