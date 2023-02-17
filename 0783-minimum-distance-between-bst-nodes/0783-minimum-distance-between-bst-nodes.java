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
    List<Integer> temp = new ArrayList<>();
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        int mins = Integer.MAX_VALUE;
        
        for(int x = 0; x < temp.size() - 1; x++){
            mins = mins > temp.get(x+1) - temp.get(x) ? temp.get(x+1) - temp.get(x) : mins; 
        }
        return mins;
    }
    
    public void inorder(TreeNode root){
        if(root == null)
            return;
        
        inorder(root.left);
        temp.add(root.val);
        inorder(root.right);
    }
}