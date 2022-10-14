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
    public ListNode deleteMiddle(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        
        int mid = len/2;
        if(mid == 0){
            head = head.next;
        }
        else{
            temp = head;
            while(mid-- > 1){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        return head;
        
    }
}