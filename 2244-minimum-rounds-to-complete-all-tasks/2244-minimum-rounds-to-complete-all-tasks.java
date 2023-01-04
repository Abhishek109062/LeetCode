class Solution {
    public int minimumRounds(int[] tasks) {
        int ans = 0;
        Map<Integer, Integer> temp = new HashMap<>();
        for(int x : tasks)
            temp.put(x, temp.getOrDefault(x,0) + 1);
        
        for(int x : temp.values()){
            if(x == 1)
                return -1;
            
            int tt = x % 3;
            if(tt == 1)
                ans += x/3 + 1;
            else
                ans += x/3 + (x%3)/2;
        }
        
        return ans;
    }
}