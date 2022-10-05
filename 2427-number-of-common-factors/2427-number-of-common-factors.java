class Solution {
    public int commonFactors(int a, int b) {
        int gcd2 = gcd(a, b);
        int count = 1;
        // System.out.println(gcd2);
        for(int x = 2; x <= gcd2/2; x++){
            if(gcd2 % x == 0)
                count++;
        }
        
        return gcd2 != 1 ? count+1 : count;
    }
    
    public int gcd(int a, int b){
        if(b == 0)
            return a;
        
        return gcd(b, a%b);
    }
}