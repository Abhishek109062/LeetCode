class Solution {
    long ans = 0;
    public long minimumFuelCost(int[][] roads, int seats) {
        int len = roads.length + 1;
        List<Integer>[] map = new ArrayList[len];
        
        for(int x = 0; x < len; x++)
            map[x] = new ArrayList<>();
        
       for(int x[] : roads){
           map[x[0]].add(x[1]);
           map[x[1]].add(x[0]);
       }
        
        
        cal(seats, 0, 0, map);
        return ans;
    }
    
    public int cal(int seats, int i, int pichla, List<Integer>[] map){
        int logg = 1;
        
        for(int x : map[i]){
            if(x == pichla){
                continue;
            }
            logg += cal(seats, x, i, map);
            // System.out.println(logg);
        }
        int temp = 0;
        if(i != 0)
           temp = (logg/seats + (logg % seats == 0 ? 0 : 1));
        // System.out.println(ans);
        ans += temp;
        // System.out.println(logg + " " + temp + " " + ans);
        return logg;
        
    }
}