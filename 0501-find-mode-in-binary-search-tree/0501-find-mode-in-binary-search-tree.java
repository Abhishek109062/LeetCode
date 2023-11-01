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
    Map<Integer, Integer> store = new HashMap<>();
    int max = Integer.MIN_VALUE;
    public int[] findMode(TreeNode root) {
        traverse(root);
        
        // System.out.println(max);
        List<Integer> temp = new ArrayList<>();
        
        for(int x : store.keySet()){
            if(store.get(x) == max){
                temp.add(x);
            }
        }
        
        
        int[] ans = new int[temp.size()];
        
        for(int x = 0; x < temp.size(); x++)
            ans[x] = temp.get(x);
        
        
        return ans;
    }
    
    public void traverse(TreeNode root){
        if(root == null)
            return;
        
        if(root.left != null)
            traverse(root.left);
        store.put(root.val, store.getOrDefault(root.val, 0)+1);
        // System.out.println(store.get(root.val));
        max = Math.max(max, store.get(root.val));
        if(root.right != null)
            traverse(root.right);
    }
}