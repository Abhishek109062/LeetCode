class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        char ch[] = s.toCharArray();
        for(int x = 0; x < s.length(); x++){
            count += countpal(ch,x,x);
            count += countpal(ch,x,x+1);
        }
        return count;
    }
    
    public int countpal(char[] ch,int left, int right){
        int count = 0;
        while(left >=0 && right < ch.length && ch[left--] == ch[right++])
            count++;
        return count;
    }
}