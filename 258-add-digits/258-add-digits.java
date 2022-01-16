class Solution {
    public int addDigits(int num) {
        int d = 0;
        while (num > 0) {
            d += num % 10;
            num = num / 10;
            
            if (num == 0 && d > 9) {
                num = d;
                d = 0;  
            }    
        }     
        return d;
    }
}