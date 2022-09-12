class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if(tokens.length == 1)
            return power >= tokens[0] ? 1 : 0;
        Arrays.sort(tokens);
        int score = 0;
        int i = 0;
        int j = tokens.length-1;
        while( i <= j ){
            if(power >= tokens[i] ){
                score++;
                power -= tokens[i];
                i++;
            }
            else if(score>0 && ( power + tokens[j] ) >= tokens[i] && i<j-1){
                score--;
                power += tokens[j];
                j--;
            }
            else
                break;
        }
        return score;
    }
}