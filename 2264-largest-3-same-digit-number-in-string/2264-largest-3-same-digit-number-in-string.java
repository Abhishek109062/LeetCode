class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        for(int x = 3; x <= num.length(); x++){
            String temp = num.substring(x-3, x);
            
            if(temp.charAt(0) == temp.charAt(1) && temp.charAt(1) == temp.charAt(2)){
               
                ans = temp.compareTo(ans) > 0 ? temp : ans;
            } 
        }
        
        return ans;
    }
}