package com.karthij.ds.string.util;

import java.util.Scanner;

public class StringUtil
{
    public static String[] getStringInputArray()
    {
        System.out.println("Enter array of characters separated by comma ");
        Scanner s = new Scanner(System.in);
        return s.nextLine().split(",");
    }

    public static String getInputString()
    {
        System.out.println("Enter input String : ");
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
}