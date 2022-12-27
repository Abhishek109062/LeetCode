class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int addi) {
        int req[] = new int[rocks.length];
        for(int x = 0; x < rocks.length; x++){
            req[x] = capacity[x] - rocks[x];
        } 
        
        Arrays.sort(req);
        
        int ans = 0;
        int i = 0;
        while(addi > 0 && i < rocks.length){
            if(addi - req[i] >= 0){
            addi -= req[i++];
                ans++;
            }
            else break;
        }
        
        return ans;
        
        
    }
}