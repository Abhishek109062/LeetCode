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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root == null)
            return root;
        reverse(root.right, root.left,1);
        return root;
    }
    
    public void reverse(TreeNode n1, TreeNode n2,int level){
        if(n1 == null && n2 == null)
            return;
        
        if(level % 2 == 1){
            int temp = n1.val;
            n1.val = n2.val;
            n2.val = temp;
        }
        
        reverse(n1.right, n2.left, level+1);
        reverse(n1.left, n2.right, level+1);
    }
}