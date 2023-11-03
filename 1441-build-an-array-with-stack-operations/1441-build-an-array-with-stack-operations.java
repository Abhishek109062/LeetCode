class Solution {
    public List<String> buildArray(int[] target, int n) {
        int prev=0;
        List<String> res=new ArrayList<>();
        for(int t: target) {
            boolean isfirst=true;
            while(prev<t) {
                if(!isfirst) res.add("Pop");
                isfirst=false;
                res.add("Push");
                prev++;
            }
            prev=t;
        }
        return res;
    }
}