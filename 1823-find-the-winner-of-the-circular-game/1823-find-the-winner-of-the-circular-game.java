class Solution {
    public int findTheWinner(int n, int k) {
    
        int result=0;
        for(int x=1;x<=n;x++){
            result=(result+k)%x;
        }
        return result+1;
    }
}