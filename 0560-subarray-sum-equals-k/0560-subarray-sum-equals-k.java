class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        int sum = 0;
        int count = 0;
        temp.put(0,1);
        for(int x : nums){
            sum += x;
            if(temp.containsKey(sum - k))
                count += temp.get(sum - k);
            
            temp.put(sum,temp.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}