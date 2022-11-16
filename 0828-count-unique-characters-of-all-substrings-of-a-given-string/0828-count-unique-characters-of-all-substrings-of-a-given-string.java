class Solution {
    public int uniqueLetterString(String s) {
        int[][] temp = new int[26][2];
        
        for(int x = 0; x < 26; x++)
            Arrays.fill(temp[x], -1);
        
        int ans = 0;
        for(int x = 0; x < s.length(); x++){
            int ch = s.charAt(x) - 'A';
            
            ans += (x - temp[ch][1])*(temp[ch][1] - temp[ch][0]);
            temp[ch][0] = temp[ch][1];
            temp[ch][1] = x;
        }
        
        int n = s.length();
        for(int x = 0; x < 26; x++){
            ans += (n - temp[x][1]) * (temp[x][1] - temp[x][0]);
        }
        
        return ans;
    }
}