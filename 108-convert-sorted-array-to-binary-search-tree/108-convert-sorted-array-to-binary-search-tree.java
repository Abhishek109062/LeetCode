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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
        
        TreeNode ans=find(0,nums.length-1,nums);
        return ans;
        }
    public TreeNode find(int x, int y, int nums[]){
        if(x>y)
            return null;
        
        int m=(x+y)/2;
        TreeNode temp=new TreeNode(nums[m]);
        temp.left=find(x,m-1,nums);
        temp.right=find(m+1,y,nums);
        return temp;
    }
    
}