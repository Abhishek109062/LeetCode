class Solution {
    public int characterReplacement(String s, int k) {
        int count[] = new int[26];
        
        int y = 0;
        int ans = 0;
        int maxc = 0;
        for(int x = 0; x < s.length(); x++){
            maxc = Math.max(maxc, ++count[s.charAt(x) - 'A']);
            
            while(x - y + 1 - maxc > k){
                count[s.charAt(y) - 'A']--;
                y++;
            }
            
            ans = Math.max(ans, x - y + 1);
        }
        
        return ans;
    }
}