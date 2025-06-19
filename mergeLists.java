class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode f=list1;
        ListNode s=list2;
        ListNode ans=new ListNode();
        while(f !=null && s!=null)
        {
            if(f.val<s.val)
            {
                insertlast(ans,f.val);
                f=f.next;
            }
            else
            {
                insertlast(ans,s.val);
                s=s.next;
            }
        }

        while(f!=null)
        {
           insertlast(ans,f.val);
            f=f.next;
        }
        while(s!=null)
        {
            insertlast(ans,s.val);
            s=s.next;
        }
    return ans.next;
    }
    public void insertlast(ListNode list, int value) {
    ListNode newnode = new ListNode(value);
    newnode.next = null;

    if (list == null) {
        list = newnode;
        return;
    }

    ListNode temp = list;
    while (temp.next != null) {
        temp = temp.next;
    }

    temp.next = newnode;
}

}
