class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr = head;
        ListNode temp;
        while(curr !=null){
            
            temp=curr.next;
            curr.next = prev;
            prev=curr;
            curr=temp;
        }
        head=prev;
        return head;
    }
}
