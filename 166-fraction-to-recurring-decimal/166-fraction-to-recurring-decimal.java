class Solution {
    public String fractionToDecimal(int num, int den) {
        if(num == 0)
            return "0";
        
        StringBuilder ans = new StringBuilder();
        ans.append(((num > 0) ^ (den > 0)) ? "-":"");
        
        long num1 = Math.abs((long)num);
        long den1 = Math.abs((long)den);
        ans.append(num1 / den1);
        
        num1 %= den1;
        if(num1 == 0)
            return ans.toString();
        
        ans.append(".");
        HashMap<Long, Integer> temp = new HashMap<>();
        temp.put(num1, ans.length());
        while(num1 != 0){
            num1 *= 10;
            ans.append(num1 / den1);
            num1 %= den1;
            
            if(temp.containsKey(num1)){
                int i = temp.get(num1);
                ans.insert(i, "(");
                ans.append(")");
                return ans.toString();
            }
            else
                temp.put(num1, ans.length());
        }
        return ans.toString();
    }
}