class ZigZagConversion {
    public String convert(String s, int numRows) {
        
        List<StringBuffer> list = new ArrayList<>();

        for(int n1 = 0; n1 < numRows; n1++) {
            list.add(new StringBuffer());
        }


        int i = 0;
        int r = 0;
        boolean drop = false;
        
        if(numRows == 1) {
            return s;
        }

        while( i < s.length()) {

            if(r == 0 || r == (numRows-1)) {
                drop = !drop;
            }
            list.get(r).append(s.charAt(i));
            if(drop) {
               r++;
            } else {
                r--;
            }

            i++;
        }

        StringBuffer toRet = new StringBuffer();

        for(StringBuffer s1 : list) {
            toRet.append(s1);
        }


        return toRet.toString();
        
    }
}
