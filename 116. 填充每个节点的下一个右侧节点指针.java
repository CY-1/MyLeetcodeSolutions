/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null){
            return null;
        }
        my(root,null);
        return root;
    }
    public void my(Node root,Node front){
        if(front!=null){
            front.next=root;
        }
        if(root.left!=null){
            if(front!=null&&front.right!=null)
            {
                my(root.left,front.right);
            }
            else if(front!=null&&front.left!=null){
                my(root.left,front.left);
            }
            else{
                my(root.left,null);
            }
        }
        if(root.right!=null){
            my(root.right,root.left);
        }
    }
}
