class PalindromeNumber {
    public boolean isPalindrome(int x) {
        
        if(x < 0)
            return false;
        int temp = x;
        int out = 0;
        while(x > 0) {
            out = (out*10) + (x%10);
            x /= 10;
        }
        
        return temp == out;
    }
}
