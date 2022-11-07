class Solution {
    public int maximum69Number (int num) {
        int temp = num;
        int first = -1;
        
        for(int x = 0; temp > 0; x++){
            if(temp % 10 == 6)
                first = x;
            
            temp /= 10;
        }
        if(first == -1)
            return num;
        
        temp = num /(int)Math.pow(10, first);
        
        return (temp+3) * (int)Math.pow(10, first) + num % (int)Math.pow(10, first);
        
    }
}