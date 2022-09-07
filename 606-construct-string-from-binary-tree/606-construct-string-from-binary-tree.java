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
    public String tree2str(TreeNode root) {
        String s="";
    
        if(root==null)
            return "";
        s += root.val;
        if(root.right==null && root.left==null)
            s += "";
        else if(root.left==null)
            s += "()"+"("+tree2str(root.right)+")";
        else if(root.right==null)
            s += "("+tree2str(root.left)+")";
        else
            s += "("+tree2str(root.left)+")"+ "("+tree2str(root.right)+")";
        
        return s;
    }
}