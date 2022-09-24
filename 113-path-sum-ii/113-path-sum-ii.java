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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        paths(ans, root, targetSum, 0, new ArrayList<>());
        return ans;
    }
    public void paths(List<List<Integer>> ans, TreeNode root, int targetSum, int sum, List<Integer> temp){
        if(root == null)
            return;
        if(root.right == null && root.left == null){
            sum += root.val;
            temp.add(root.val);
            if(sum == targetSum)
                ans.add(new ArrayList<>(temp));
            
            return;
        }
        
        // if(sum > targetSum)
        //     return;
        
        temp.add(root.val);
        paths(ans, root.left, targetSum, sum + root.val, new ArrayList<>(temp));
        
        paths(ans, root.right, targetSum, sum + root.val, new ArrayList<>(temp));
    }
}