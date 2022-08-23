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
    public boolean isPalindrome(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        boolean flag=true;
        Stack<Integer> ans=new Stack<>();
        //System.out.println(count);
        for(int x=1;x<=count;x++){
            if(count%2!=0 && x==((count/2)+1))
            {
                
                temp=temp.next;
                continue;
            }
            else if(x<=count/2)
                ans.push(temp.val);
            else{
                int t=ans.peek();
                if(t==temp.val){
                    ans.pop();
                }
                else{
                    flag=false;
                    break;
                }
            }
        temp=temp.next;
        }
        return flag;
    }
}