class Solution {
    public String getHint(String secret, String guess) {
        int cows = 0, bulls = 0;
        int ar1[] = new int[10];
        for(int x = 0; x < secret.length(); x++){
            int a1 = (int)(secret.charAt(x) - '0');
            int a2 = (int)(guess.charAt(x) - '0');
            
            if(a1 == a2)
                bulls++;
            else{
                if(ar1[a1] < 0)
                    cows++;
                if( ar1[a2] > 0)
                    cows++;
                ar1[a1]++;
                ar1[a2]--;
            }
        }
        return bulls + "A" + cows + "B";
    }
}