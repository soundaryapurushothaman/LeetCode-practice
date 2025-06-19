class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        int size=0;
        ListNode start=head;

        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            size++;
        }
        slow=reverse(slow);
        for(int i=0;i<size;i++)
        {
            if(start.val!=slow.val)
            {
                return false;
            }
            start=start.next;
            slow=slow.next;
        }
        return true;
    }


        private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }
       
}
