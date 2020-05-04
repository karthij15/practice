package com.leetcode.thirtydaychallenge;

/*
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
*/

class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        /*
        for(int i = 0; i < ransomNote.length(); i++) {
            String c = String.valueOf(ransomNote.charAt(i));
            
            if(magazine.indexOf(c) == -1)//if(!magazine.contains(c))//String contains method internally calls indexOf only. 
                return false;
            else
                magazine = magazine.replaceFirst(c, "");
        }
        
        return true;
        */
        int[] mArr = new int[26];
        
        for(char c : magazine.toCharArray())
            mArr[c - 'a']++;
        
        for(char c : ransomNote.toCharArray()) {
            if(mArr[c - 'a'] == 0)
                return false;
            else
                mArr[c - 'a']--;
        }
        
        return true;
    }
}
