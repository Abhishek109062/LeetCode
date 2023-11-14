class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] startIndex = new int[26];
        int[] endIndex = new int[26];
        
        Arrays.fill(startIndex, Integer.MAX_VALUE);
        
        for(int x = 0; x < s.length(); x++){
            int ch = s.charAt(x) - 97;
            
            startIndex[ch] = Math.min(startIndex[ch],x);
            endIndex[ch] = Math.max(endIndex[ch], x);
            
        }
        
        int ans = 0;
        for(int x = 0; x < 26; x++){
            if(startIndex[x] < endIndex[x]){
                String temp = s.substring(startIndex[x] + 1, endIndex[x]);
                Set<Character> tr = new HashSet<>();
                for(int y = 0; y < temp.length(); y++){
                    tr.add(temp.charAt(y));
                }
                ans += tr.size();
            }
        }
        return ans;
    }
}