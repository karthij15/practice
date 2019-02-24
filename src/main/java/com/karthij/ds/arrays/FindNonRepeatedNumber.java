package com.karthij.ds.arrays;

import com.karthij.ds.arrays.util.ArraysUtil;

public class FindNonRepeatedNumber
{
    public FindNonRepeatedNumber()
    {
        int[] arr = ArraysUtil.getIntegerArrayFromUser();
        int x1 = 0;
        for(int i : arr)
           x1 ^= i;
        System.out.println("Non Repeated Number is : " + x1);
    }
}
