class Solution {
    public long countVowels(String word) {
        int l = word.length();
        char[] w = word.toCharArray();
      
        long res = 0;
        
        for(int k=0 ; k<l; k++){
            if(isVowel(w[k])){
                long right = l-k;
                long left = k+1;
                res += left * right;
                // System.out.println(w[k] + "  " + left*right);
            } 
        }
        return res;
    }
    
    public boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') return true;
        return false;
    }
}