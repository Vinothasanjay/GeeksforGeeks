class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode n=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=n;
            n=head;
            head=temp;


        }
        return n;
    }
}
