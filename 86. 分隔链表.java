/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode target=null,b=null;
        ListNode current=new ListNode();
        current.next=head;
        head=current;
        while(current.next!=null){
            if(target==null&&current.next.val>=x){
                target=current;
            }
            if(target!=null&&current.next.val<x){
                b=current.next;
                current.next=b.next;
                b.next=target.next;
                target.next=b;
                target=target.next;
                continue;
            }
            current=current.next;
        }
        // System.out.println(target.next.val);
        return head.next;
    }
}
