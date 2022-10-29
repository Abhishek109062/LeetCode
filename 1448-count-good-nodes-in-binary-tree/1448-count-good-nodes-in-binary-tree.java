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
    public int goodNodes(TreeNode root) {
        return calcu(root, -10001);
    }
    
    public int calcu(TreeNode root, int max){
        if(root == null)
            return 0;
        
        int ans = root.val >= max ? 1 : 0;
        
        ans += calcu(root.left, Math.max(max, root.val));
        ans += calcu(root.right, Math.max(max, root.val));
        
        return ans;
    }
}