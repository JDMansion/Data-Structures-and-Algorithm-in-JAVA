/*class of the node of the DLL is as
class Node {
	int data;
    Node prev, next;
    Node(int item)
    {data = item;
        next = prev = null;
    }
}
*/
// function should insert a new node in sorted way in
// a sorted doubly linked list
class GfG
{
    public static Node sortedInsert(Node head, int x)
    {
        Node newNode = new Node(x);
        
        Node temp;
        
        if(head == null) {
            head = newNode;
        }
        
        else if(head.data > newNode.data) {
            newNode.next = head;
            newNode.next.prev = newNode;
            head = newNode;
        }
        
        else {
            temp = head;
            
            while(temp.next != null && temp.next.data < newNode.data) {
                temp = temp.next;
            }
            
            newNode.next = temp.next;
            
            if(newNode.next != null) {
                newNode.next.prev = newNode;
            }
            
            temp.next = newNode;
            newNode.prev = temp;
        }
        return head;
    }
}
