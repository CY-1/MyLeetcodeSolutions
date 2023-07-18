# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        my=ListNode()
        my.next=head
        head=my
        result=head
        while head!=None and head.next!=None and head.next.next!=None:
            a=head.next
            b=head.next.next
            a.next=b.next
            b.next=a
            head.next=b
            head=head.next.next
        return result.next
