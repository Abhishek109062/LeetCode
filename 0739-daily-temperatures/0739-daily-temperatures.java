class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> temp = new Stack<>();
        
        int[] ans = new int[n];
        temp.push(n-1);
        
        for(int x = n-2; x >= 0; x--){
            
            while(!temp.isEmpty() && temperatures[temp.peek()] <= temperatures[x])
                temp.pop();
            
            if(!temp.isEmpty()){
                ans[x] = temp.peek() - x;
            }
            
            temp.push(x);
        }
        return ans;
    }
}