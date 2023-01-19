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
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        
        int left = ht(root.left);
        int right = ht(root.right);
        
        if(Math.abs(left - right) <= 1)
            return isBalanced(root.left) && isBalanced(root.right);
        
        return false;
    } 
    
    int ht(TreeNode root){
        if(root == null)
            return -1;
        
        return (int)Math.max(ht(root.right) , ht(root.left)) + 1;
    }
}