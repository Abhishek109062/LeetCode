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
    public int getDecimalValue(ListNode head) {
        int size=0;
        ListNode temp=head;
       while(temp!=null)
       {
           size++;
           temp=temp.next;
       }
        temp=head;
        int decimal=0;
        size--;
        while(temp!=null)
        {
            if(temp.val==1)
                decimal+=Math.pow(2,size);
            temp=temp.next;
            size--;
        }
        
        return decimal;
    }
}