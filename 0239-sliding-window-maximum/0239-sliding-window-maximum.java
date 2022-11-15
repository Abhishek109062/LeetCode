class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        Deque<Integer> temp = new ArrayDeque<>();
        int y = 0;
        
        for(int x = 0; x < nums.length; x++){
            while(!temp.isEmpty() && temp.peek() < x - k + 1)
                temp.poll();
            
            while(!temp.isEmpty() && nums[temp.peekLast()] < nums[x])
                temp.pollLast();
            
            temp.offer(x);
            if(x >= k - 1)
                ans[y++] = nums[temp.peek()];
        }
        
        return ans;
    }
}