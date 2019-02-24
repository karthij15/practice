package com.karthij.ds.arrays;

import java.util.Scanner;

import com.karthij.ds.arrays.util.ArraysUtil;

public class MissingNumber
{
    public MissingNumber()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int arrSize = s.nextInt();
        int[] arr = ArraysUtil.getIntegerArrayFromUser();

        int missingNums =  arrSize - arr.length;

        if(missingNums == 1)
            /*useMath(arr, arrSize);
        else*/
            useXOR(arr, arrSize);

        s.close();
    }

    public void useMath(int[] arr, int arrSize)
    {
        int totArrSum = 0;
        for(int i : arr)
        {
            totArrSum += i;
        }
        int expectedSum = (arrSize * (arrSize + 1))/2;
        System.out.println("Missing Number is: " + (expectedSum - totArrSum));
    }

    public void useXOR(int[] arr, int arrSize)
    {
        int i; 
        int x1 = arr[0]; /* For xor of all the elements in array */
        int x2 = 1; /* For xor of all the elements from 1 to n+1 */
          
        for (i = 1; i< arr.length; i++)
        {
            System.out.println(" x1 " + x1);
            x1 = x1^arr[i]; 
            System.out.println(" arr[i] " + arr[i] + " : x1 " + x1);
        }
        for ( i = 2; i <= arrSize; i++)
        {
            System.out.println(" x2 " + x2);
            x2 = x2^i;
            System.out.println(" i " + i + " : x2 " + x2);
        }

        System.out.println("Missing Number (xor1) [" + x1 + "] (xor2) [" + x2 + "]  is: " + (x1 ^ x2));
    }
}
