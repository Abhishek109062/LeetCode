class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res=new ArrayList<String>();
        if (nums.length ==0) return res;

        StringBuilder sb=new StringBuilder();
        sb.append(nums[0]);
        int start=0;

        for(int i=1; i<nums.length; i++){
            if(nums[i]-nums[i-1]!=1){
                if (start!=i-1){
                    sb.append("->");
                    sb.append(nums[i-1]); 
                }
                res.add(sb.toString());
                sb.setLength(0);
                sb.append(nums[i]);
                start=i;
            } else if (i==nums.length-1){
                sb.append("->");
                sb.append(nums[i]); 
                res.add(sb.toString());
                sb.setLength(0);
            }
        }
        
        if(sb.length() !=0)res.add(sb.toString());            
       return res;
    }
}