class Solution {
    public int concatenatedBinary(int n) {
        long ans = 1L;
        int mod = 1000000007;
        for(int x = 2; x <= n; x++){
            ans = ((ans << log2(x)) + x) % mod;
        }
        return (int)ans;
    }
    
    public int log2(int n){
        return (int)(Math.log10(n) / Math.log10(2) + 1);
    }
}