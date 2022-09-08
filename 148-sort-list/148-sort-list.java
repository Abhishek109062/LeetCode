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
    public ListNode sortList(ListNode head) {
        List<Integer> ans=new ArrayList<>();
        while(head!=null){
            ans.add(head.val);
            head=head.next;
        }
        Collections.sort(ans);
        ListNode dummy = new ListNode(0);
        ListNode temp=dummy;
        for(int x:ans){
            ListNode temp2=new ListNode(x);
            temp.next=temp2;
            temp=temp2;
        }
        return dummy.next;
    }
}