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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        
        build(root, ans, 0);
        return ans;
    }
    
    public void build(TreeNode root, List<List<Integer>> ans, int level){
        if(root == null)
            return;
        
        if(ans.size() <= level){
            List<Integer> temp = new ArrayList<>();
            ans.add(temp);
        }
        
        List<Integer> temp = ans.get(level);
        if(level % 2 == 0)
            temp.add(root.val);
        else
            temp.add(0, root.val);
        
        build(root.left, ans, level + 1);
        build(root.right, ans, level + 1);
    }
}