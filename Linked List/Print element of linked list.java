class Solution
{
    
    void display(Node head)
    {

        if(head==null){
            return ;
        }
        Node current = head;
        
     
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
            
        }
        
       System.out.println();
       
    }
}
