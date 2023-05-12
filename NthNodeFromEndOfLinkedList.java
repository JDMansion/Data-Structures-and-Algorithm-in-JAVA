class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
        
    	HashMap<Integer, Integer> map = new HashMap<>();
    	
    	Node temp = head;
    	int i = 1;
    	
    	while(temp != null) {
    	    map.put(i, temp.data);
    	    temp = temp.next;
    	    i++;
    	}
    	
    	if(n > i-1) return -1;
      
    	return map.get(i-n);
    }
}
