class Solution {
    public int totalFruit(int[] fruits) {
        int len = fruits.length;
        // int count = 0;
        int y = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int x = 0; x < len; x++){
            map.put(fruits[x], map.getOrDefault(fruits[x], 0) + 1);
            while(map.size() > 2){
                map.put(fruits[y], map.get(fruits[y]) - 1);
                if(map.get(fruits[y]) == 0)
                    map.remove(fruits[y]);
                
                y++;
            }
            max = Math.max(max, x - y + 1);
            
        }
        return max;
    }
}