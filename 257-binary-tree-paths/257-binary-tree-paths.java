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
    List<String> ans;
    public List<String> binaryTreePaths(TreeNode root) {
        ans = new ArrayList<>();
        if(root == null)
            return ans;
        paths(root,new StringBuilder());
        return ans;
    }
    public void paths(TreeNode root, StringBuilder str){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            str.append(root.val);
            // str.append("->");
            ans.add(str.toString());
            return;
        }
        // if(root.right == null || root.left == null)
        //     return;
        
        str.append(root.val);
        str.append("->");
        paths(root.left,new StringBuilder(str));
        paths(root.right,new StringBuilder(str));
    }
}