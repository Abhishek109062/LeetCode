class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] maintain = new int[100001];
        int max = 0;
        
        for(int[] temp : matches){
            if(maintain[temp[0]] >= 0)
                maintain[temp[0]] += 1;
            
            if(maintain[temp[1]] >= 0)
                maintain[temp[1]] = -1;
            else if(maintain[temp[1]] < 0)
                maintain[temp[1]] -= 1;
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        
        for(int x = 0; x < 100001; x++){
            if(maintain[x] > 0)
                temp1.add(x);
            else if(maintain[x] == -1)
                temp2.add(x);
        }
        
        ans.add(temp1);
        ans.add(temp2);
        
        return ans;
    }
}