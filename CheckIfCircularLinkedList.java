class GfG
{
    boolean isCircular(Node head)
    {
	   // if(head == null) return true;
	    
	   // Node pointer = head.next;
	    
	   // while(pointer != null || pointer != head) {
	   //     pointer = pointer.next;
	   // }
	    
	   // return (pointer == head);
	   
	   Node pointer = head;
	   while(pointer != null) {
	       pointer = pointer.next;
	       if(pointer == head) return true;
	   }
	   return false;
    }
}
