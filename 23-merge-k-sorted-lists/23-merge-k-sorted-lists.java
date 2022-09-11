class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        return mergeKLists(lists, 0, lists.length - 1);
    }
    
    public ListNode mergeKLists(ListNode[] lists, int left, int right) {
        if (left > right) return null;
        if (left == right) return lists[left];
        int mid = left + (right - left) / 2; 
        ListNode leftN = mergeKLists(lists, left, mid);
        ListNode rightN = mergeKLists(lists, mid + 1, right);
        
        
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        
        while(leftN != null && rightN != null) {
            if(leftN.val <= rightN.val) {
                cur.next = leftN;
                leftN = leftN.next;
            } else {
                cur.next = rightN;
                rightN = rightN.next;
            }
            
            cur = cur.next;
        }
        
        if (leftN == null) cur.next = rightN;
        else if (rightN == null) cur.next = leftN;
        return newHead.next;
    }
}