class Solution {
     public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
         Stack<Integer> temp = new Stack<>();
         for(int x : nums){
             while(!temp.isEmpty() && temp.peek() < x)
                 map.put(temp.pop(), x);
             
             temp.push(x);
         }
         
         for(int x = 0; x < findNums.length; x++){
             findNums[x] = map.getOrDefault(findNums[x], -1);
         }
         
         return findNums;
    }
}