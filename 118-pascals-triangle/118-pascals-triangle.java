class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> obj=new ArrayList<>();
        ArrayList<Integer> temp,pre=null;
        for(int x=0;x<n;x++)
        {
            temp=new ArrayList<Integer>();
            for(int y=0;y<=x;y++){
                if(y==0 || y==x)
                    temp.add(1);
                else
                    temp.add(pre.get(y)+pre.get(y-1));
            }
                pre=temp;
           
                obj.add(temp);
            
        }
        return obj;
    }
}