package com.karthij.main;

import java.util.Scanner;

public class CodeRunner
{
    public static void main(String[] args) throws ClassNotFoundException,
                                                    InstantiationException, 
                                                    IllegalAccessException
    {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the class name: ");
        String className = /*scannerObj.nextLine();*/ "com.karthij.ds.bts.service.BTSPreOrder";

        Class.forName(className).newInstance();
        scannerObj.close();
    }
}
