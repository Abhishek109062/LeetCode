class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<mat.length; i++){
            int sold_count=0;
            int civ_count=0;
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==0){
                    civ_count++;
                }else{
                    sold_count++;
                }
            }
            map.put(i,sold_count-civ_count);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(a)==map.get(b) ? a-b :(map.get(a)-map.get(b)));
        pq.addAll(map.keySet());
        int[] ans=new int[k];
        int count=0;
        while(count<k){
            ans[count++]=pq.poll();
        }
        return ans;
    }
}