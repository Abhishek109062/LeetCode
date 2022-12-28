class Solution {
    public int minStoneSum(int[] piles, int k) {
        // Comparator<Integer> comp = new Comparator() {
        //     public int compare(int s1, int s2) {
        //         return s2 - s1;
        //     }
        // };
        
        PriorityQueue<Integer> temp = new PriorityQueue<>(Collections.reverseOrder());
        for(int x :piles)
            temp.add(x);
        
        // System.out.println(temp);
        while(k-- > 0){
            temp.add((int)Math.round(temp.poll()/2.0));
            // System.out.println(temp);
        }
        int ans = 0;
        while(!temp.isEmpty()){
            ans += temp.poll();
        }
        
        return ans;
    }
}