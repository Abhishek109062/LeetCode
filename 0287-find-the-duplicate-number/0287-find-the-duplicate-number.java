class Solution {
    public int findDuplicate(int[] nums) {
        int temp[] = new int[nums.length+1];
        
        for(int i : nums){
            if(temp[i] != 0)
                return i;
            
            temp[i] = i;
        }
        return 0;
    }
}