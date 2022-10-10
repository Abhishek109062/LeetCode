class Solution {
    public boolean equalFrequency(String word) {
        int count[] = new int[26];
        
        for(char ch: word.toCharArray())
            count[ch - 'a']++;
        
        int c = 0;
        for(char ch: word.toCharArray()){
            count[ch - 'a']--;
            if(confirm(count))
                return true;
            count[ch - 'a']++;
        }
        return false;
    }
    
    public boolean confirm(int[] count){
        int max = 0;
        for(int x : count){
            if(x == 0)
                continue;
            else if(max == 0)
                max = x;
            else if(max == x)
                continue;
            else
                return false;
        }
        return true;
    }
}