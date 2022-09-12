class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        Arrays.sort(tokens);
        int res=0;
        
        int l=0, r=tokens.length-1,score=0;
        
        while(l<=r){
            if(power<tokens[l]){
                if(score>0){
                    power+=tokens[r--];
                    score--;
                }else{
                    return res;
                }
            }else{
                power-=tokens[l++];
                score++;
                res = Math.max(score,res);
            }
        }
        
        return res;
    }
}