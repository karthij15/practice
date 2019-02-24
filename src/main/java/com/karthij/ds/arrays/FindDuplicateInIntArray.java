package com.karthij.ds.arrays;

import com.karthij.ds.arrays.util.ArraysUtil;

public class FindDuplicateInIntArray
{
    public FindDuplicateInIntArray()
    {
        int[] arr = ArraysUtil.getIntegerArrayFromUser();
        boolean[] flagArr = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) 
        { 
            if (!flagArr[arr[i]])
                flagArr[arr[i]] = true;
            else
               System.out.println(arr[i] + " "); 
        } 
        /*
         * for (int i = 0; i < size; i++) 
        { 
            if (arr[Math.abs(arr[i])] >= 0) 
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])]; 
            else
                System.out.print(Math.abs(arr[i]) + " "); 
        }
         */
    }
}
