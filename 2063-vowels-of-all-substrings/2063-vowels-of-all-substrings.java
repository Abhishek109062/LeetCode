class Solution {
    public long countVowels(String s) {
        long count = 0L, len = s.length();
        for(int x = 0; x < len; x++){
            if("aeiou".indexOf(s.charAt(x)) >= 0){
                count += (x+1)*(len-x);
            }
        }
        
        return count;
    }
}