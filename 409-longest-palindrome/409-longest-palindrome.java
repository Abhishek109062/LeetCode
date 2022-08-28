class Solution {
    public int longestPalindrome(String s) {
        List<Character> temp=new ArrayList<>();
        int count=0;
        for(int x=0;x<s.length();x++){
            if(temp.contains(s.charAt(x)))
            {
                temp.remove(Character.valueOf(s.charAt(x)));
                count++;
            }
            else
                temp.add(s.charAt(x));
        }
        if(!temp.isEmpty())
            return 2*count+1;
        else
            return 2*count;
    }
}