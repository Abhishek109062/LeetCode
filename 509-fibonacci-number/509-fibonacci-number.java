class Solution {
    public int fib(int n) {
        if(n<=1)
            return n;
        int [] ar=new int[n+1];
        ar[0]=0;
        ar[1]=1;
        for(int x=2;x<=n;x++)
            ar[x]=ar[x-1]+ar[x-2];
        return ar[n];
    }
}