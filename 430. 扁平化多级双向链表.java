/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null){
            return head;
        }
        Node cur=head;
        while(cur!=null){
            Node nxt=cur.next;
            if(cur.child!=null){
                Node child=cur.child;
                cur.next=child;
                child.prev=cur;
                cur.child=null;
                Node tail=child;
                while(tail!=null&&tail.next!=null){
                    tail=tail.next;
                }
                tail.next=nxt;
                if(nxt!=null){
                    nxt.prev=tail;
                }
            }
            cur=cur.next;
        }
        return head;
    }

}
