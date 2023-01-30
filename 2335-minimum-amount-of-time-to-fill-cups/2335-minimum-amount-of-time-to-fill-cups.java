class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> temp = new PriorityQueue<>(Collections.reverseOrder());
        
        temp.add(amount[0]);
        temp.add(amount[1]);
        temp.add(amount[2]);
        int count = 0;
        
        
        while(temp.peek() > 0){
            int temp2 = temp.poll() - 1;
            int temp3 = temp.poll() - 1;
            temp.add(temp2);
            temp.add(temp3);
            count++;
            
        }
        return count;
    }
}