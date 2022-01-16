class Solution {
    public int[] plusOne(int[] digits) {
        int l=digits.length;
        for(int x=l-1;x>=0;x--)
        {
            if(digits[x]<9)
            {
                digits[x]++;
                return digits;
            }
            digits[x]=0;
        }
        int a[]=new int[l+1];
        a[0]=1;
        return a;
    }
    
}