class Solution {
    // Function to check whether two linked lists are identical or not.
    public boolean areIdentical(Node head1, Node head2) {
        if(head1==null && head2==null){
            return true;
        }
        Node temp1=head1;
        Node temp2=head2;

        while(temp1!=null && temp2!=null){
            if(temp1.data!=temp2.data){
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        if(temp1==null && temp2==null){
            return true;
        }
        else{
            return false;
        }

        
    }
}
