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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> temp = new PriorityQueue<>();
        for(ListNode x : lists){
            while(x != null){
                temp.add(x.val);
                x = x.next;
            }
        }
        //System.out.println(temp);
        ListNode dummy = new ListNode();
        ListNode temp2 = dummy;
        while(!temp.isEmpty()){
            ListNode temp3 = new ListNode(temp.poll());
            temp2.next=temp3;
            temp2=temp3;
            
        }
        return dummy.next;
        
    }
}