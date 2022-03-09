class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> obj=new LinkedList<String>();
        backtrack(obj,"",0,0,n);
        return obj;
    }
    
    
    public void backtrack(List<String> obj, String s, int open,int close,int max)
    {
        if(s.length()==2*max)
        {   
            obj.add(s);
            return;
        }
        
        if(open<max)
            backtrack(obj,s+"(",open+1,close,max);
        if(close<open)
            backtrack(obj,s+")",open,close+1,max);
    }
}