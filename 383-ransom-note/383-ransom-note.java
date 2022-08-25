class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //return magazine.contains(ransomNote);
        int arr[]=new int[26];
        for(int x=0;x<magazine.length();x++)
            arr[magazine.charAt(x)-'a']++;
            
        for(int x=0;x<ransomNote.length();x++){
            if(--arr[ransomNote.charAt(x)-'a']<0)
                return false;
        }
        return true;
    }
}