class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int prefix[] = new int[nums.length + 1];
        Map<Integer, Integer> temp = new HashMap<>();
        int tr = 0;        
        for(int x = 0; x < nums.length; x++){
            if(x > 0){
                nums[x] += nums[x-1];
            }
            
            tr = ((nums[x] % k) + k)%k;
            temp.put(tr, temp.getOrDefault(tr, 0) + 1);
        }
        
        System.out.println(temp);
        int ans = 0;
        for(int x : temp.values())
            ans += x * (x-1)/2;
        
        return ans + temp.getOrDefault(0,0);
    }
}