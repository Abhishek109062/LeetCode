class Solution {
    public String reverseWords(String s) {
        char ch[]=s.toCharArray();
        
        int i=0;
        for(int x=0;x<ch.length;x++)
        {
            if(ch[x]==' ')
            {
                reverse(ch,i,x-1);
                i=x+1;
            }
        }
        reverse(ch,i,ch.length-1);
        return new String(ch);
    }
    
    public void reverse(char ch[],int i,int j)
    {
        while(i<j)
        {
            char temp=ch[i];
            ch[i++]=ch[j];
            ch[j--]=temp;
        }
    }
    
}