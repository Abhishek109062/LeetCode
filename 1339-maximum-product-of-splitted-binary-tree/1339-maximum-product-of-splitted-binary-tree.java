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
    long total = 0;
    long ans = 0;
    long sub = 0;
    public int maxProduct(TreeNode root) {
        
        
        total = calcu(root);
        calcu(root);
        
        return (int)(ans % (int)(1000000007));
    }
    
    public long calcu(TreeNode root){
        if(root == null){
            return 0;
        }
        
        sub = root.val + calcu(root.left) + calcu(root.right);
        ans = Math.max(ans, sub * (total - sub));
        
        return sub;
    }
    
    
}