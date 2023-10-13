class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        for(int x = 2; x < len; x++){
            
            cost[x] += Math.min(cost[x-1], cost[x-2]);
        }   
        
        return Math.min(cost[len -1 ], cost[len -2]);
    }
}