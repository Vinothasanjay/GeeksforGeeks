class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        Node x1=new Node(x);
        if(head==null){
            return x1;
        }
        
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=x1;
        x1.next=null;
        return head;
        
    }
}
