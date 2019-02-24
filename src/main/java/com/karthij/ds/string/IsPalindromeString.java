package com.karthij.ds.string;

import com.karthij.ds.string.util.StringUtil;

public class IsPalindromeString
{
    public IsPalindromeString()
    {
        String input = StringUtil.getInputString();
        System.out.println("Is valid palindrome string : " + input.equals(reverse(input)));
    }
    public String reverse(String input)
    {
        if(input.isEmpty())
            return input;
        return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
    }
}
