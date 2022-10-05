class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {     
        return solveItForMe(root,val,depth,1);
    }

    private TreeNode solveItForMe(TreeNode root, int val, int depth, int level){
        if (root == null) 
        return null;
        if (depth == 1){                            
            TreeNode newNode = new TreeNode(val);
            newNode.left =root;
            return newNode;         
        }
        if (level == depth-1){  
			TreeNode newNode = new TreeNode(val);
            newNode.left = root.left;
            root.left = newNode;

			newNode = new TreeNode(val);
            newNode.right = root.right;
            root.right = newNode;
        }
        else{
            solveItForMe(root.left,val,depth,level+1);  
            solveItForMe(root.right,val,depth,level+1);  
        }
        return root;
    }
}