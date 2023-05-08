/*node class of the linked list
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
   
    public static int getNth(Node node, int ind)
    {
       int count = 1;
       while(node != null) {
           if(count == ind) {
               return node.data;
           }
           count++;
           node = node.next;
       }
       return -1;
    }
}
