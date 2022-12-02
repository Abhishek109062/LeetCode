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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        generate(root, 0, ans);
        
        return ans;
    }
    
    public void generate(TreeNode root, int level, List<List<Integer>> ans){
        if(root == null)
            return;
        
        
        if(ans.size() < level+1)
            ans.add(0, new ArrayList<>());
        
        ans.get(ans.size() - 1 - level).add(root.val);
        generate(root.left, level + 1, ans);
        generate(root.right, level + 1, ans);
    }
}