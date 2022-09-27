class Solution {
    public int[] shortestToChar(String s, char c) {
        int len = s.length();
        int left[] = new int[len];
        int right[] = new int[len];
        int ein = len+1;
        for(int x = 0; x < len; x++){
            if(s.charAt(x) == c)
                ein = x;
            if(ein == len+1)
                left[x] = ein;
            else
                left[x] = x-ein;
        }
        
        ein = len+1;
        for(int x = len-1; x >= 0; x--){
            if(s.charAt(x) == c)
                ein = x;
            if(ein == len+1)
                right[x] = ein;
            else
                right[x] = ein-x;
            
        }
        
        int[] ans = new int[len];
        for(int x = 0; x < len; x++)
            ans[x] = Math.min(left[x], right[x]);
        
        return ans;
    }
}