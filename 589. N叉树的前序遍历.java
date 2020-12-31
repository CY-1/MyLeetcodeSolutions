/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {

        List<Integer> a=new LinkedList<>();
        if(root==null)
        return a;
        a.add(root.val);
        for(int i=0;i<root.children.size();i++){
            a.addAll(preorder(root.children.get(i)));
        }
        return a;
    }
}
