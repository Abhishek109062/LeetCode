class Solution {
    public String convert(String s, int numRows) {
         if (numRows == 1 || numRows >= s.length()) {return s;}
        
        StringBuilder res = new StringBuilder();
        int jump = 2*numRows - 2;
        int length = s.length();
        
        // i is the index of each row
        for (int i = 0; i < numRows; i++){
            for (int j = 0; i + j < length; j += jump) {
                res.append(s.charAt(i + j));
                if (i != 0 && i != numRows - 1 && i + j + jump - 2*i < length) {
                    res.append(s.charAt(i+j+jump-2*i));
                }
            }
            
        }
        return res.toString();
    }
}