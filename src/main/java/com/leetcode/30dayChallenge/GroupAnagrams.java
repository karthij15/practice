/*
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s : strs) {
            String charKey = getCharLen(s);

            List<String> sList = map.containsKey(charKey) ? map.get(charKey) : new ArrayList<String>();
            sList.add(s);
            map.put(charKey, sList);
        }

        return new ArrayList<>(map.values());
    }
    
    public String getCharLen(String s) {

        char[] ch = new char[26];
        for(char c : s.toCharArray()) {
            ch[c - 'a']++;
        }
        return new String(ch);
        /*
        String ret = "";
        int k = 0;
        for(int j : ch) {
            if(j != 0) {
                char o = (char)(k + 'a');
                ret += j + "" + o;
            }
            k++;
        }

        return ret;*/
    }
}
