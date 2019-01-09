/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> ret = new LinkedList<>();
        traversal(root, ret);
        return ret;
    }
    
    public void traversal(Node self, List<Integer> ret){
        if(self == null) return;
        ret.add(self.val);
        for(Node child : self.children){
            traversal(child, ret);
        }
    }
}
