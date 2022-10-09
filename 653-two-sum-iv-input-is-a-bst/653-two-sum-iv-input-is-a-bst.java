class Solution {
    public boolean findTarget(TreeNode root, int k) {

       return fun(root,root,k);
        
        
    }
    
    boolean fun(TreeNode root,TreeNode p, int k){
        
        if(p==null)
            return false;

          boolean v =   search(root,p,k-p.val);
            if(v)
                return true;
        
          v = fun(root,p.left,k);
            if(v)
                return true;

            v = fun(root,p.right,k);
            if(v)
                return true;
 
        return false;
    }
    
    boolean search(TreeNode root,TreeNode p,int k){
        
        if(root==null)
            return false;
        
        TreeNode c = root; boolean h=  false;
        while(c!=null&&h!=true){
            if(c.val==k&&p!=c){
                h=  true;
                return true;
            }
            else if(k<c.val)
                c = c.left;
            else
                c = c.right;
        }
        
       return false; 
    }
}
    