class Solution {
    public int longestPalindrome(String[] words) {
        int len = words.length;
        int same = 0;
        int pairs = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for(int x = 0; x < len; x++)
        {
            String rev = new StringBuilder(words[x]).reverse().toString();
            if(map.getOrDefault(rev, 0) > 0){
                pairs++;
                map.put(rev, map.get(rev) - 1);
                same -= rev.charAt(0) == rev.charAt(1) ? 1 : 0;
            }
            else{
                map.put(words[x], map.getOrDefault(words[x] , 0) + 1);
                same += words[x].charAt(0) == words[x].charAt(1) ? 1 : 0;
            }
        }
        
        int ans = 4*pairs + (same > 0 ? 2 : 0);
        return ans;
    }
}