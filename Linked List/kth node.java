class Solution {
    public static int fractional_node(Node head, int k) {
        Node temp=head;
        int c=0;
        if(head==null){
            return -1;
        }
        while(temp!=null){
            c=c+1;
            temp=temp.next;
        }
       int d=(c+k-1)/k;
        temp=head;
        for(int i=0;i<d-1;i++){
            temp=temp.next;
        }
        return temp.data;
    }
}
