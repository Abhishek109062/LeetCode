class Solution {
    public boolean closeStrings(String word1, String word2) {
        int count1[] = new int[26];
        int count2[] = new int[26];
        
        
        for(int x = 0; x < word1.length(); x++){
            count1[word1.charAt(x) - 'a']++;
         }
        
        for(int x = 0; x < word2.length(); x++)
           count2[word2.charAt(x) - 'a']++;
        
        for(int x = 0; x < 26; x++){
            if(count1[x] == count2[x])
                continue;
            
            if(count1[x] == 0 || count2[x] == 0)
                return false;
            
        }
        
        Arrays.sort(count1);
        Arrays.sort(count2);
        
        for(int x = 0; x < 26; x++){
            // System.out.println("sdfddsf");
            if(count1[x] != count2[x])
                return false;
        }
     
        
        return true;
    }
}