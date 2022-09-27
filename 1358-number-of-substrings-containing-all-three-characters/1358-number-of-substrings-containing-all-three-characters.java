class Solution {
    public int numberOfSubstrings(String s) {
        int alpha[] = {0,0,0};
        int result = 0;
        int i = 0;
        int len = s.length();
        for(int x = 0; x < len; x++){
            alpha[s.charAt(x) - 'a']++;
            
            while(alpha[0] > 0 && alpha[1] > 0 && alpha[2] > 0){
                result += len - x;
                alpha[s.charAt(i++) - 'a']--;
            }
        }
        return result;
    }
}