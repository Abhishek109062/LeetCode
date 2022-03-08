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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode temp=head;
        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }
        temp=head;
        if(length==n)
            return head.next;
        else if(n>0 && n<length)
        {
            while(length-n>1)
            {
                length--;
                temp=temp.next;
                
            }
            temp.next=temp.next.next;
            return head;
            
        }
        else
        {
            while(length-1>0)
            {
                temp=temp.next;
                length--;
            }
            temp.next=null;
            return head;
            
        }
    }
}