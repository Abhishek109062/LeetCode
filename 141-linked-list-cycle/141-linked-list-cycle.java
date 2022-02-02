/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode obj1=head;
        ListNode obj2=head;
        while(obj2.next!=null && obj2.next.next!=null)
        {
            obj1=obj1.next;
            obj2=obj2.next.next;
            if(obj1==obj2)
                return true;
        }
        return false;
    }
}