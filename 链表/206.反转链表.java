package 链表;
/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newList = new ListNode();
        ListNode current = newList;
        while (head != null) {
            //current记录要插入的节点
            current = head;
            //head指向下一个 防止丢失链表
            head = head.next;
            //队current执行头插
            current.next = newList.next;
            newList.next = current;
        }
        return newList.next;
    }
}
// @lc code=end

