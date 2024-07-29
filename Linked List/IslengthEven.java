class Solution {
    public boolean isLengthEven(Node head) {
        int c=0;
        if(head==null){
            return true;
        }
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            c=c+1;
        }
        if(c%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
