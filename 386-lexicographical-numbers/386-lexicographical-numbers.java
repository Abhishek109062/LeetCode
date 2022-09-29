class Solution {
    List<Integer> ans;
    public List<Integer> lexicalOrder(int n) {
          ans = new ArrayList<>();
        printlexo(0,n);
        return ans;
    }
    
    public void printlexo(int curr, int n){
        if(curr > n)
        return;
        // System.out.println(curr);
        if(curr != 0)
        ans.add(curr);
        
        int i = 0;
        if (curr == 0){
            i = 1;
        }
        
        for(; i <= 9; i++){
            printlexo(curr*10+i, n);
        }
    }
}