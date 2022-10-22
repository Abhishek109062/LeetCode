class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int x = 0; x < chalk.length; x++)
            sum += chalk[x];
        
        long diff = k % sum;
        
        for(int x = 0; x < chalk.length; x++){
            if(diff - chalk[x] < 0)
                return x;
            diff -= chalk[x];
        }
            
        return 0;
    }
}