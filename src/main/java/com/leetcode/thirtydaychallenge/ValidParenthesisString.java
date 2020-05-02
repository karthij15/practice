package com.leetcode.thirtydaychallenge;

import java.util.Stack;

/*
Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid. We define the validity of a string by these rules:

Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
An empty string is also valid.
Example 1:
Input: "()"
Output: True
Example 2:
Input: "(*)"
Output: True
Example 3:
Input: "(*))"
Output: True
Note:
The string size will be in the range [1, 100].
*/

//store indexes in stack

class ValidParenthesisString {
    public boolean solution(String s) {
        Stack<Integer> openBracesStack = new Stack<>();//TODO: Replace the synchronized class "Stack" by an unsynchronized one such as "Deque
        Stack<Integer> starStack = new Stack<>();

        int i = 0;

        while(i < s.length()) {

            if(s.charAt(i) == '(') 
                openBracesStack.push(i);
            else if(s.charAt(i) == '*') 
                starStack.push(i);
            else { //for ')'

                if(!openBracesStack.isEmpty())
                    openBracesStack.pop();
                else if(!starStack.isEmpty()) 
                    starStack.pop();
                else 
                    return false;
            }
            
            i++;
        }
        
        while(!openBracesStack.isEmpty()) {
            if(starStack.isEmpty() || openBracesStack.pop() > starStack.pop())
                return false;
        }
       
        return openBracesStack.isEmpty();
    }
}
