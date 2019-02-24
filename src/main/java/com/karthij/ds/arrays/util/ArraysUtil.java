package com.karthij.ds.arrays.util;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUtil
{
    public static int[] getIntegerArrayFromUser()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array elments seperated by comma");
        int[] arr = Arrays.asList(s.next().split(",")).stream().mapToInt(Integer::parseInt).toArray();
        s.close();
        return arr;
    }
}
