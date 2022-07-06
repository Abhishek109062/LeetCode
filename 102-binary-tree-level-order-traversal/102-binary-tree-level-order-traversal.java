/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        level(ans,root,0);
        return ans;
    }
    
    public void level(List<List<Integer>> ans,TreeNode root,int height){
        if(root==null)
            return;
        
        if(height>=ans.size())
            ans.add(new ArrayList<Integer>());
        
        ans.get(height).add(root.val);
        level(ans,root.left,height+1);
        level(ans,root.right,height+1);
    }
}