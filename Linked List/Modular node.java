class Solution {
    public int modularNode(Node head, int k) {
        
        if(head==null){
            return -1;
        }
        Node temp=head;
        int m=-1;
        int i=1;
        while(temp!=null){
            if(i%k==0){
                m=temp.data;
            }
            temp=temp.next;
            i++;
        }
        return m;
}
}
