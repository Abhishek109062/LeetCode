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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> temp = new ArrayList<>();
        return find(root, temp, k);
    }
    
    public boolean find(TreeNode root,List<Integer> temp, int k){
        if(root == null)
            return false;
        
        if(temp.contains(k-root.val))
            return true;
        
        temp.add(root.val);
        
        return (find(root.left, temp, k) || find(root.right, temp, k));
    }
}