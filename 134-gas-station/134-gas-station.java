class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0; 
        int curr=0;
        int s1=0;
        for(int x=0;x<gas.length;x++){
             total=total+(gas[x]-cost[x]);
            curr=curr+(gas[x]-cost[x]);
            if(curr<0){
                curr=0;
                s1=x+1;
            }
         }
        if(total<0)
            return -1;
        
        return s1;
    }
}