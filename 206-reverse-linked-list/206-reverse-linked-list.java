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
       ListNode newhead = null;
        while(head!=null)
        {
            ListNode n=head.next;
            head.next=newhead;
            newhead=head;
            head=n;
        }
        return newhead;
    }
}