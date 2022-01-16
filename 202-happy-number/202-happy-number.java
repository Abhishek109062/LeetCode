class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        while(n!=0)
            {
                sum+=Math.pow(n%10,2);
                n/=10;
            }
        if(sum<10)
        {
            if(sum==1 || sum==7)
                return true;
            else
                return false;
        }
        return isHappy(sum);
    }
}