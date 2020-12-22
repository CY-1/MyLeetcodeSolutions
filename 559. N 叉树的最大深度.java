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
    int result=0;
    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        my(root,1);
        return result;
    }
    public int my(Node root,int depth){
        result=Math.max(result,depth);
        for(int i=0;i<root.children.size();i++){
            my(root.children.get(i),depth+1);
        }
        return 0;
    }
}
