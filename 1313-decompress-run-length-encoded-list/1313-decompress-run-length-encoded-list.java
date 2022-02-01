class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> obj=new ArrayList<>();
        for(int x=0;x<nums.length;x+=2)
        {
            int ln=nums[x];
            while(ln--!=0)
                obj.add(nums[x+1]);
        }
        
        return obj.stream().mapToInt(i ->i).toArray();
    }
}