class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] ar = new int[26];
        for(int x = 0; x < 26; x++){
            ar[order.charAt(x) - 'a'] = x;
        }
        
        
        for(int x = 0; x < words.length - 1; x++){
            String temp1 = words[x];
            String temp2 = words[x+1];
            int len = temp1.length() > temp2.length() ? temp2.length() : temp1.length();
            int i = 0;
            boolean flag = false;
            while(i < len){
                // System.out.println(ar[temp1.charAt(i) - 'a'] +  " " + ar[temp2.charAt(i) - 'a']);   
                if(ar[temp1.charAt(i) - 'a'] < ar[temp2.charAt(i) - 'a'])
                {
                    flag = true;
                    break;
                }
                
                if(ar[temp1.charAt(i) - 'a'] > ar[temp2.charAt(i) - 'a'])
                   return false;
                
                i++;
            }
            if(temp1.length() > i && !flag)
                return false;
        }
        return true;

      }
}