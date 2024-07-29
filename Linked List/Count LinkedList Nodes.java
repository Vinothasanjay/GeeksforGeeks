class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        int c=1;
        if(head==null){
            return 0;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            c=c+1;
        }
        return c;
    }
}
