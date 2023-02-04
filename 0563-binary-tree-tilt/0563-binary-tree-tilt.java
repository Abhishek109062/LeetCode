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
     int ans = 0;
    public int findTilt(TreeNode root) {
        calthe(root);
        return ans;
    }
    
    public int calthe(TreeNode root){
        if(root == null)
            return 0;
        
        int left = calthe(root.left);
        int right = calthe(root.right);
        
        int temp = left + right + root.val;
        root.val = Math.abs(left - right);
        ans += root.val;
        return temp;
    }
}