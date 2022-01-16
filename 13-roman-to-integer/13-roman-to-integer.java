class Solution {
    public int romanToInt(String s) {
        int len=s.length();
        int last=0;
        int n=0;
        int num=0;
        for(int x=len-1;x>=0;x--)
        {
            char c=s.charAt(x);
        switch(c){          
                case 'I':
                    n = 1;
                    break;
                case 'V':
                    n = 5;
                    break;
                case 'X':
                    n = 10;
                    break;
                case 'L':
                    n = 50;
                    break;
                case 'C':
                    n = 100;
                    break;
                case 'D':
                    n = 500;
                    break;
                case 'M':
                    n = 1000;
                    break;
                default:
                    n = 0;
            }
            
            if(last>n)
                num=num-n;
            else
                num=num+n;
            
            last=n;
        }
        
        return num;
    }
}