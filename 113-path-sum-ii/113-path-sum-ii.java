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
        paths(ans, root, targetSum, new ArrayList<>());
        return ans;
    }
    public void paths(List<List<Integer>> ans, TreeNode root, int target, List<Integer> temp){
        if(root == null)
            return;
        if(target - root.val == 0 && root.right == root.left){
            temp.add(root.val);
            ans.add(new ArrayList<>(temp));
            temp.remove(temp.size() - 1);
            return;
        }
        
        // if(sum > targetSum)
        //     return;
        
        temp.add(root.val);
        paths(ans, root.left, target - root.val, temp);
        paths(ans, root.right, target - root.val, temp);
        temp.remove(temp.size() - 1);
    }
}