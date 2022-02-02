class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode fin = new ListNode();
        fin.next = head;
        ListNode current = fin;
        
        while(current.next != null){
            if(current.next.val == val){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
        return fin.next;
    }
}