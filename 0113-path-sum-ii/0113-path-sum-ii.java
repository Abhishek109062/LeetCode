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
    List<List<Integer>> ans  = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        cat(root, sum, new ArrayList<>());
        return ans;
    }
    public void cat(TreeNode root, int sum, List<Integer> temp){
        if(root == null){
            return;
        }
        
        if(root.left == root.right && sum - root.val == 0){
            temp.add(root.val);
            ans.add(new ArrayList<>(temp));
            temp.remove(temp.size() -1 );
            return;
        }
        
        temp.add(root.val);
        cat(root.left, sum - root.val, temp);
        cat(root.right, sum - root.val, temp);
        temp.remove(temp.size() - 1);
    } 
}