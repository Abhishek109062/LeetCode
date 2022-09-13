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
    public List<TreeNode> generateTrees(int n) {
        if(n==0)
            return new ArrayList<>();
        
        return generate(1,n);
    }
    
    public List<TreeNode> generate(int start , int end){
        if(start>end){
            List<TreeNode> temp = new ArrayList<>();
            temp.add(null);
            return temp;
        }
        
        List<TreeNode> ans = new ArrayList<>();
        
        for(int x = start; x <= end ;x++){
            
            List<TreeNode> left = generate(start , x-1);
            List<TreeNode> right = generate(x+1  , end);
            
            for(int l = 0; l < left.size(); l++){
                for(int r = 0; r < right.size(); r++){
                    
                    TreeNode temp = new TreeNode(x);
                    
                    temp.left = left.get(l);
                    temp.right = right.get(r);
                    
                    ans.add(temp);
                }
            }
            
        }
        return ans;
    }
}