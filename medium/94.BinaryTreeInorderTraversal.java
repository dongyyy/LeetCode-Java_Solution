/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
2진 트리 순회는 일반적으로 재귀적으로 해결한다.

inorder : left self right 
preorder : self left right
postorder : left right self
*/

class Solution {
    List<Integer> retList;
    public List<Integer> inorderTraversal(TreeNode root) {
        retList = new ArrayList<Integer>();
        traverse(root);
        return retList;
    }
    
    void traverse(TreeNode node){
        if(node == null) return;
        traverse(node.left);
        retList.add(node.val);
        traverse(node.right);
    }
}