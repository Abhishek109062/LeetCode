class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        ListNode node = head;
        while(node != null){
            if(node.val > max){
                max = node.val;
            }
            if(node.val < min){
                min = node.val;
            }
            node = node.next;
        }
        int size = max - min + 1;
        int[] values = new int[size];
        node = head;
        while(node != null){
            values[node.val - min]++;
            node = node.next;
        }
        ListNode ans = new ListNode();
        ListNode curr = ans;
        for(int i = 0; i < size; i++){
            while(values[i] != 0){
                node = new ListNode(i + min);
                curr.next = node;
                curr = node;
                values[i]--;
            }
        }
        return ans.next;
    }
}