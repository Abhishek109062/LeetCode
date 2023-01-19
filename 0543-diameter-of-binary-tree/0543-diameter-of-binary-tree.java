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
    static int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {        
        if(root == null)
            return 0;
        
        int left = diameterOfBinaryTree(root.left);
        
        int right = diameterOfBinaryTree(root.right);
        int temp = ht(root.left) + ht(root.right) + 2;
        System.out.println(temp);
        return (int)Math.max(left, Math.max(right, temp));
    }
    
    public int ht(TreeNode root){
        if(root == null)
            return -1;
        
        return Math.max(ht(root.right), ht(root.left)) + 1;
    }
}