class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int x: arr){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        
        HashSet<Integer> temp = new HashSet<>();
        // System.out.println(map.values());
        for(int x : map.values())
            temp.add(x);
        
        // System.out.println(temp);
        return map.size() == temp.size();
    }
}