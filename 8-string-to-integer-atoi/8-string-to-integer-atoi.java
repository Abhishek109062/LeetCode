class Solution {
    public int myAtoi(String s) {
        int index=0,sign=1,number=0;
        int len=s.length();
        if(s.length()==0)
            return 0;
        
        while(index<len && s.charAt(index)==' ')
            index++;
            
        
        if(index<len && (s.charAt(index)=='-' || s.charAt(index)=='+') )
        {   
            sign=s.charAt(index)=='+'?1:-1;
            index++;
        }
        
        while(index<len)
        {
            int temp=s.charAt(index)-'0';
            if(temp<0 || temp>9)
                break;
            
            if(Integer.MAX_VALUE/10 < number || Integer.MAX_VALUE/10 == number &&                   Integer.MAX_VALUE%10 < temp)
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                
        number=number*10+temp;
        index++;
        }
        return number*sign;
    }
}