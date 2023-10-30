class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        
        List<Integer> temp =new ArrayList<>();
        temp.add(1);
        ans.add(new ArrayList<>(temp));
        if(numRows == 1)
            return ans;
        
        temp.add(1);
        ans.add(new ArrayList<>(temp));
        temp = new ArrayList<>();
        for(int x = 2; x < numRows; x++){
            temp.add(1);
            List<Integer> temp2 = ans.get(x-1);
            for(int y = 0; y < temp2.size() - 1; y++){
                temp.add(temp2.get(y) + temp2.get(y+1));
            }
            temp.add(1);
            ans.add(new ArrayList<>(temp));
            temp = new ArrayList<>();
        }
        
        return ans;
    }
}