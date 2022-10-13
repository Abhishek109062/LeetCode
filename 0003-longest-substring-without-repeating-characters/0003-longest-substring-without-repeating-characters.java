class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0;
        int max = 0;
        int[] count = new int[256];
        while(r < s.length()){
            int idx = s.charAt(r);
            count[idx]++;
            
            // System.out.println(idx);
            while(count[idx] > 1){
                count[s.charAt(l)]--;
                l++;
            }
            
            max = Math.max(max, r-l+1);
            r++;
        }
        
        return max;
    }
}