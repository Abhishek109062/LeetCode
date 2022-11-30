class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> temp = new Stack<>();
        
        int max = 0;
        
        int i = 0;
        while(i < heights.length){
            if(temp.isEmpty() || heights[temp.peek()] <= heights[i])
                temp.push(i++);
            else{
                int trr = temp.pop();
                // System.out.println(trr);
                int areatemp = heights[trr]*(temp.isEmpty() ? i: i - temp.peek() - 1);
                
                max = max > areatemp ? max : areatemp;
            }
        }
        
        while(!temp.isEmpty()){
            int temp1 = heights[temp.pop()];
            
            int areatemp = temp1*(temp.isEmpty() ? i : i - temp.peek() - 1);
            
            max = max > areatemp ? max : areatemp;
        }
        
        return max;
    }
}