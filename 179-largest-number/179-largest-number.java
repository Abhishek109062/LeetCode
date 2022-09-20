class Solution {
    public String largestNumber(int[] nums) {
        String temp[]  = new String[nums.length];
        for(int x = 0; x < nums.length; x++)
            temp[x] = ""+nums[x];
        
        Arrays.sort(temp, new Comparator<String>(){
            public int compare(String s, String t){
                String s1 = s+t;
                String s2 = t+s;
                return s2.compareTo(s1);
            }
        });
        
        if(temp[0].charAt(0) == '0')
            return "0";
        
        StringBuilder s = new StringBuilder();
        for(String x: temp)
            s.append(x);
        return s.toString();
    }
}