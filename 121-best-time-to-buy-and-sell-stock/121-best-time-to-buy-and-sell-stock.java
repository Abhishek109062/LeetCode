class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1)
            return 0;
        int start=Integer.MAX_VALUE;
        int temp=0,gap=0;
        for(int x=0;x<prices.length;x++){
            if(start>prices[x]){
                start=prices[x];
                }
            temp=prices[x]-start;
            if(gap<temp)
                gap=temp;
        }
        return gap;
    }
}