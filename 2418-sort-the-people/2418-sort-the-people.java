class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int len = heights.length;
        Map<Integer,String> tally= new HashMap<>();
        
        for(int x = 0; x < len; x++){
            tally.put(heights[x], names[x]);
        }
        
        Arrays.sort(heights);
        
        String nm[] =new String[names.length];
        for(int x = len-1; x >= 0; x--){
            nm[len-x-1] = tally.get(heights[x]);
        }
        
        return nm;
    }
}