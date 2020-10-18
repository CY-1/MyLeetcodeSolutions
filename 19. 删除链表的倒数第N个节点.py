# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if head.next==None:
            head=None
            return head
        p=head
        g=0
        while p!=None:
            g+=1
            p=p.next
        p=head
        x=g-n
        if x==0:
            return head.next
        while x>1:
            x-=1
            p=p.next
        p.next=p.next.next
        return head
