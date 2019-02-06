/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    boolean init = false;
    int prev;
    int minv = Integer.MAX_VALUE;
    
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minv;
    }
    
    void inorder(TreeNode self){
        if(self == null) return;
        inorder(self.left);
        //self
        if(!init){
            init = true;
        }else{
            minv = Math.min(minv, self.val - prev);
        }
        prev = self.val;  
        inorder(self.right);
    }
 
}
