class Solution {
    public String orderlyQueue(String S, int K) {
        if(K > 1){
            char[] ch = S.toCharArray();
            Arrays.sort(ch);
            return new String(ch);
        }
        
        String ans = S;
        
        for(int x = 0; x < S.length(); x++){
            if(ans.compareTo(S.substring(x) + S.substring(0,x)) > 0)
                ans = S.substring(x) + S.substring(0,x);
        }
        
        return ans;
    }
}