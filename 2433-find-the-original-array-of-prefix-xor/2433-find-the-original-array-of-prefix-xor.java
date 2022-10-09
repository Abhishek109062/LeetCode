class Solution {
    public int[] findArray(int[] pref) {
        int len = pref.length;
        int[] ans = new int[len];
        
        for(int x = len-1; x >= 1; x--){
            ans[x] = pref[x] ^ pref[x-1];
        }
        ans[0] = pref[0];
        return ans;
    }
}