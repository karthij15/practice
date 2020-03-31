class ReverseInteger {
    public int reverse(int x) {

        boolean isUnSigned = (x >= 0);
        x = (isUnSigned ? x : (x*-1));

        int out = 0;
        while(x > 0) {
            out = (out * 10) + (x%10);
            
            if(out > Integer.MAX_VALUE/10 && (x/10 > 0)) {
                return 0;
            }
            x/= 10;
        }
        
        
        if(!isUnSigned)
            out *= -1;
        
        return out;
    }
}
