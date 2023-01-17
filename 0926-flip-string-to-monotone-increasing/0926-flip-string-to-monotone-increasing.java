class Solution {
    // static int min = Integer.MIN_VALUE;
    public int minFlipsMonoIncr(String s) {
        int onec = 0;
        int zeroc = 0;
        
        for(int x = 0;x < s.length(); x++){
            if(s.charAt(x) == '0' && onec == 0)
                continue;
            if(s.charAt(x) == '0')
                zeroc++;
            else{
                
                onec++;
            }
            
            if(zeroc > onec)
                zeroc = onec;
        }
        
        // return (int)Math.min(onec, zeroc);
        return zeroc;
    }
}