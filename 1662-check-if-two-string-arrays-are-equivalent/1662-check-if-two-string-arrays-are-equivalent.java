class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = "";
        for(String temp : word1)
            w1 = w1 + temp;
        
        String w2 = "";
        for(String temp : word2)
            w2 = w2 + temp;
        
        
        return w1.equals(w2);
    }
}