class Solution {
    public int[] divisibilityArray(String word, int m) {
        long rem = 0;
        int[] ans = new int[word.length()];
        
        for(int x = 0; x < word.length(); x++){
            char ch = word.charAt(x);
            
            // sum += ch - '0';
            rem = rem*10 + (ch - '0');
            
            
            if(rem % m == 0)
                ans[x] = 1;
            
            
            rem = rem % m;
        }
        
        return ans;
    }
}