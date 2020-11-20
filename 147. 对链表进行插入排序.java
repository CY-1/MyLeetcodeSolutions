class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode a=new ListNode(Integer.MIN_VALUE);
         a.next=head;
        ListNode current=head.next;
        ListNode right=head;
        right.next=null;
        while(current!=null){
            ListNode b=a;
            while(b.next!=null&&b.next.val<current.val){

                b=b.next;
            }

            ListNode c=current;
            current=current.next;
            c.next=b.next;
            b.next=c;
        }
        return a.next;
    }
}
