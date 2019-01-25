/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// inorder traversal
// 3 5 [7 10 15] 18
// if(root == null) return;
// if(root.val < L) traversal only right subtree
// if(root.val > R) traversal only left subtree
// if(L <= root.val && root.val <= R ){
// inorder(root.left);
// self sum += root.val
// inorder(root.right);
// }

class Solution {
    int sum;
    public int rangeSumBST(TreeNode root, int L, int R) {
        inorder(root, L, R);
        return sum;
    }
    
    
    public void inorder(TreeNode root, int L, int R){
        if(root == null) return;
        if(root.val < L) inorder(root.right, L, R);
        if(root.val > R) inorder(root.left, L, R);
        if(L <= root.val && root.val <= R ){
            inorder(root.left, L, R);
            sum += root.val;
            inorder(root.right, L, R);
        }
    }
    
    
}
