class Solution {
    public long appealSum(String s) {
        int[] count = new int[26];
        long ans = 0;
        for(int x = 0; x < s.length(); x++){
            count[s.charAt(x) - 'a'] = x+1;
            
            for(int y = 0; y < 26; y++)
                ans += count[y];
        }
        
        return ans;
    }
}