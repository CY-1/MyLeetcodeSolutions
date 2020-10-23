/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> a=new ArrayList();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        for(int i=0;i<a.size()/2;i++){
            if(!a.get(i).equals(a.get(a.size()-1-i))){
                return false;
            }
        }
        return true;
    }
}
