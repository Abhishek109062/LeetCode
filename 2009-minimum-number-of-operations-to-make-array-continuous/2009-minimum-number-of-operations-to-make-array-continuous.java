class Solution {
    public int minOperations(int[] nums) {
    Set<Integer> temp =new  HashSet<>();
        
    int len = nums.length;
    for(int x = 0; x < len; x++){
        temp.add(nums[x]);
    }
    
    
    int ar[] = new int[temp.size()];
        
        int ind = 0;
        for(int x : temp){
            ar[ind++] = x;
        }
    
        
        Arrays.sort(ar);
        
        
        int result = Integer.MAX_VALUE;
        int len2 = ar.length;
        int tr = 0;
        for(int x = 0; x < len2; x++){
            
            while(tr < len2 && ar[tr] < ar[x] + len){
                tr++;
            }
            
            result = Math.min(result, len - tr + x);
        }
        
        return result;
    }
}