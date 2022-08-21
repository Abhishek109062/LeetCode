class Solution {
    public int reverse(int x) {
        
        long cp=0l;
        while(x!=0)
        {
            int d=x % 10;
            cp=cp*10 + d;
            x/=10;
            if(cp>Integer.MAX_VALUE || cp<Integer.MIN_VALUE)
            {
                cp=0;
                break;
            }
            
        }
        
            return (int)cp;
        
        
    }
}