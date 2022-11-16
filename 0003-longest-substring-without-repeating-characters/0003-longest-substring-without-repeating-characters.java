class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] ch = new char[300];
        
        int max = 0;
        int count = 0;
        int y = 0;
        for(int x = 0; x < s.length(); x++){
            ch[s.charAt(x)]++;
            count++;
            while(y <= x && ch[s.charAt(x)] > 1){
                ch[s.charAt(y++)]--;
                count--;
                
            }
            
            max = Math.max(max, count);
        }
        return max;
    }
}