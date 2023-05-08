/*
class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution
{
    public static int nknode(Node head, int k)
    {
        if(k <= 0 || head == null) return 0;
        
        Node movenode = null;
        
        int i=0; 
        Node temp = head;
        while(temp != null) {
            if(i%k == 0) {
                if(movenode == null) {
                    movenode = head;
                }
                else {
                    movenode = movenode.next;
                }
            }
            i++;
            temp = temp.next;
        }
        return movenode.data;
    }
}
