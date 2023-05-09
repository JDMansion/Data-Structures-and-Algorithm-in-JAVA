class Solution
{
    Node deleteNode(Node head, int x)
    {
	    if(head == null) return null;
	    
	    if(x == 1) return head.next;
	    
	    Node cur = head;
	    int i = 1;
	    while(i<x-1) {
	        cur = cur.next;
	        i++;
	    }
	    cur.next = cur.next.next;
	    return head;
    }
}
