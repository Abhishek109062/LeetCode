class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        for(int x = 1; x <= n; x++){
            int ct = temp.size() - 1;
            int tt = (int)Math.pow(2, x - 1);
            while(ct >= 0)
                temp.add(tt + temp.get(ct--));
        }
        return temp;
    }
}