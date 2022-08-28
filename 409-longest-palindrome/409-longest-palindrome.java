class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray()){
            count[c]++;
        }

        int ans = 0;
        for (int value: count) {
            ans += (value / 2) * 2;
        }
        //if all chars aren't even you can just add 1 at the end
        //if they were all even ans and s.length would be the same
        if( ans < s.length() ) ans++;
        return ans;
    }
}