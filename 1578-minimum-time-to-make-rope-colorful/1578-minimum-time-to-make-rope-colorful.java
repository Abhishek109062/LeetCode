class Solution {
    public int minCost(String s, int[] n) {
        int ans = 0;
        for(int x = 0; x < n.length-1; x++){
            if(s.charAt(x) == s.charAt(x+1)){
                if(n[x] < n[x+1])
                    ans += n[x];
                else{
                    ans += n[x+1];
                    n[x+1] = n[x];
                }
            }
        }
        return ans;
    }
}