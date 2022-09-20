class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int x = 0; x < s.length(); x++){
            count += countpal(s,x,x);
            count += countpal(s,x,x+1);
        }
        return count;
    }
    
    public int countpal(String s,int left, int right){
        int count = 0;
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
}