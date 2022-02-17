class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        int temp = 0;
        
        while(l1 !=null || l2!=null) { 
            int x = (l1 != null) ? l1.val : 0;
        int y = (l2 != null) ? l2.val : 0;
           int add = x+y + temp;
            result.next = new ListNode(add%10);
            temp = add/10;
            result = result.next;
             if (l1 != null) l1 = l1.next;
             if (l2 != null) l2 = l2.next;
        }
        if (temp > 0) {
        result.next = new ListNode(temp);
    }
        return dummy.next;
    }
}