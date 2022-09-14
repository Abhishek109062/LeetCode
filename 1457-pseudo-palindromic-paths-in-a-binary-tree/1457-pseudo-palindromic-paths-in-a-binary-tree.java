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
    int answer;
    public int pseudoPalindromicPaths (TreeNode root) {
        answer = 0;
        int[] occur = new int[10];
        dfs(root , occur);
        return answer;
    }
    
    public void dfs(TreeNode root,int[] occur){
        if(root == null)
            return;
        occur[root.val]++;
        if(root.left == null && root.right == null){
            int count  = 0;
            for(int x = 1; x < 10; x++)
                if(occur[x] % 2 == 1)
                    count++;
                
                if(count <= 1)
                    answer++;
            
        }
        
        dfs(root.left , occur);
        dfs(root.right , occur);
        occur[root.val]--;
        
    }
}