class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int i = 0, j = 0;
        int ans = 0;
        for(int x = 0; x < Math.max(g.length, s.length); x++){
            if(i >= g.length)
                break;
            if(j < s.length && g[i] <= s[j]){
                ans++;
                i++;
                j++;
                
            }
            else{
                j++;
            }
                
        }
        return ans;
    }
}