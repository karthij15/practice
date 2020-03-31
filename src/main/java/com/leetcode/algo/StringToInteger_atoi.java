class StringToInteger_atoi {
    public int myAtoi(String s) {
        
        int i = 0;
        int out = 0;

        boolean isNegative = false;
        boolean isValid = false;

        while(i < s.length()) {
            char c = s.charAt(i);

            if(out > Integer.MAX_VALUE/10 || (out == Integer.MAX_VALUE/10 && Character.getNumericValue(c) > 7) ) {
                 out = c >= 48 && c <= 57 ? (isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE) : out;
                break;
            }

            if(c >= 48 && c <= 57) {
                isValid = true;
                out = (out*10) + Character.getNumericValue(c);
            }
            else if(c == ' ' && !isValid) {
                i++;
                continue;
            }
            else if(c == '+' && !isValid) {
                isValid = true;
            }
            else if(c == '-' && !isValid) {
                isValid = true;
                isNegative = true;
            }
            else
                break;

            i++;
        }

       
        return out * (isNegative ? -1 : 1);
    }
}
