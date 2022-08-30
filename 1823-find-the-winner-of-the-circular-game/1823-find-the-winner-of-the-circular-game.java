class Solution {
    public int findTheWinner(int n, int k) {
        LinkedList<Integer> temp=new LinkedList<>();
        for(int x=1;x<=n;x++)
            temp.add(x);
        
        int last=0;
        for(int x=1;x<=n;x++){
            for(int y=1;y<k;y++){
                temp.add(temp.poll());
            }
            last=temp.poll();
        }
        return last;
    }
    
}