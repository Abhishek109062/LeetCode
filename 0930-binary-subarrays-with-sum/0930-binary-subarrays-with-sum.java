class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count[] = new int[nums.length + 1];
        count[0] = 1;
        int ans = 0;
        int sum = 0;
        for(int x = 0; x < nums.length; x++){
            sum += nums[x];
            if(sum >= goal)
                ans +=count[sum - goal];
            
            count[sum]++;
        }
        
        return ans;
    }
}

// public int numSubarraysWithSum(int[] A, int S) {
//         int psum = 0, res = 0, count[] = new int[A.length + 1];
//         count[0] = 1;
//         for (int i : A) {
//             psum += i;
//             if (psum >= S)
//                 res += count[psum - S];
//             count[psum]++;
//         }
//         return res;
//     }