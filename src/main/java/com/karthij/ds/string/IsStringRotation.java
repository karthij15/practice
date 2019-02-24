package com.karthij.ds.string;

import com.karthij.ds.string.util.StringUtil;

public class IsStringRotation
{
    public IsStringRotation()
    {
        String input = StringUtil.getInputString();
        System.out.println("Enter rotation of the String ");
        String rotation = StringUtil.getInputString();
        checkIsRotation(input, rotation);
    }

    public void checkIsRotation(String input, String rotation)
    {
        String concat = input.concat(input);
        System.out.println("Validation " + (concat.indexOf(rotation) != -1));
    }
}
