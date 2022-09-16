class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int temp[] = new int[n+1];
        
        for(int x : citations){
            if(x >= n)
                temp[n]++;
            else
                temp[x]++;
        }
        
        int sum = 0;
        
        for(int x = n; x >= 0;x--){
            sum += temp[x];
            
            if(sum >= x)
                return x;
        }
        
        return 0;
    }
}