class Solution {
    public int search(int[] nums, int target) {
        int bet = -1;
        // int ans = -1;
        
        for(int x = 1;x < nums.length; x++){
            if(nums[x-1] > nums[x]){
                bet = x;
                break;
            }
        }
        
        if(bet == -1)
            return search(nums, 0, nums.length -1, target);
        
        if(nums[0] <= target)
            return search(nums, 0, bet -1, target);
        else
            return search(nums, bet, nums.length - 1, target);
        
    }
    
    public int search(int[] nums, int start, int end, int target){
        
        while(start <= end){
            int mid = (start + end)/2;
            
            if(target == nums[mid])
                return mid;
            
            if(target > nums[mid])
                start = mid+1;
            else
                end = mid - 1;
        }
        return -1;
    }
    
}