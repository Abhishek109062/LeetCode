class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int len = img1.length;
        List<int[]> lista = new ArrayList<>(), listb = new ArrayList<>();
        
        
        for(int x = 0; x < len; x++){
            for(int y = 0; y < len; y++)
            {
                if(img1[x][y] == 1)
                    lista.add(new int[]{x,y});
                
                if(img2[x][y] == 1)
                    listb.add(new int[]{x,y});
            }
        }
        Map<String, Integer> ans = new HashMap<>();
        for(int[] x : lista){
            for(int[] y : listb){
                String s = (x[0] - y[0]) + " " + (x[1] - y[1]);
                ans.put(s, ans.getOrDefault(s, 0) + 1);
            }
        }
        
        int res = 0;
        for(int x : ans.values()){
            res = res > x ? res : x;
        }
        return res;
    }
}