class Solution {
    public int climbStairs(int n) {
        int a[]=new int[n+1];
        a[0]=1;
        a[1]=1;
        for(int x=2;x<=n;x++)
        {
            a[x]=a[x-1]+a[x-2];
        }
        return a[n];
    }
}