class Solution {
    public int longestContinuousSubstring(String s) {
        int count = 1;
        int result = 0;
        for(int x = 1; x < s.length(); x++){
            if(s.charAt(x) == s.charAt(x-1)+1)
                count++;
            else{
                result = Math.max(count,result);
                count = 1;
            }
        }
        
        return result>count ? result:count;
    }
}