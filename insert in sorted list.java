class Solution {
    Node sortedInsert(Node head, int x) {
       // Node temp=head;
        Node n=new Node(x);
        if(head==null || x<head.data){
            n.next=head;
            head=n;
            return head;
        }
        Node temp=head;
        while(temp.next!=null && temp.next.data<x){
            temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;
        return head;
}
}
