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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode newroot = new TreeNode(val);
            newroot.left = root;
            return newroot;
        }
        update(root, val, depth);
        return root;
        
    }
    
    public void update(TreeNode root, int val, int depth){
        if(root == null)
            return;
        if(depth == 2){
            TreeNode templeft = root.left;
            TreeNode tempright = root.right;
            TreeNode new1 = new TreeNode(val);
            TreeNode new2 = new TreeNode(val);
            
            new1.left = root.left;
            new2.right = root.right;
            
            root.left = new1;
            root.right = new2;
            
            return;
        }
        
        update(root.left, val, depth-1);
        update(root.right, val, depth-1);
    }
}