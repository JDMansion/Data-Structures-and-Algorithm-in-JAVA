class Soution
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	    Node temp = head;
	    Node ref = head;
	    
	    while(temp != null) {
	        Node current = temp.next;
	        
	        while(current != null && current.data == temp.data) {
	            current = current.next;
	        }
	        temp.next = current;
	        temp = current;
	    }
	    return ref;
    }
}
