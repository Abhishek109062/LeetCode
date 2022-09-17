class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum = neededTime[0];
        int max = neededTime[0];
        int ans = 0;
        for(int x = 1; x < colors.length() ;x++){
            if(colors.charAt(x) != colors.charAt(x-1)){
                ans += sum - max;
                sum = 0;
                max = 0;
            }
            
            sum += neededTime[x];
            max = Math.max(max,neededTime[x]);
        }
        
        ans += sum-max;
        return ans;
    }
}