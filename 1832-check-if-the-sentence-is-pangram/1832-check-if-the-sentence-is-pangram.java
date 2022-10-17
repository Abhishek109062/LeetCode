class Solution {
   public boolean checkIfPangram(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";    
        for (char ch : alphabet.toCharArray()) {
            if (sentence.indexOf(ch) == -1) return false;
        }        
        return true;
    }
}