class LongestPalindrome {
    public String longestPalindrome(String s) {

        int n = s.length();
        int max = 0;
        String longestPalindrome = new String();

        for(int i = 0; i < s.length(); i ++) {
            for(int j = i; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                if(temp.length() > max && isPalindrome(temp)) {
                    max = temp.length();
                    longestPalindrome = temp;
                }

            }
        }  
        
        return longestPalindrome;

    }
    
     public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() -1;
        boolean isValid = s != null && s.length() > 0 ? true : false;

        while( i <= s.length()/2 && j >= s.length()/2) {
            if(s.charAt(i) != s.charAt(j)) {
                isValid = false;
                break;
            }
            i++;
            j--;
        }

        return isValid;
    }
   
}
