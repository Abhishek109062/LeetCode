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
        paths(root,"");
        return ans;
    }
    public void paths(TreeNode root, String str){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            str = str+root.val;
            ans.add(str);
            return;
        }
        // if(root.right == null || root.left == null)
        //     return;
        
        str = str+root.val+"->";
        paths(root.left, str);
        paths(root.right,str);
    }
}