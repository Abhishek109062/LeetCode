class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int y = 0;
        int ans = 0;
        int maxc = 0;
        for(int x = 0; x < s.length(); x++){
            map.put(s.charAt(x), map.getOrDefault(s.charAt(x), 0) + 1);
            maxc = Math.max(maxc, map.get(s.charAt(x)));
            
            while(x - y + 1 - maxc > k){
                map.put(s.charAt(y), map.get(s.charAt(y)) - 1);
                y++;
            }
            
            ans = Math.max(ans, x - y + 1);
        }
        
        return ans;
    }
}