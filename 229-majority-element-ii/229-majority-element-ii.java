class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int req = nums.length/3;
        Arrays.sort(nums);
        int i=0;
        List<Integer> ans = new ArrayList<>();
        int count=1;
        while(i<nums.length-1){
            if(nums[i] == nums[i+1])
                count++;
            else{
                if(count > req)
                    ans.add(nums[i]);
                count=1;
            }
            i++;
        }
        if(count > req)
            ans.add(nums[i]);
        return ans;
    }
}