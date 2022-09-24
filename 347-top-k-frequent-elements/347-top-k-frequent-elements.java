class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> temp = new HashMap<>();
        for(int x = 0; x < nums.length; x++){
            temp.put(nums[x],temp.getOrDefault(nums[x],0)+1);
        }
        
        List<Integer>[] mostK = new List[nums.length + 1];
        
        for(int x : temp.keySet()){
            int freq = temp.get(x);
            if(mostK[freq] == null)
                mostK[freq] = new ArrayList<>();
            
            mostK[freq].add(x);
        }
        int[] result = new int[k];
        for(int x = mostK.length -1; x >= 0; x--){
            if(mostK[x] != null){
                for(int y = 0; y < mostK[x].size() && k > 0; y++)
                    result[--k] = mostK[x].get(y);       
            }
        }
        
        return result;
    }
}