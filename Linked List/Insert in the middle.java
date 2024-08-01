class Solution {
    public Node insertInMiddle(Node head, int x) {
       Node n=new Node(x);
       if(head==null){
           return n;
       }
       Node temp=head;
       int c=0;
       while(temp.next!=null){
           c=c+1;
           temp=temp.next;
       }
       temp=head;
       c=(int)Math.ceil(c/2);
       for(int i=0;i<c;i++){
           temp=temp.next;
       }
       n.next=temp.next;
       temp.next=n;
       return head;
       
    }
}
