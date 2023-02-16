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
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        
        Queue<TreeNode> temp = new LinkedList<>();
    
    temp.add(root);
    
    int height = 0;
    List<List<Integer>> tr = new ArrayList<>();
    while(!temp.isEmpty()){
        int size = temp.size();
        List<Integer> store = new ArrayList<>();
        int i = 0;
        while(i < size){
            i++;
        TreeNode temp2 = temp.poll();
        if(temp2.right != null){
            temp.add(temp2.right);
            store.add(temp2.val);
        }
        
            if(temp2.left != null){
                temp.add(temp2.left);
                store.add(temp2.val);
            }
        }
        tr.add(new ArrayList<>(store));
    }
    
    return tr.size();
        
    }
}