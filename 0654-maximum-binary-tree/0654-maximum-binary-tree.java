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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode ans = build(nums, 0, nums.length-1);
        return ans;
        
    }
    
    public TreeNode build(int[] nums, int leftone, int rightone){
        if(leftone > rightone)
            return null;
        
        int bigg = largest(nums, leftone, rightone);
        // if(bigg >= nums.length)
        //     return null;
        System.out.println(bigg);
        TreeNode child = new TreeNode(nums[bigg]);
        
        
        child.left = build(nums, leftone, bigg -1);
        child.right = build(nums, bigg+1, rightone);
        
        return child;
    }
    
    public int largest(int[] nums, int i, int j){
        
        int ans = i;
        for(int x = i+1; x <= j; x++){
            if(nums[x] > nums[ans])
                ans = x;
        }
        
        return ans;
    }
}